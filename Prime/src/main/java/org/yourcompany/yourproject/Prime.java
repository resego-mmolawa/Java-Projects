/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.util.Scanner;

/**
 *
 * @author reseg
 */
public class Prime {
    // public static boolean isPrime(int num) {
    //     //Prime numbers are always greater than 1
    //     if (num <= 1) {
    //         return false;
    //     }
    //     //The loop continues as long as i is less than or equal to the square root of num
    //     for (int i = 2; i <= Math.sqrt(num); i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //     // Retrieve scanner object
    //     Scanner input = new Scanner(System.in);

    //     // Prompt the user for input
    //     System.out.print("Please enter a number: ");
    //     int num = input.nextInt();

    //     //If the provided number is a prime or not, this output will be displayed
    //     if (isPrime(num)) {
    //         System.out.println("The number " + num + " is a prime number!");
    //     } else {
    //         System.out.println("The number " + num + " is not a prime number.");
    //     }
    // }

        public static boolean isPrime(int num){
            //Check if number is greater than 1
            if (num <= 1){
                return false;
            }

            /*For loop to calculate if the provided number 
            is a prime number (divide given number by all numbers 
            from 2 to the square root of the given number)
            */
            
            for(int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    return false;
                }
            } return true;
        } 

        public static void main(String[] args) {
            // Retrieve scanner object
        Scanner input = new Scanner(System.in);

        // Declare a variable to keep track of the loop count
        int count = 0;

        // Start a do-while loop to allow multiple checks
        do {
            // Prompt user for input
            System.out.print("Please enter a number: ");
            int num = input.nextInt();

            // Check if the number is prime and print the result
            if (isPrime(num)) {
                System.out.println("The number " + num + " is a prime number");
            } else {
                System.out.println("The number " + num + " is not a prime number");
            }

            // Increment the count
            count++;

            // Optionally, prompt the user to continue or stop
            System.out.print("Would you like to check another number? (yes/no): ");
            String response = input.next();
            if (response.equalsIgnoreCase("no")) {
                break; // Exit the loop if the user says "no"
            }

        } while (true); // Continue until the user chooses to stop

        input.close(); // Close the scanner
        }
}
