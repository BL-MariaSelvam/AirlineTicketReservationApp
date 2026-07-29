package com.demo;
import java.util.Random;

public class OTPService {

    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    public static boolean verifyOTP(String generatedOTP, String enteredOTP) {
        return generatedOTP.equals(enteredOTP);
    }
}