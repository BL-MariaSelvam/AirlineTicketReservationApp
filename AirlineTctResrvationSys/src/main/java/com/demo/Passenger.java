package com.demo;

public class Passenger extends User {

    public Passenger(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void accessFeatures() {

        System.out.println("\nRole : Passenger");

        System.out.println("✔ Search Flights");
        System.out.println("✔ Book Flight");
        System.out.println("✔ Cancel Own Booking");
        System.out.println("✔ View Own Booking");

        System.out.println("✘ Cannot Manage Flights");
        System.out.println("✘ Cannot Manage Users");

    }
}