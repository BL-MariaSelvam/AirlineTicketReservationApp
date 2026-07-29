package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserService service = new UserService();

        while (true) {

            System.out.println("\n===== USER MANAGEMENT =====");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Reset Password");
            System.out.println("4.Update Profile");
            System.out.println("5.Deactivate Account");
            System.out.println("6.Exit");

            java.util.Scanner sc = new java.util.Scanner(System.in);

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    service.registerUser();
                    break;

                case 2:
                    service.login();
                    break;

                case 3:
                    service.resetPassword();
                    break;

                case 4:
                    service.updateProfile();
                    break;

                case 5:
                    service.deactivateAccount();
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}