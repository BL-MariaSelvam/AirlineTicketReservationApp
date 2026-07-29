package com.demo;

public class Passport {

    private String passportNo;
    private String nationality;
    private String expiryDate;

    public Passport(String passportNo,String nationality,String expiryDate){

        this.passportNo=passportNo;
        this.nationality=nationality;
        this.expiryDate=expiryDate;
    }

    public void display(){

        System.out.println("\nPassport Details");

        System.out.println("Passport No : "+passportNo);
        System.out.println("Nationality : "+nationality);
        System.out.println("Expiry Date : "+expiryDate);
    }

}
