package com.demo;

public class NotificationService {

    public static void sendEmail(String bookingNo) {

        System.out.println("Email Sent for Booking : "
                + bookingNo);

    }

    public static void sendSMS(String bookingNo) {

        System.out.println("SMS Sent for Booking : "
                + bookingNo);

    }

}
