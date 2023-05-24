package string_Methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 strings
        •And store answers of user in different String variables
        •Finally, check if given 2 Strings are equal or not and print
        messages given below

        Test data 1:
        Java is fun
        Hello World
        Expected output 1:
        These strings are not equal

        Test data 2:
        Hello
        Hello
        Expected output 2:
        These strings are equal
         */

        String str1 = ScannerHelper.getString();
        String str2 = ScannerHelper.getString();

        if(str1.equals(str2)){
            System.out.println("These strings are equal");
        }else {
            System.out.println("These strings are not equal");
        }

    }
}
