/*
 * COSC 111- Lab 4 
 * 
 * @author: Colin Harris
 * @version: September 24th, 2025
 * 
 * This program is a guessing game for a number between 1-10.
 * A random number between 1-10 is generated and the user has to guess what the number is.
 * If the number guessed is higher than the number generated, then the program will tell you "Too high!" and ask you to guess again.
 * If the number guessed is lower than the number generated, then the program will tell you "Too low!" and ask you to guess again.
 * If the number guessed is the number generated, a congragulations message will appear and the program will end.
 * 
 * 
 */

import java.util.Random;
import java.util.Scanner;
public class Harris_Lab4 {
    public static void main(String[] args) {

        boolean Valid = false;
        Scanner kb = new Scanner(System.in);
        System.out.println("==================== High Low Guessing Game ====================");
        System.out.println("======================= By: Colin Harris =======================");
    
    //Computer guessing
    int answer = new Random().nextInt(11);

    //while loop for continuing guessing numbers until the user gets the correct number
    while (Valid == false) {
        System.out.print("Enter your guess: ");
        int guess = kb.nextInt();
        if (guess > answer)
            System.out.println("Too high!");
        else if (guess < answer)
            System.out.println("Too low!");
        else {
        Valid = true;
            System.out.println("==========================================================");
            System.out.println("The random number was " + answer + ". You guessed correctly!");
            System.out.println("Thank you for playing :)");
    }

}
    kb.close();
}

}
/* ==================== High Low Guessing Game ====================
======================= By: Colin Harris =======================
Enter your guess: 4
Too low!
Enter your guess: 6
Too low!
Enter your guess: 7
Too low!
Enter your guess: 8
Too low!
Enter your guess: 9
Too low!
Enter your guess: 10
==========================================================
The random number was 10. You guessed correctly!
Thank you for playing :) */