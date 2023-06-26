/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern;

import com.mycompany.decoratorpattern.components.Boisson;
import com.mycompany.decoratorpattern.components.ImplComponents.Colombia;
import com.mycompany.decoratorpattern.components.ImplComponents.Deca;
import com.mycompany.decoratorpattern.components.ImplComponents.Expresso;
import com.mycompany.decoratorpattern.components.ImplComponents.Sumatra;
import com.mycompany.decoratorpattern.decorator.Impls.Caramel;
import com.mycompany.decoratorpattern.decorator.Impls.Chantilly;
import com.mycompany.decoratorpattern.decorator.Impls.Chocolat;
import com.mycompany.decoratorpattern.decorator.Impls.Lait;

/**
 *
 * @author krohn
 */
public class StarBuzzCoffee {
    
    public static void main(String[] args) {
        Boisson boisson = new Expresso();
        System.out.println(boisson.getDescription()+ "$"+boisson.count());
        
        Boisson boisson1 = new Sumatra();
        boisson1 = new Chocolat(boisson1);
        boisson1 = new Lait(boisson1);
        boisson1 = new Chantilly(boisson1);
        System.out.println(boisson1.getDescription()+"$"+boisson1.count());
        
        Boisson boisson2 = new Colombia();
        boisson2 = new Lait(boisson2);
        boisson2 = new Chocolat(boisson2);
        boisson2 =  new Caramel(boisson2);
        System.out.println(boisson2.getDescription()+"$"+boisson2.count());
        
        
        Boisson boisson3 = new Deca();
        boisson3 = new Caramel(boisson3);
        boisson3 = new Chantilly(boisson3);
        boisson3 = new Chocolat(boisson3);
        boisson3 = new Lait(boisson3);
        System.out.println(boisson3.getDescription()+"$"+boisson3.count());
        
        System.out.println(boisson.toString());
        System.out.println(boisson1.toString());
        System.out.println(boisson2.toString());
        System.out.println(boisson3.toString());
    }
    
}
