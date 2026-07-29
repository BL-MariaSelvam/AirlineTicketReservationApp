package com.demo;

public class EMIPayment implements Payment {

    private String cardNumber;
    private int months;

    public EMIPayment(String cardNumber, int months) {

        this.cardNumber = cardNumber;
        this.months = months;

    }

    @Override
    public boolean validate() {

        if (cardNumber.length() == 16 &&
                (months == 3 || months == 6 ||
                        months == 9 || months == 12)) {

            System.out.println("EMI Eligible");
            return true;

        }

        System.out.println("EMI Not Available");

        return false;

    }

    @Override
    public void process(double amount) {

        if (validate()) {

            double emi = amount / months;

            System.out.println("EMI Payment Activated");

            System.out.println("Total Amount : $" + amount);

            System.out.println("Monthly EMI : $" + emi);

        }

    }

    @Override
    public void refund(double amount) {

        System.out.println("Refund of $" + amount +
                " initiated to EMI Card");

    }

}
