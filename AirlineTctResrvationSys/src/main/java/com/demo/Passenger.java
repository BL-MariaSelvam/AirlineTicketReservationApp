package com.demo;

public class Passenger {

    private String name;
    private String relation;

    public Passenger(String name,String relation){

        this.name=name;
        this.relation=relation;
    }

    public void display(){

        System.out.println(name+" ("+relation+")");
    }

}
