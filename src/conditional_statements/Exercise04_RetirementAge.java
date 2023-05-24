package conditional_statements;

import java.util.Scanner;

public class Exercise04_RetirementAge {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their age
        And print “It is your time to get retired!” if their age is more than or equals 55
        else calculate and tell user how many years later they can be retired

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 60
        Program: It is your time to get retired!


        EXAMPLE PROGRAM 2
        Program: Please enter your age?
        User: 20
        Program: You have 35 years to be retired


        EDGE CASES
        less than 55
        55
        more than 55

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age?");
        int age = input.nextInt();

        if(age >= 55) System.out.println("It is your time to get retired!");
        else{
            int ageLeft = 55 - age;

            if(ageLeft == 1) System.out.println("You have 1 year to be retired");
            else System.out.println("You have " + ageLeft + " years to be retired");
        }

        System.out.println("End of the program");
    }
}
