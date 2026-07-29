package com.demo;

import java.util.ArrayList;

public class UserProfile {

    private String name;
    private String email;
    private String phone;
    private Passport passport;
    private TravelPreference preference;
    private CommunicationPreference communication;
    private EmergencyContact emergencyContact;

    private ArrayList<String> bookingHistory;
    private ArrayList<Passenger> passengers;

    public UserProfile(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;

        bookingHistory = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    // Getters
    public String getEmail() {
        return email;
    }

    // Booking History
    public void addBooking(String booking) {
        bookingHistory.add(booking);
    }

    // Update Contact
    public void updateContact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    // Passport
    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    // Travel Preference
    public void setPreference(TravelPreference preference) {
        this.preference = preference;
    }

    // Communication
    public void setCommunication(CommunicationPreference communication) {
        this.communication = communication;
    }

    // Emergency Contact
    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    // Family Members
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Display Profile
    public void displayProfile() {

        System.out.println("\n===== USER PROFILE =====");

        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);

        if(passport!=null)
            passport.display();

        if(preference!=null)
            preference.display();

        if(communication!=null)
            communication.display();

        if(emergencyContact!=null)
            emergencyContact.display();

        System.out.println("\nBooking History");

        for(String b : bookingHistory)
            System.out.println(b);

        System.out.println("\nSaved Passengers");

        for(Passenger p : passengers)
            p.display();
    }
}
