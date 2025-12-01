/*
 * COSC 111- Lab 6
 * 
 * @author- Colin Harris
 * @version- October 22, 2025
 * 
 * This program simulates an ATM.
 * It lets you make a deposit, withdrawl, check your balance, and exit the ATM.
 * 
 * printMenu() prints the menu options for the user
 * formatCents() is the identifier for the method
 * @param cents is an integer representing the number of cents needed to be formatted (e.g. 1205 -> $12.05)
 * @return formatted is the String representation of the cents provided
 * 
 * 
 */
import java.util.Scanner;
public class Harris_Lab6 {


    static void printMenu(){
        System.out.println("");
        System.out.println("Welcome to COSC ATM");
        System.out.println("");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawl");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public static String formatCents(int cents){
        //Calculate dollar amount of cents provided
        int dollars = cents / 100;
        int remainingCents = Math.abs(cents % 100);
        //Build formatted String to include the dollar representation of the cents given (e.g. $12.05)
        String formatted = String.format("$%d.%02d", dollars, remainingCents);
        return formatted;
    }

    /*
     * deposit(int balanceCents, int amountCents)
     * @param balanceCents - the amount in the user's account prior to the deposit
     * @param amountCents - the amount the user wants to deposit
     * @return updatedBalance - in cents
     */
    public static int deposit(int balanceCents, int amountCents){
        int updatedBalance = balanceCents;
        //Ensure that it is a positive value
        if (amountCents < 0) {
            //Let the user know the amount must be positive
            System.out.println("Cannot deposit a negative amount!");
        } else {
            //If so, add that amount to the balanceCents
            updatedBalance += amountCents;
            System.out.println("Deposited " + formatCents(amountCents) + ". New balance: " + formatCents(updatedBalance));
        }
        return updatedBalance;
    }

    /* withdraw(int balanceCents, int amountCents) allows user to withdraw from their account
     * @param balanceCents - the amount in the user's account prior to the deposit
     * @param amountCents - the amount the user wants to deposit
     * @return updatedBalance - in cents
     */
    static int withdraw(int balanceCents, int amountCents){
        //Ensure it is positve
        int updatedBalance = balanceCents;
        if (amountCents <= 0){
            System.out.println("Must withdraw at least $0.01");
        } else if (amountCents > updatedBalance){
            System.out.println("Insufficient funds. Current Balance: " + formatCents(balanceCents));
        } else {
            updatedBalance -= amountCents;
            System.out.println("Withdrew " + formatCents(amountCents) + ". New balance: " + formatCents(updatedBalance));
        }
        return updatedBalance;
    }
    /*
     * readMenuChoice(Scanner kb) reads menu choice and validates that it is between 1 and 4
     * @param kb - Scanner used to read choice
     * @return validChoice
     */
    static int readMenuChoice(Scanner kb){
        int validChoice = 0;
        System.out.print("Choose 1-4: ");
        while (true) {
            if (kb.hasNextInt()){
                validChoice = kb.nextInt();
                if (validChoice >= 1 && validChoice <= 4) {
                    break;
                } else {
                    System.out.println("Invalid Choice.");
            } 
            } else {
                kb.next();
                System.out.println("Invalid Choice.");
            }
    }
        return validChoice;

    }
    /*
     * readAmountCents(Scanner kb, String prompt)- validates amount entered by user (must be positive)
     * coverts amounts to cents, reprompts if valid
     * @param kb - Scanner to read input
     * @param prompt - What the user will be asked
     * @return validCents
     */
    static int readAmountCents(Scanner kb, String prompt){
        int validCents = 0;
        while (true) {
            System.out.print(prompt);
            if (kb.hasNextDouble()){
                double amount = kb.nextDouble();
                if (amount >= 0) {
                    validCents = (int) Math.round(amount * 100);
                    break;
                } else {
                    System.out.println("Amount cannot be negative.");
                } 
            } else {
                kb.next();
                System.out.println("Invalid Characters. Please put in a numeric value!");
            }
        }
        return validCents;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int choice = 0;
        int balanceCents = 0; //Single account starting at $0.00

        do {
            printMenu();
            choice = readMenuChoice(kb);
            if (choice == 1){
                int amount = readAmountCents(kb, "Enter deposit amount in dollars (e.g., 25.75): ");
                balanceCents = deposit(balanceCents, amount);
            } else if (choice == 2) {
                int amount = readAmountCents(kb, "Enter withdrawl amount in dollars (e.g., 10.00): ");
                balanceCents = withdraw(balanceCents, amount);
            } else if (choice == 3) {
                System.out.println("Current balance: " + formatCents(balanceCents));
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            }
        } while (choice != 4);
    }
        
    }
/* Sample outputs
Welcome to COSC ATM

1. Deposit
2. Withdrawl
3. Check Balance
4. Exit
Choose 1-4: 1
Enter deposit amount in dollars (e.g., 25.75): 23.00
Deposited $23.00. New balance: $23.00
====================================================
Welcome to COSC ATM

1. Deposit
2. Withdrawl
3. Check Balance
4. Exit
Choose 1-4: 2
Enter withdrawl amount in dollars (e.g., 10.00): 15
Withdrew $15.00. New balance: $8.00
====================================================
Welcome to COSC ATM

1. Deposit
2. Withdrawl
3. Check Balance
4. Exit
Choose 1-4: 2
Enter withdrawl amount in dollars (e.g., 10.00): 77.00
Insufficient funds. Current Balance: $8.00
====================================================
Welcome to COSC ATM

1. Deposit
2. Withdrawl
3. Check Balance
4. Exit
Choose 1-4: 3
Current balance: $8.00
====================================================
 */