package com.demo;

public class PaymentService {

    public void makePayment(Payment payment,
                            double amount) {

        payment.process(amount);

    }

    public void refundPayment(Payment payment,
                              double amount) {

        payment.refund(amount);

    }

}
