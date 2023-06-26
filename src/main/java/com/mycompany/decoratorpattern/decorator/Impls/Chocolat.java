/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern.decorator.Impls;

import com.mycompany.decoratorpattern.components.Boisson;
import com.mycompany.decoratorpattern.decorator.IngredientDecorator;

/**
 *
 * @author krohn
 */
public class Chocolat extends IngredientDecorator {

    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }
    
    
    @Override
    public String getDescription() {
        return boisson.getDescription() +",Chocolat ,";
    }

    @Override
    public double count() {
        return 0.20 + boisson.count();
    }
    
}
