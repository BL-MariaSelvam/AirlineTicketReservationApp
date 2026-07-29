package com.demo;

public class AirlineStaff extends User {

    public AirlineStaff(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void accessFeatures() {

        System.out.println("\nRole : Airline Staff");

        System.out.println("✔ Manage Flights");
        System.out.println("✔ View All Bookings");

        System.out.println("✘ Cannot Delete Users");
        System.out.println("✘ Cannot Manage Admin");

    }

}