package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BookingHistoryService service =
                new BookingHistoryService();

        service.addBooking(

                new Booking("PNR101","AI101",
                        "Chennai","Delhi",
                        LocalDate.of(2026,8,15),
                        "Upcoming",250));

        service.addBooking(

                new Booking("PNR102","6E220",
                        "Delhi","Mumbai",
                        LocalDate.of(2026,5,20),
                        "Past",180));

        service.addBooking(

                new Booking("PNR103","UK550",
                        "Mumbai","Dubai",
                        LocalDate.of(2026,7,10),
                        "Cancelled",320));

        System.out.println("All Bookings");
        service.displayAll();

        System.out.println("\nUpcoming Bookings");
        service.filterStatus("Upcoming");

        System.out.println("\nBookings between dates");
        service.filterDate(

                LocalDate.of(2026,7,1),

                LocalDate.of(2026,8,31));

        System.out.println("\nNewest First");
        service.newestFirst();

        System.out.println("\nOldest First");
        service.oldestFirst();

        System.out.println("\nView Details");
        service.viewDetails("PNR101");

        System.out.println("\nCancel Booking");
        service.cancelBooking("PNR101");

        System.out.println("\nModify Booking");
        service.modifyBooking("PNR102");

        System.out.println("\nExport");
        service.exportPDF();
        service.exportExcel();

    }

}