package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FlightService service = new FlightService();

        while(true){

            System.out.println("\n===== FLIGHT SEARCH =====");

            System.out.println("1.Search Flight");
            System.out.println("2.Filter Departure Date");
            System.out.println("3.Filter Return Date");
            System.out.println("4.Filter Airline");
            System.out.println("5.Filter Travel Class");
            System.out.println("6.Filter Stops");
            System.out.println("7.Filter Price Range");
            System.out.println("8.Sort Price Low-High");
            System.out.println("9.Sort Price High-Low");
            System.out.println("10.Sort Duration");
            System.out.println("11.Sort Departure Time");
            System.out.println("12.Sort Arrival Time");
            System.out.println("13.Exit");

            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Source : ");
                    String s=sc.nextLine();

                    System.out.print("Destination : ");
                    String d=sc.nextLine();

                    service.search(s,d);
                    break;

                case 2:
                    System.out.print("Departure Date : ");
                    service.departureDate(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Return Date : ");
                    service.returnDate(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Airline : ");
                    service.airline(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Travel Class : ");
                    service.travelClass(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Stops : ");
                    service.stops(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Minimum Price : ");
                    double min=sc.nextDouble();

                    System.out.print("Maximum Price : ");
                    double max=sc.nextDouble();

                    service.priceRange(min,max);
                    break;

                case 8:
                    service.sortPriceAscending();
                    break;

                case 9:
                    service.sortPriceDescending();
                    break;

                case 10:
                    service.sortDuration();
                    break;

                case 11:
                    service.sortDeparture();
                    break;

                case 12:
                    service.sortArrival();
                    break;

                case 13:
                    System.exit(0);
            }

        }

    }

}