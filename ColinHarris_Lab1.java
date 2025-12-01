/**
* COSC 111 - Lab 1
*
* @author: Colin Harris
* @version: September 3, 2025
*
* This program collects input from the user regarding their total income, three categories to budget for, and the percentage of their total income to allocate for each category.
* This program then calculates the ammount allocated for each category, and determines if there is any of the total income left to go into Savings, then outputs the results.
*/

import java.util.Scanner;
public class ColinHarris_Lab1 {
    public static void main(String[] args) {

        int income ;
        System.out.println("======== Budget Calculator ========");
        income = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter monthly income: $");
        income = kb.nextInt();
        System.out.println();

        String cat1; 
        System.out.print("Enter the first category you would like to budget for: ");
        cat1 = kb.next();

        double perCat1;
        perCat1 = 0;
        System.out.print("Enter the percentage of your income for ");
        perCat1 = kb.nextDouble();
        System.out.println();

        String cat2;
        System.out.print("Enter the second category you would like to budget for: ");
        cat2 = kb.next();

        double perCat2;
        perCat2 = 0;
        System.out.print("Enter the percentage of your income for ");
        perCat2 = kb.nextDouble();
        System.out.println();

        String cat3;
        System.out.print("Enter the third category you would like to budget for: ");
        cat3 = kb.next();

        double perCat3;
        perCat3 = 0;
        System.out.print("Enter the percentage of your income for ");
        perCat3 = kb.nextDouble();
        System.out.println();

        //Calculate the results
        double dollarCat1 = (income * perCat1);
        double dollarCat2 = (income * perCat2);
        double dollarCat3 = (income * perCat3);
        double savings = (income - dollarCat1 - dollarCat2 - dollarCat3);

        //Output the results
        System.out.println("======== Monthly Budget ========");
        System.out.println(cat1 + ": $" + dollarCat1);
        System.out.println(cat2 + ": $" + dollarCat2);
        System.out.println(cat3 + ": $" + dollarCat3);
        System.out.println("Amount left for Savings: $" + savings);
        

        kb.close();
    }
}
/* ======== Budget Calculator ========
Enter monthly income: $1500

Enter the first category you would like to budget for: Rent
Enter the percentage of your income for .5

Enter the second category you would like to budget for: Food
Enter the percentage of your income for .05

Enter the third category you would like to budget for: Entertainment
Enter the percentage of your income for .02

======== Monthly Budget ========
Rent: $750.0
Food: $75.0
Entertainment: $30.0
Amount left for Savings: $645.0 */