package com.demo;
import java.time.LocalDate;

public abstract class User {

    protected int userId;
    protected String name;
    protected String email;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public void displayProfile() {
        System.out.println("\nUser ID : " + userId);
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
    }

    // Abstract Method
    public abstract void accessFeatures();
}