/**
 * COSC 111 - Lab 0
 * 
 * @author: Colin Harris
 * @version: Fall 2025
 * 
 * This program will calculate how much change someone has in their pocket
 * It will prompt the user for input, perform some calculations, and output the result.
 */

import java.util.Scanner;
public class Colin_Lab0 {
    public static void main(String[] args) {
        // Variable declarations
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        Scanner kb = new Scanner(System.in);

        //Prompt the user for quarters
        System.out.print("Enter quarters: ");
        quarters = kb.nextInt();

        //Prompt the user for dimes
        System.out.print("Enter dimes: ");
        dimes = kb.nextInt();

        //Prompt the user for nickels
        System.out.print("Enter nickels: ");
        nickels = kb.nextInt();

        //Prompt the user for pennies
        System.out.print("Enter pennies: ");
        pennies = kb.nextInt();

        //Calculate the total value in cents
        int total = 0 ;
        total = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 1);

        //Print the result
        System.out.print("Total value of change; " + total + " cents");

        kb.close();
    }

}