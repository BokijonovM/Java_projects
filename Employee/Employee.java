package com.company;
import java.util.*;

/**
 Please run ProductionWorkerDemo.java
 Please run ProductionWorkerDemo.java
 Please run ProductionWorkerDemo.java
 */

public class Employee
{
    String name;             // Employee name
    String employeeNumber;   // Employee number
    String hireDate;         // Employee hire date

    /**
     This constructor initializes an object with a name,
     employee number, and hire date.
     @param n The employee's name.
     @param e The employee's number.
     @param h The employee's hire date.
     */

    public Employee(String n, String e, String h)
    {
        name = n;
        employeeNumber = e;
        hireDate = h;
    }
    /**
     The no-arg constructor initializes an object with
     null strings for name, employee number, and hire
     date.
     */

    public Employee()
    {
        name = "";
        employeeNumber = "";
        hireDate = "";
    }

    /**
     The setName method sets the employee's name.
     @param n The employee's name.
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     The setEmployeeNumber method sets the employee's
     number.
     @param e The employee's number.
     */
    public void setEmployeeNumber(String e)
    {
        if (isValidEmpNum(e))
        {
            employeeNumber = e;
        }
        else
        {
            employeeNumber = "";
        }
    }
    /**
     The setHireDate method sets the employee's
     hire date.
     @param h The employee's hire date.
     */
    public void setHireDate(String h)
    {
        hireDate = h;
    }
    /**
     The getName method returns the employee's name.
     @return The employee's name.
     */
    public String getName()
    {
        return name;
    }
    /**
     The getEmployeeNumber method returns the
     employee's number.
     @return The employee's number.
     */
    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    /**
     The getHireDate method returns the
     employee's hire date.
     @return The employee's hire date.
     */

    public String getHireDate()
    {
        return hireDate;
    }
    /**
     isValidEmpNum is a private method that
     determines whether a string is a valid
     employee number.
     @param e The string containing an employee
     number.
     @return true if e references a valid ID number,
     false otherwise.
     */
    private boolean isValidEmpNum(String e)
    {
        boolean status = true;

        if (e.length() != 5)
            status = false;
        else
        {
            if ((!Character.isDigit(e.charAt(0)))  ||
                    (!Character.isDigit(e.charAt(1)))   ||
                    (!Character.isDigit(e.charAt(2)))   ||
                    (e.charAt(3) != '-')                ||
                    (!Character.isLetter(e.charAt(4)))  ||

                    //needs to check if between A and M
                    (!(e.charAt(4)>= 'A' && e.charAt(4)<= 'M')))
            {
                status = false;
            }
        }
        return status;
    }
    /**
     toString method
     @return A reference to a String representation of
     the object.
     */

    public String toString()
    {
        String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeNumber == "")
        {
            str += "INVALID EMPLOYEE NUMBER";
        }
        else
        {
            str += employeeNumber;
        }

        str += ("\nHire Date: " + hireDate);
        return str;
    }

}
