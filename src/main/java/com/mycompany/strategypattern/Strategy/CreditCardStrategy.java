/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategypattern.Strategy;

import com.mycompany.strategypattern.IPaymentStrategy;
import java.util.Date;

/**
 *
 * @author krohn
 */
public class CreditCardStrategy implements IPaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private Date dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, Date dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public String toString() {
        return "CreditCardStrategy{" + "name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateOfExpiry=" + dateOfExpiry + '}';
    }

    @Override
    public int pay(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void creditCardStrategy(String name,String cardNumber,String cvv,Date dateOfExpiry){
        
    }
    
    
    
    
}
