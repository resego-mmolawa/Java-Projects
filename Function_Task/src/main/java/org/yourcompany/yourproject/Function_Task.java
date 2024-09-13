/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.util.Scanner;

/**
 *
 * @author reseg
 */
public class Function_Task {
    public static void User(String name, String surname, int age, double salary){
        String fullName = name + " " + surname;
        double salaryTenth = salary * 0.1;
        
        
        System.out.println("  ");
        System.out.println("*******************************************");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("10% of salary: " + salaryTenth);
    }
    
    public static boolean ageCheck(int age){
        return age > 18;
    }

    
        public static void main(String[] args) {
            /*
            Create a java program that uses functions to display the users details
            (Name, Surname, Age, and Salary), calculate the 10% of the salary and display their details
            in the following format:
            Full Name: 
            age:
            salary:
            10% of the salary:
            
            Create a function called ageCheck(). Your function should accept two parameters a name 
            and age, return true if the user is over 18 and false if they are less than 18
            */
            
         
            
            //Create a scanner object
            Scanner input = new Scanner(System.in);
            
            //Declare variables
            String name;
            String surname;
            int age;
            double salary;
            
            //Prompt the user for input
            System.out.print("Please enter your name: ");
            name = input.next();
            System.out.print("Please enter your surname: ");
            surname = input.next();
            System.out.print("Please enter your age: ");
            age = input.nextInt();
            System.out.print("Please enter your salary: ");
            salary = input.nextDouble();
            
            User(name, surname, age, salary);
            System.out.println("True if over 18, false if under 18: " + ageCheck(age));
            System.out.println("*******************************************");
        }
    }
