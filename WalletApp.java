/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hashini_lab;

public class WalletApp {

    public static void main(String[] args) {
        WalletImpl myWallet = new WalletImpl("Wall001", 3000.0);
        
        myWallet.displayWalletInfo();
        
        myWallet.loadMoney(500.0);
        myWallet.displayWalletInfo();

       
        myWallet.spendMoney(300.0);
        myWallet.displayWalletInfo();

        
        ExchangeRateProvider provider = new ExchangeRateProviderImpl();
        myWallet.convertFunds(20.0, "USD", "JPY", provider);

        
        myWallet.displayWalletInfo();
    }
}
