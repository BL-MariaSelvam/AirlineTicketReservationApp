package com.demo;

import java.util.Scanner;

public class ProfileService {

    Scanner sc=new Scanner(System.in);

    UserProfile profile;

    public void createProfile(){

        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Email: ");
        String email=sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone=sc.nextLine();

        profile=new UserProfile(name,email,phone);

        System.out.println("Profile Created.");
    }

    public void updateContact(){

        System.out.print("New Phone: ");
        String phone=sc.nextLine();

        System.out.print("New Email: ");
        String email=sc.nextLine();

        profile.updateContact(phone,email);

        System.out.println("Updated Successfully.");
    }

    public void addPassport(){

        System.out.print("Passport No: ");
        String no=sc.nextLine();

        System.out.print("Nationality: ");
        String nation=sc.nextLine();

        System.out.print("Expiry Date: ");
        String exp=sc.nextLine();

        profile.setPassport(new Passport(no,nation,exp));

    }

    public void addPassenger(){

        System.out.print("Passenger Name: ");
        String name=sc.nextLine();

        System.out.print("Relation: ");
        String relation=sc.nextLine();

        profile.addPassenger(new Passenger(name,relation));

    }

    public void addPreference(){

        System.out.print("Meal: ");
        String meal=sc.nextLine();

        System.out.print("Seat: ");
        String seat=sc.nextLine();

        System.out.print("Special Assistance: ");
        String help=sc.nextLine();

        profile.setPreference(new TravelPreference(meal,seat,help));

    }

    public void communication(){

        System.out.print("Email Notification(true/false): ");
        boolean email=sc.nextBoolean();

        System.out.print("SMS Notification(true/false): ");
        boolean sms=sc.nextBoolean();
        sc.nextLine();

        profile.setCommunication(new CommunicationPreference(email,sms));

    }

    public void emergency(){

        System.out.print("Name: ");
        String name=sc.nextLine();

        System.out.print("Relation: ");
        String relation=sc.nextLine();

        System.out.print("Phone: ");
        String phone=sc.nextLine();

        profile.setEmergencyContact(
                new EmergencyContact(name,relation,phone));

    }

    public void bookingHistory(){

        System.out.print("Booking Details: ");

        String booking=sc.nextLine();

        profile.addBooking(booking);

    }

    public void display(){

        profile.displayProfile();

    }

}
