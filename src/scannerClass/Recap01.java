package scannerClass;

import java.util.Scanner;

public class Recap01 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their firstName, address, favNumber

        Then, print them all in a way as below
        {firstName}'s address is {address} and their fav number is {favNumber}.

        FirstName = John        -> next()
        Address = Chicago IL    -> nextLine()
        Fav Number = 7          -> nextInt()

        John's address is Chicago IL and their fav number is 7.
         */

        Scanner inputReader = new Scanner(System.in);

        System.out.println("What is your name?");
        String fName = inputReader.next();

        inputReader.nextLine(); // empty line to skip the problem of Scanner

        System.out.println("What is your address?");
        String address = inputReader.nextLine();

        System.out.println("What is your fav number?");
        int favNumber = inputReader.nextInt();

        System.out.println(fName + "'s address is " + address + " and their fav number is " + favNumber + ".");
    }
}
