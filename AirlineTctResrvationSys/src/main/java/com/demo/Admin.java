package com.demo;

public class Admin extends User {

    public Admin(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void accessFeatures() {

        System.out.println("\nRole : Admin");

        System.out.println("✔ Manage Users");
        System.out.println("✔ Manage Flights");
        System.out.println("✔ View All Bookings");
        System.out.println("✔ Cancel Any Booking");
        System.out.println("✔ Delete Users");
        System.out.println("✔ Full System Access");

    }

}