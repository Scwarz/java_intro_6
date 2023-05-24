package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        /*
        Write a program that asks user an age and a number
        Calculate what will be their age after number years

        Program: Please enter an age:
        User: 45

        Program: Please enter a number:
        User: 10

        Program: Age will be 55 after 10 years.
         */

        int age = ScannerHelper.getAge(), num = ScannerHelper.getNumber();

        System.out.println("Age will be " + (age + num) + " after " + num + " years.");
    }
}
