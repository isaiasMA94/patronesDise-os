package com.company.creational;

public class GooglePayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("pagando con googlepay");
    }
}
