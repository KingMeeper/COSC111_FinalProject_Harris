/**
 * COSC111- Lab 2
 * 
 * @author: Colin Harris
 * @version: September 10, 2025
 * 
 * This program estimates tuition costs based on three factor: Residency, Enrollment Status, and Living Situation
 * 
*/

import java.util.Scanner;
public class Harris_lab2 {
   public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    System.out.println();
    System.out.println("Tuition Calculator");
    System.out.println();

    // Residency Status
    System.out.println("Enter your Residency Status");
    System.out.println("1. Resident");
    System.out.println("2. Non-resident");
    System.out.println("Your choice: ");
    int residency = kb.nextInt(); //stores the residency option the user enters
    System.out.println();
    
    //Enrollment Status
    System.out.println("Enter your Enrollment Status");
    System.out.println("1. Full-time");
    System.out.println("2. Part-time");
    System.out.println("Your choice: ");
    int enrollment = kb.nextInt(); //stores the enrollment option the user enters
    System.out.println();

    //Living Situation
    System.out.println("Enter your Living Situation");
    System.out.println("1. Commuter");
    System.out.println("2. Living on Campus");
    System.out.println("Your choice: ");
    int living = kb.nextInt(); //stores the living situation option the user enters 
    System.out.println();

    //Determine amount based on residency
    int local = 0;
    switch (residency) {
        case 1:
            local = 300;
            break;
        case 2:
            local = 550;
            break;
        default:
            System.out.println("Invalid Option"); //ensures that the user cannot input any other number other than a 1 or 2.
    }
    //Determine amount of credits
    int credits = 0;
    switch (enrollment) {
        case 1:
            credits = 12;
            break;
        case 2:
            credits = 6;
            break;
        default:
            System.out.println("Invalid Option"); //ensures that the user cannot input any other number other than a 1 or 2.
    }
    //Determine Living Status
    int housing = 0;
    switch (living) {
        case 1:
            housing = 0;
            break;
        case 2:
            housing = 4000;
            break;
        default:
            System.out.println("Invalid Option"); //ensures that the user cannot input any other number other than a 1 or 2.
    }
    // Calculate total
    double tuition = (local * credits) + housing;

    // Output results
    System.out.println();
    System.out.println("Residency: " + (residency == 1 ? "Resident" : "Non-Resident"));
    System.out.println("Enrollment Status: " + (enrollment == 1 ? "Full-time" : "Part-time"));
    System.out.println("Living Situation: " + (living == 1 ? "Commuter" : "Living on campus"));
    System.out.println();
    System.out.println("Total Tuition: " + tuition);

    kb.close();
    }
   }

/*Tuition Calculator

Enter your Residency Status
1. Resident
2. Non-resident
Your choice: 
2

Enter your Enrollment Status
1. Full-time
2. Part-time
Your choice: 
1

Enter your Living Situation
1. Commuter
2. Living on Campus
Your choice: 
2


Residency: Non-Resident
Enrollment Status: Full-time
Living Situation: Living on campus

Total Tuition: 10600.0 */