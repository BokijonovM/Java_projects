package com.company;
import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;

/**
 This program  uses the Production Worker class that extends the employee
 class.
 */

public class ProductionWorkerDemo
{
    public static void main(String[] args)
    {
        String name;             // Employee name
        String employeeNumber;   // Employee number
        String hireDate;         // Employee hire date
        int shift;		  			 // Employee shift
        double payRate;  			 // Employee pay

        // Creates Scanner object
        Scanner s = new Scanner(System.in);

        // Gets the user's name.
        System.out.println("Enter your name: ");
        name = s.nextLine();

        // Gets the user's employee number.
        System.out.println("Enter your employee number: ");
        employeeNumber = s.nextLine();

        // Gets the user's hire date.
        System.out.println("Enter your hire date: ");
        hireDate = s.nextLine();

        // Gets the user's payrate.
        System.out.println("Enter your payrate: ");
        payRate = s.nextDouble();

        // Gets the user's shift.
        System.out.println("Enter your shift: ");
        shift = s.nextInt();

        // Creates an Production worker object.
        ProductionWorker pw =
                new ProductionWorker();

        System.out.println();
        System.out.println("Name: " + pw.getName());
        System.out.println("Employee Number: " + pw.getEmployeeNumber());
        System.out.println("Hire Date: " + pw.getHireDate());
        System.out.println("Pay Rate: " + pw.getPayRate());
        System.out.println("Shift: " + pw.getShift());

    }
}