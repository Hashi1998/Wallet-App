/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hashini_lab;


public abstract class Wallet {
    public String walletId;
    public double balance;
    
    public Wallet(String walletId, double initialBalance) {
        this.walletId = walletId;
        this.balance = initialBalance;
    }
        
    public abstract void loadMoney(double amount);

    public abstract void spendMoney(double amount);

    public abstract void displayWalletInfo();
}
