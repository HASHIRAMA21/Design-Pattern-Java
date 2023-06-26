/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern.decorator;

import com.mycompany.decoratorpattern.components.Boisson;

/**
 *
 * @author krohn
 */
public abstract class IngredientDecorator extends Boisson {
    
    public abstract String getDescription();
    
}
