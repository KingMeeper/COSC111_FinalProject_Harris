/*
 * Lab 9: Exception Handling and File I/O
 * ------------------------------------
 * In this lab, you will read a text file, count the number of words,
 * and handle any errors that might occur using try/catch.
 */
import java.io.*;
import java.util.Scanner;

public class Harris_Lab9 {
    public static void main(String[] args) {

        // TODO 1: Use a try/catch block to handle file reading. 
        // Get the file name from the user as input from the keyboard
        // - Create a File object for user-specified file (I will test with input.txt)
        // - Create a Scanner to read from that file
        // - Count the total number of words
        // - Print the total count
        int lineCount = 0;
        int wordCount = 0;
        int characterCount = 0;

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter input filename: ");
        String inputName = kb.next();
        try {
            File file = new File(inputName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                characterCount += words.length - 1;
                for (int i = 0; i < words.length; i++) {
                    characterCount += words[i].length();
                }
            }
            reader.close();
        }
        
        // - Print a friendly error message if the file is not found
        catch (FileNotFoundException e){
            System.out.println("Sorry, but this file cannot be found");
            return;
        }
        

        // TODO 2: Add another try/catch block below to WRITE output to a new file.
        // Use PrintWriter to write "Total words: X" to a file called "output.txt".
        try {
            PrintWriter writer = new PrintWriter("output.txt");
            writer.println("This program has " + wordCount + " words,");
            writer.println(lineCount + " lines,");
            writer.println("and " + characterCount + " characters.");
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Sorry, but can't create output file");
        }
    }
}