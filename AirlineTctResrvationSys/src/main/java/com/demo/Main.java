package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        User passenger = new Passenger(
                101,
                "John",
                "john@gmail.com");

        User admin = new Admin(
                1,
                "System Admin",
                "admin@gmail.com");

        User staff = new AirlineStaff(
                201,
                "David",
                "staff@gmail.com");

        // Polymorphism
        User users[] = { passenger, admin, staff };

        for(User user : users){

            user.displayProfile();

            user.accessFeatures();

            System.out.println("-------------------------");
        }

        System.out.println("\nAccess Validation");

        AccessValidator.validate(admin,"Manage Users");

        AccessValidator.validate(staff,"Manage Flights");

        AccessValidator.validate(passenger,"Own Booking");

        AccessValidator.validate(passenger,"Manage Flights");

    }

}