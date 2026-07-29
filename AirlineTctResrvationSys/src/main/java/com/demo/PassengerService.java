package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class PassengerService {

    ArrayList<Passenger> passengers = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void addPassenger() {

        System.out.print("Passenger Name : ");
        String name = sc.nextLine();

        System.out.print("Age : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Gender : ");
        String gender = sc.nextLine();

        System.out.print("ID Proof Number : ");
        String id = sc.nextLine();

        System.out.print("Email : ");
        String email = sc.nextLine();

        System.out.print("Phone : ");
        String phone = sc.nextLine();

        System.out.print("Meal Preference : ");
        String meal = sc.nextLine();

        System.out.print("Special Assistance : ");
        String assistance = sc.nextLine();

        System.out.print("Frequent Flyer Number : ");
        String flyer = sc.nextLine();

        System.out.print("Existing Profile (true/false): ");
        boolean profile = Boolean.parseBoolean(sc.nextLine());

        Passenger passenger = new Passenger(
                name, age, gender,
                id, email,
                phone, meal,
                assistance,
                flyer,
                profile);

        if(passenger.validatePassenger()) {

            passengers.add(passenger);

            System.out.println("Passenger Added Successfully");

        } else {

            System.out.println("Mandatory Fields Missing");

        }
    }

    public void displayPassengers() {

        System.out.println("\nPassenger List");

        for(Passenger p : passengers) {

            p.display();

        }
    }

    public int totalPassengers() {

        return passengers.size();

    }

}
