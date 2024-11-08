/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hashini_lab;


public class WalletImpl extends Wallet{

    public WalletImpl(String walletId, double initialBalance) {
        super(walletId, initialBalance);
    }

    @Override
    public void loadMoney(double amount) {
       balance += amount;
       System.out.println(amount + " added");
    }

    @Override
    public void spendMoney(double amount) {
        balance -= amount;
        System.out.println(amount + " Spent");
    }

    @Override
    public void displayWalletInfo() {
        System.out.println("Balance: " + balance);
    }
    
    public void convertFunds(double amount, String fromCurrency, String toCurrency, ExchangeRateProvider provider) {
        
        double rate = provider.getRate(fromCurrency, toCurrency);
        double convertedAmount = amount * rate;
        System.out.println("Converted " + amount + " " + fromCurrency + " to " + convertedAmount + " " + toCurrency + " at rate: " + rate);
        
    }
}
