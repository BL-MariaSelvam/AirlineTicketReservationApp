package com.demo;

public class UPIPayment implements Payment {

    private String upiId;
    private String provider;

    public UPIPayment(String upiId, String provider) {

        this.upiId = upiId;
        this.provider = provider;

    }

    @Override
    public boolean validate() {

        if (upiId.contains("@")) {

            System.out.println("UPI ID Verified");
            return true;

        }

        System.out.println("Invalid UPI ID");
        return false;

    }

    @Override
    public void process(double amount) {

        if (validate()) {

            System.out.println(provider + " Payment Successful");
            System.out.println("Amount Paid : $" + amount);

        }

    }

    @Override
    public void refund(double amount) {

        System.out.println("Refund of $" + amount +
                " sent through " + provider);

    }

}
