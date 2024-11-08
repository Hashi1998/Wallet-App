/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hashini_lab;

import java.util.Random;
public class ExchangeRateProviderImpl implements ExchangeRateProvider{
    private final Random random = new Random();

    @Override
    public double getRate(String fromCurrency, String toCurrency) {
        return 0.5 + (random.nextDouble() * 0.5);
    }
    
}
