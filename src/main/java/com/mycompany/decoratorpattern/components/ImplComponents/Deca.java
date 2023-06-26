/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern.components.ImplComponents;

import com.mycompany.decoratorpattern.components.Boisson;

/**
 *
 * @author krohn
 */
public class Deca extends Boisson {

    public Deca() {
        description = "Deca  Boisson";
    }
    
    

    @Override
    public double count() {
        return 2.50;
    }
    
}
