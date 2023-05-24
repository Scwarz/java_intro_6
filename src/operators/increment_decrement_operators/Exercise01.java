package operators.increment_decrement_operators;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number
        Find the multiplication of the number from 1 to 5

        Assume they enter 13
        13 * 1 = 13
        13 * 2 = 26
        13 * 3 = 39
        13 * 4 = 52
        13 * 5 = 65

        Assume they enter 5
        5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
        5 * 4 = 20
        5 * 5 = 25
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int index = 1;

        System.out.println(number + " * " + index + " = " + number * index++);
        System.out.println(number + " * " + index + " = " + number * index++);
        System.out.println(number + " * " + index + " = " + number * index++);
        System.out.println(number + " * " + index + " = " + number * index++);
        System.out.println(number + " * " + index + " = " + number * index++);
    }
}
