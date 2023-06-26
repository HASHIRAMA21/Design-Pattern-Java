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
public class Lait extends IngredientDecorator {
    
    Boisson boisson;

    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }
    

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Lait ,";
    }

    @Override
    public double count() {
        return boisson.count() + 0.50;
    }
    
}
