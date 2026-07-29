package com.demo;

public class AccessValidator {

    public static void validate(User user, String feature) {

        if(user instanceof Admin){

            System.out.println("Access Granted for Admin");

        }

        else if(user instanceof AirlineStaff){

            if(feature.equalsIgnoreCase("Manage Flights")
                    || feature.equalsIgnoreCase("View Bookings")){

                System.out.println("Access Granted");

            }else{

                System.out.println("Access Denied");

            }

        }

        else if(user instanceof Passenger){

            if(feature.equalsIgnoreCase("Own Booking")){

                System.out.println("Access Granted");

            }else{

                System.out.println("Access Denied");

            }

        }

    }

}
