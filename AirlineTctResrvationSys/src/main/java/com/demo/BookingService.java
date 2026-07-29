package com.demo;

import java.util.ArrayList;

public class BookingService {

    ArrayList<Booking> bookings=new ArrayList<>();

    public void addBooking(Booking booking){

        bookings.add(booking);

    }

    // Search by PNR
    public void searchPNR(String pnr){

        for(Booking b:bookings){

            if(b.getPNR().equalsIgnoreCase(pnr)){

                b.display();

                return;
            }
        }

        System.out.println("Booking Not Found");

    }

    // Search by Email
    public void searchEmail(String email){

        for(Booking b:bookings){

            for(Passenger p:b.getPassengers()){

                if(p.getEmail().equalsIgnoreCase(email)){

                    b.display();

                    return;
                }

            }

        }

        System.out.println("Booking Not Found");

    }

    // Search by Phone
    public void searchPhone(String phone){

        for(Booking b:bookings){

            for(Passenger p:b.getPassengers()){

                if(p.getPhone().equals(phone)){

                    b.display();

                    return;
                }

            }

        }

        System.out.println("Booking Not Found");

    }

    // Search by Ticket
    public void searchTicket(String ticket){

        for(Booking b:bookings){

            if(b.getTicketNo().equalsIgnoreCase(ticket)){

                b.display();

                return;
            }

        }

        System.out.println("Booking Not Found");

    }

    // Download Ticket
    public void downloadTicket(String ticket){

        System.out.println("Generating PDF...");

        System.out.println("E-Ticket Downloaded Successfully.");

    }

}
