/*
 * COSC 111- Lab 5
 * 
 * @author- Colin Harris
 * @version- October 1, 2024
 * 
 * This program allows the user to enter in their favorite numbers.
 * This program will:
 * The numbers in order
 * The numbers in reverse order
 * The sum of the numbers
 * The average of the numbers
 * The largest number
 * The smallest number
 */
import java.util.Scanner;
public class Harris_Lab5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

    //Entering favorite numbers
    System.out.print("How many favorite numbers do you want to enter: ");
    int size = kb.nextInt();

    if (size > 0){
    int[] nums = new int[size]; //creating and initializing an int array
    
    //Populating our array with the user's input
    for(int i = 0; i < size; i++){
        System.out.print("Enter number #" + (i+1) + ": ");
        nums[i] = kb.nextInt();  
    }
    //Outputing entered numbers in order and in reverse
    System.out.print("\nYou entered: ");
    for (int i = 0; i < size; i++){
        System.out.print(nums[i] + " ");
    }
    System.out.print("\nIn reverse: ");
    for (int i = size - 1; i >= 0 ; i--){
        System.out.print(nums[i] + " ");
    }
    //Variables for sum, average, largest, and smallest
    int sum = 0;
    double average = 0;
    int largest = nums[0];
    int smallest = nums[0];

    //Computing sum, average, largest, and smallest 
    for(int i = 0; i < size; i++){
        //incriments sum
        sum += nums[i];

    //Comparing largest and smallest
        if (nums[i] > largest){
            largest = nums[i];
        }
        if (nums[i] < smallest){
            smallest = nums[i];
        }
    //Computing average
        average = (double) sum / size;
    }
    System.out.println();
    System.out.println("\nSum = " + sum);
    System.out.println("Average = " + average);
    System.out.println("Largest = " + largest);
    System.out.println("Smallest = " + smallest);
    System.out.println();

    kb.close();
    } else {
        System.out.println();
        System.out.println("No numbers were entered");
        System.out.println();
        kb.close();
    }

    }

}
/* Sample output
 * How many favorite numbers do you want to enter: 5
Enter number #1: 12
Enter number #2: 8
Enter number #3: 7
Enter number #4: 27
Enter number #5: 13

You entered: 12 8 7 27 13 
In reverse: 13 27 7 8 12 

Sum = 67
Average = 13.4
Largest = 27
Smallest = 7
 */

    


    

