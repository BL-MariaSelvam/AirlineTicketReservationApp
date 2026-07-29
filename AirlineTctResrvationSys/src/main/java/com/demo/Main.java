package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Booking booking = new Booking();

        int choice;

        do {

            System.out.println("\n===== PASSENGER MANAGEMENT =====");

            System.out.println("1. Add Passenger");
            System.out.println("2. View Passenger List");
            System.out.println("3. Exit");

            System.out.print("Choice : ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice) {

                case 1:
                    booking.addPassengers();
                    break;

                case 2:
                    booking.showBookingPassengers();
                    break;

                case 3:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);

    }
}