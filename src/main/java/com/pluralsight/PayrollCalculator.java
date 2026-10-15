package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("How many hours have you worked? ");
        float hoursWorked = myScanner.nextFloat();
        myScanner.nextLine();
        System.out.println("What is your hourly pay? ");
        float payRate = myScanner.nextFloat();
        double grossPay = payRate * hoursWorked;
        System.out.println("Gross Pay; " + grossPay);

    }
}
