package com.demo;

public class CommunicationPreference {

    private boolean emailNotification;
    private boolean smsNotification;

    public CommunicationPreference(boolean emailNotification,
                                   boolean smsNotification){

        this.emailNotification=emailNotification;
        this.smsNotification=smsNotification;
    }

    public void display(){

        System.out.println("\nCommunication");

        System.out.println("Email : "+emailNotification);
        System.out.println("SMS : "+smsNotification);

    }

}
