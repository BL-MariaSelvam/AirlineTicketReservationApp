package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PaymentService service =
                new PaymentService();

        Payment upi =
                new UPIPayment(
                        "john@oksbi",
                        "Google Pay");

        Payment card =
                new CardPayment(
                        "1234567890123456",
                        "Credit");

        Payment emi =
                new EMIPayment(
                        "9876543210123456",
                        6);

        System.out.println("\nUPI Payment");
        service.makePayment(upi,250);

        System.out.println("\nCard Payment");
        service.makePayment(card,500);

        System.out.println("\nEMI Payment");
        service.makePayment(emi,1200);

        System.out.println("\nRefund");

        service.refundPayment(card,500);

    }


}