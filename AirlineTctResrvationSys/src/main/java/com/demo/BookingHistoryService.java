package com.demo;

import java.time.LocalDate;
import java.util.*;

public class BookingHistoryService {

    ArrayList<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {

        bookings.add(booking);

    }

    // Display All Bookings
    public void displayAll() {

        bookings.forEach(Booking::displaySummary);

    }

    // Filter by Status
    public void filterStatus(String status) {

        bookings.stream()

                .filter(b -> b.getStatus().equalsIgnoreCase(status))

                .forEach(Booking::displaySummary);

    }

    // Filter by Date Range
    public void filterDate(LocalDate start,
                           LocalDate end) {

        bookings.stream()

                .filter(b ->

                        !b.getJourneyDate().isBefore(start)

                                &&

                                !b.getJourneyDate().isAfter(end))

                .forEach(Booking::displaySummary);

    }

    // Sort Newest First
    public void newestFirst() {

        bookings.stream()

                .sorted(Comparator.comparing(
                        Booking::getJourneyDate).reversed())

                .forEach(Booking::displaySummary);

    }

    // Sort Oldest First
    public void oldestFirst() {

        bookings.stream()

                .sorted(Comparator.comparing(
                        Booking::getJourneyDate))

                .forEach(Booking::displaySummary);

    }

    // View Details
    public void viewDetails(String pnr) {

        bookings.stream()

                .filter(b -> b.getPnr().equalsIgnoreCase(pnr))

                .findFirst()

                .ifPresent(Booking::displaySummary);

    }

    // Cancel Booking
    public void cancelBooking(String pnr) {

        bookings.stream()

                .filter(b -> b.getPnr().equalsIgnoreCase(pnr))

                .findFirst()

                .ifPresent(b -> {

                    b.setStatus("Cancelled");

                    System.out.println("Booking Cancelled");

                });

    }

    // Modify Booking
    public void modifyBooking(String pnr) {

        System.out.println("Booking " + pnr +
                " Modified Successfully.");

    }

    // Export PDF
    public void exportPDF() {

        System.out.println("Booking History exported to PDF.");

    }

    // Export Excel
    public void exportExcel() {

        System.out.println("Booking History exported to Excel.");

    }

}
