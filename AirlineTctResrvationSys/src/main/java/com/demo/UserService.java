package com.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    ArrayList<User> users = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Registration
    public void registerUser() {

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Phone:");
        String phone = sc.nextLine();

        System.out.println("Enter DOB (yyyy-mm-dd):");
        LocalDate dob = LocalDate.parse(sc.nextLine());

        System.out.println("Enter Passport ID:");
        String passport = sc.nextLine();

        System.out.println("Enter Password:");
        String password = PasswordUtil.encryptPassword(sc.nextLine());

        System.out.println("Select Role");
        System.out.println("1.Passenger");
        System.out.println("2.Admin");
        System.out.println("3.Airline Staff");

        int choice = Integer.parseInt(sc.nextLine());

        String role = "";

        switch(choice){
            case 1: role="Passenger"; break;
            case 2: role="Admin"; break;
            case 3: role="Airline Staff"; break;
        }

        String otp = OTPService.generateOTP();

        System.out.println("OTP Sent: " + otp);

        System.out.println("Enter OTP:");
        String entered = sc.nextLine();

        if(OTPService.verifyOTP(otp, entered)){

            User user = new User(name,email,phone,dob,passport,password,role);

            users.add(user);

            System.out.println("Registration Successful");

        }else{

            System.out.println("OTP Verification Failed");

        }

    }

    // Login
    public void login(){

        System.out.println("Email:");
        String email=sc.nextLine();

        System.out.println("Password:");
        String pass=PasswordUtil.encryptPassword(sc.nextLine());

        for(User u:users){

            if(u.getEmail().equals(email)
                    && u.getPassword().equals(pass)
                    && u.isActive()){

                String otp=OTPService.generateOTP();

                System.out.println("MFA OTP:"+otp);

                System.out.println("Enter OTP:");
                String entered=sc.nextLine();

                if(OTPService.verifyOTP(otp,entered)){

                    System.out.println("Login Success");

                    System.out.println("Welcome "+u.getRole());

                    System.out.println("Remember Me? (yes/no)");

                    String ans=sc.nextLine();

                    if(ans.equalsIgnoreCase("yes")){

                        u.setRememberMe(true);

                    }

                }else{

                    System.out.println("OTP Failed");

                }

                return;
            }
        }

        System.out.println("Invalid Login");
    }

    // Password Reset
    public void resetPassword(){

        System.out.println("Enter Email:");

        String email=sc.nextLine();

        for(User u:users){

            if(u.getEmail().equals(email)){

                String otp=OTPService.generateOTP();

                System.out.println("OTP:"+otp);

                System.out.println("Enter OTP:");

                String entered=sc.nextLine();

                if(OTPService.verifyOTP(otp,entered)){

                    System.out.println("New Password:");

                    String pass=PasswordUtil.encryptPassword(sc.nextLine());

                    u.setPassword(pass);

                    System.out.println("Password Updated");

                }

                return;
            }
        }

        System.out.println("User Not Found");

    }

    // Update Profile
    public void updateProfile(){

        System.out.println("Enter Email:");

        String email=sc.nextLine();

        for(User u:users){

            if(u.getEmail().equals(email)){

                System.out.println("New Name:");

                String name=sc.nextLine();

                System.out.println("New Phone:");

                String phone=sc.nextLine();

                u.updateProfile(name,phone);

                System.out.println("Profile Updated");

                return;

            }

        }

    }

    // Delete Account
    public void deactivateAccount(){

        System.out.println("Enter Email:");

        String email=sc.nextLine();

        for(User u:users){

            if(u.getEmail().equals(email)){

                u.deactivate();

                System.out.println("Account Deactivated");

                return;

            }

        }

    }

}
