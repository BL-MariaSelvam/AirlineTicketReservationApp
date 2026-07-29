package com.demo;
import java.util.ArrayList;

public class Passenger {

    private String name;
    private String email;
    private String phone;

    public Passenger(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }
}