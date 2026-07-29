package com.demo;

public class CardPayment implements Payment {

    private String cardNumber;
    private String cardType;

    public CardPayment(String cardNumber, String cardType) {

        this.cardNumber = cardNumber;
        this.cardType = cardType;

    }

    @Override
    public boolean validate() {

        if (cardNumber.length() == 16) {

            System.out.println(cardType + " Card Valid");
            return true;

        }

        System.out.println("Invalid Card");

        return false;

    }

    @Override
    public void process(double amount) {

        if (validate()) {

            System.out.println(cardType + " Payment Successful");

            System.out.println("Amount Paid : $" + amount);

        }

    }

    @Override
    public void refund(double amount) {

        System.out.println("Refund of $" + amount +
                " credited to Card");

    }

}
