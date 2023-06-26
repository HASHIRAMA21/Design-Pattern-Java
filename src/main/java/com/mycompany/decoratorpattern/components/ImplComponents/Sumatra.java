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
public class Sumatra extends Boisson {

    public Sumatra() {
        description  = "Sumatra Boisson";
    }

    @Override
    public double count() {
        return 3.50;
    }
    
}
