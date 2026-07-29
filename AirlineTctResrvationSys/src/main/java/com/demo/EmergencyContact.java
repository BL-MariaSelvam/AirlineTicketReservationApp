package com.demo;

public class EmergencyContact {

    private String name;
    private String relation;
    private String phone;

    public EmergencyContact(String name,
                            String relation,
                            String phone){

        this.name=name;
        this.relation=relation;
        this.phone=phone;
    }

    public void display(){

        System.out.println("\nEmergency Contact");

        System.out.println("Name : "+name);
        System.out.println("Relation : "+relation);
        System.out.println("Phone : "+phone);

    }

}