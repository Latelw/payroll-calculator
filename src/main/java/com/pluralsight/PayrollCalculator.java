package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        //used name funciton

        System.out.println("Hello, " + name);
        System.out.println("How many hours have you worked? ");
       //float point numbers for input

        double hoursWorked = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.println("What is your hourly pay? ");
        double payRate = myScanner.nextDouble();
        double grossPay = payRate * hoursWorked;
       //Use %.2f to limit output to 2 decimal points
        System.out.printf("Gross Pay: " + "%.2f", grossPay);

    }
}
