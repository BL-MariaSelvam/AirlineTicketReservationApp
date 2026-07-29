package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FlightService service = new FlightService();

        System.out.println("===== FLIGHT INFORMATION =====");

        System.out.print("Source : ");
        String source = sc.nextLine();

        System.out.print("Destination : ");
        String destination = sc.nextLine();

        service.search(source,destination);

    }

}