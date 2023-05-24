package mathClass;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");
        int num1 = inputReader.nextInt();
        int num2 = inputReader.nextInt();

        System.out.println("The min of the given numbers is = " + Math.min(num1, num2));


        /*
    Create a program to ask the user to enter 3 numbers
    print out the min of those numbers

    Ex:
    Program: Please enter 3 numbers
    User:
        5
        11
        15
   Program: The min of 5, 11, 15 is: 5
     */

        System.out.println("Please enter 3 numbers");
        int number1 = inputReader.nextInt();
        int number2 = inputReader.nextInt();
        int number3 = inputReader.nextInt();

        int min = Math.min(number1, Math.min(number2,number3));

        System.out.println("The min of " + number1 + ", " + number2 + ", " + number3 + " is: " + min);


    }




}
