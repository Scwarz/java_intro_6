package conditional_statements;

import java.util.Scanner;

public class Exercise03_PosNegZero {
    public static void main(String[] args) {
         /*
        Write a program that asks user to enter a number
        if number is more than zero, print "POSITIVE"
        if number is less than zero, print "NEGATIVE"
        Otherwise, print "ZERO"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = input.nextInt();

        //First way
        if(number > 0) System.out.println("POSITIVE");
        else if (number < 0) System.out.println("NEGATIVE");
        else System.out.println("ZERO");


        //Second way
        if(number > 0){
            System.out.println("POSITIVE");
        }
        else{
            // negative or zero
            if(number < 0){
                System.out.println("NEGATIVE");
            }
            else{
                System.out.println("ZERO");
            }
        }


        System.out.println("End of the program");
    }
}
