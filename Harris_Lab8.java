/**
 * Lab 8: Working with Two-Dimensional Arrays
 * ---------------------------------------
 * In this activity, you’ll create and work with a 2D array.
 * Your program will store and display a classroom seating chart.
 */
import java.util.Scanner;

public class Harris_Lab8 {
    public static void main(String[] args) {
        // TODO 1: Declare and initialize a 2D array of Strings called 'seats'.
        // Create a 3x3 grid of student names.
        // Example:
        String[][] seats = {
             {"Alice", "Ben", "Carla"},
             {"David", "Ella", "Frank"},
             {"Grace", "Henry", "Ivy"}
        };
        
        // TODO 2: Print the seating chart using nested for loops.
        // Each row should appear on its own line.
        // Example Output:
        // Alice  Ben  Carla
        // David  Ella Frank
        // Grace  Henry Ivy
        for (int row = 0; row < seats.length; row++) {
            String output = "";
            for (int col = 0; col < seats[row].length; col++) {
                output += seats[row][col] + " ";
            }
            System.out.println(output);
        }
        System.out.println("");
        // TODO 3: Change one student’s name in the array (for example, replace "Ben" with "Brian").
        // Then print the updated seating chart again.
        seats[0][1] = "Brian";
        for (int row = 0; row < seats.length; row++) {
            String output = "";
            for (int col = 0; col < seats[row].length; col++) {
                output += seats[row][col] + " ";
            }
            System.out.println(output);
        }

        // TODO 4:
        // Use a Scanner to let the user enter a row and column number (0–2).
        // Print out the name of the student sitting in that position.
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter row number (0-2): ");
        int row = kb.nextInt();
        System.out.print("Enter column number (0-2): ");
        int col = kb.nextInt();
        System.out.printf("Student in desk at row %d and column %d is %s\n", row, col, seats[row][col]);
        kb.close();
    }
}
