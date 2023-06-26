/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern.components;

/**
 *
 * @author krohn
 */
public abstract class Boisson {
    public String description = "Boissoon Inconnue";

    public String getDescription() {
        return description;
    }

    public abstract double count();

    
}
