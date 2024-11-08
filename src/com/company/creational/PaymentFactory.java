package com.company.creational;

public class PaymentFactory {
    public static Payment BuilderType(TypePayment typePyment){
        switch (typePyment) {
            case CARD -> {
                return new CardPayment();
            }
            case GOOGLE_PAY -> {
                return new GooglePayment();
            }
            default ->{
                new CardPayment();
            }
        }
        return null;
    }
}
