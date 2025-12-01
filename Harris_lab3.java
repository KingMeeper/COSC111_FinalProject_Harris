/*
 * COSC111- Lab 3
 * 
 * @author: Colin Harris
 * @version: September 17, 2025
 * 
 * This program validates whether or not the password thr user enters is valid based on the requirements or not.
 * The requirements for the password are:
 * 1. The length must be at least 7 characters and less than 11 characters long.
 * 2. The password must end in either 'abc', 'xyz', or '123'.
 * 3. If the password ends in 'abc', the password must contain an '@'.
 * 4. If the password ends in 'xyz', the third character has to be a digit.
 * 5. If the password ends in '123', the first and second character must be the square root of the third and fourth character.
*/

import java.util.Scanner; 
public class Harris_lab3 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String pwd;

    System.out.println();
    System.out.println("Welcome to the Password Validator");
    System.out.println();
    System.out.println("The password must satisfy the following requirements: ");
    System.out.println("1. The length must be at least 7 characters and less than 11 characters long.");
    System.out.println("2. The password must end in either 'abc', 'xyz', or '123'.");
    System.out.println("3. If the password ends in 'abc', the password must contain an '@'.");
    System.out.println("4. If the password ends in 'xyz', the third character has to be a digit.");
    System.out.println("5. If the password ends in '123', the first and second character must be the square root of the third and fourth character.");
    System.out.println();
    System.out.println("Enter your password: ");
    pwd = kb.next();
    int length = pwd.length();

    //Validating the length of the password
    boolean lengthValid = true;
    if (length < 7 || length > 11) {
        lengthValid = false;
        System.out.println("This length is invalid because the password length is either less than 7 characters or more than 11 characters.");
    }
    
    //Validating that the suffix of the password is acceptable
    boolean suffixValid = pwd.endsWith("abc") || pwd.endsWith("xyz") || pwd.endsWith("123");
    String suffix = pwd.substring(length-3, length);

        boolean contentValid = true;
        switch(suffix) {
            case "abc":
                if (!pwd.contains("@")) { 
                    contentValid = false;
                    System.out.println("This password is invalid because the password does not contain an '@'.");
                    //valiates that passwords ending in 'abc' contains an @.
                }
                break;
            case "xyz": 
                if (!Character.isDigit(pwd.charAt(2))) {
                    contentValid = false;
                    System.out.println("This password is invalid because the third character of your password is not a digit.");
                    //validates that passwords ending in xyz have a digit as the third character.
                }
                break;
            case "123": 
                if (!Character.isDigit(pwd.charAt(0)) || !Character.isDigit(pwd.charAt(1)) || 
                !Character.isDigit(pwd.charAt(2)) || !Character.isDigit(pwd.charAt(3))) { //makes sure the program states the password is invalid if the password ends in '123' but the first four characters contain a letter.
                    contentValid = false;
                    System.out.println("This password is invalid because the first two characters are not the square root of the third and fourth characters.");
                } else {
                    int Num1 = Integer.parseInt(pwd.substring(0,2));
                    int Num2 = Integer.parseInt(pwd.substring(2,4));
                    if (Num1 * Num1 != Num2) { //states what to print if the first two characters are not the square root of characters 3 and 4
                        contentValid = false;
                        System.out.println("This password is invalid because the first two characters are not the square root of the third and fourth characters.");
                        //validates that passwords ending in '123' have the first two characters are the square root of characters 3 and 4.
                    }   
                }
                break;
            default:
                System.out.println("This password is invalid due to not ending in one of the required suffixes");
        }
          if (lengthValid && suffixValid && contentValid) {
            System.out.println("Password is valid!");
        } else 
            System.out.println("Password is invalid!");
        kb.close();
    }
}
/* Sample Outputs

 Welcome to the Password Validator

The password must satisfy the following requirements: 
1. The length must be at least 7 characters and less than 11 characters long.
2. The password must end in either 'abc', 'xyz', or '123'.
3. If the password ends in 'abc', the password must contain an '@'.
4. If the password ends in 'xyz', the third character has to be a digit.
5. If the password ends in '123', the first and second character must be the square root of the third and fourth character.

Enter your password: 
B@nanabc
Password is valid!
===================
Welcome to the Password Validator

The password must satisfy the following requirements: 
1. The length must be at least 7 characters and less than 11 characters long.
2. The password must end in either 'abc', 'xyz', or '123'.
3. If the password ends in 'abc', the password must contain an '@'.
4. If the password ends in 'xyz', the third character has to be a digit.
5. If the password ends in '123', the first and second character must be the square root of the third and fourth character.

Enter your password: 
Bi1lyBobxyz
Password is valid!
===================
Welcome to the Password Validator

The password must satisfy the following requirements: 
1. The length must be at least 7 characters and less than 11 characters long.
2. The password must end in either 'abc', 'xyz', or '123'.
3. If the password ends in 'abc', the password must contain an '@'.
4. If the password ends in 'xyz', the third character has to be a digit.
5. If the password ends in '123', the first and second character must be the square root of the third and fourth character.

Enter your password: 
0981Sqrt123
Password is valid!
===================
Welcome to the Password Validator

The password must satisfy the following requirements: 
1. The length must be at least 7 characters and less than 11 characters long.
2. The password must end in either 'abc', 'xyz', or '123'.
3. If the password ends in 'abc', the password must contain an '@'.
4. If the password ends in 'xyz', the third character has to be a digit.
5. If the password ends in '123', the first and second character must be the square root of the third and fourth character.

Enter your password: 
5catsxyz
This password is invalid because the third character of your password is not a digit.
Password is invalid!
===================
 */