package utilities;

import java.util.Scanner;

public class ScannerHelper {
    static Scanner input = new Scanner(System.in);

    // Write a method that ask and return a first name from user
    public static String getFirstName(){
        System.out.println("Please enter a first name:");
        return input.nextLine();
    }


    // Write a method that ask and return a last name from user - returns String
    // method name should be getLastName
    // it should be static
    public static String getLastName(){
        System.out.println("Please enter a last name:");
        return input.nextLine();
    }


    // Write a method that ask and return an age from user - int
    // method name should be getAge
    // it should be static
    public static int getAge(){
        System.out.println("Please enter an age:");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }


    // Write a method that ask and return a number from user - returns int
    // method name should be getNumber
    // it should be static

    public static int getNumber(){
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        input.nextLine();

        return number;
    }


    public static String getString(){
        System.out.println("Please enter a String");
        String str = input.nextLine();

        return str;
    }

    public static String getFavBook(){
        System.out.println("Please enter your favorite book");
        return input.nextLine();
    }

    public static String getFavQuote(){
        System.out.println("Please enter your favorite quote");
        return input.nextLine();
    }

    public static String getFavCountry(){
        System.out.println("Please enter your favorite Country");
        return input.nextLine();
    }

    public static String getAddress(){
        System.out.println("Please enter your address");
        return input.nextLine();
    }

}
