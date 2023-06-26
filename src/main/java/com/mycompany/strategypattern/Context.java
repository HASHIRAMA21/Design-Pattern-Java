/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategypattern;

import com.mycompany.strategypattern.Strategy.PayPalStrategy;

/**
 *
 * @author krohn
 */
public class Context {
    
    int amount;
    
    private IPaymentStrategy strategy ;

    public Context(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void appliquerStrategy(){
        strategy.pay(amount);
    }

    public void setStrategy(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
}
