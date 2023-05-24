package loops.practices;

import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        Requirement:
            Write a Java program that asks user to enter a
            number
            if the number is more than or equals 10, then finish the
            program but if number is less than 10, keep asking user
            to enter a new number until user enters a number that
            is more than or equals 10.
        •Example program:
            Program: Please enter a number
            User: 3
            Program: This number is not more than or equals 10
            Program: Please enter a number
            User: 8
            Program: This number is not more than or equals 10
            Program: Please enter a number
            User: 15
            Program: This number is more than or equals 10
         */

        int num;

        do{

            num = ScannerHelper.getNumber();
            if(num < 10) System.out.println("This number is not more than or equals 10");

        }while(num < 10);

        System.out.println("This number is more than or equals 10");




    }
}
