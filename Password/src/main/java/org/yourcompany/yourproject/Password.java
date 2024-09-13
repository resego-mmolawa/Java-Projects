/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.util.Scanner;

/**
 *
 * @author reseg
 */
public class Password {

    public static void main(String[] args) {
        /*
        1.	Create a java program that mimics a login system. 
        Your program should prompt a user to enter their username 
        and password then grant access or deny access. If the user 
        is granted access display “Congratulations you have been granted 
        access” if not display, “Sorry try again”. You should create 
        variables that will hold your username and one that hold your Password. 
        Compare the entered username and password if they match with the ones 
        you have defined.
        Hint: You have to use a selection structure (If… else Statements) for this.
         */

        //Declare variables
        String username;
        String password;

        //Retrieve scanner object
        Scanner input = new Scanner(System.in);

        //Prompt users for input
        System.out.println("Please enter your username: ");
        username = input.next();

        System.out.println("Please enter your password: ");
        password = input.next();

        //Process user input and display results
        if (password.equals("p@ssw0rd")){
            System.out.println("Congratulations!! You have been granted access");
        } else {
            System.out.println("Sorry, try again");
        }
    }
}
