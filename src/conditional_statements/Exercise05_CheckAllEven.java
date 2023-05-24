package conditional_statements;

import java.util.Scanner;

public class Exercise05_CheckAllEven {
    public static void main(String[] args) {
         /*
        Write a Java program that asks user to enter 3 numbers
        Print true if all of them are even numbers
        Otherwise, print false

        EXAMPLE PROGRAM 1
        Program: Please enter 3 numbers?
        User: 2 4 6
        Program: true


        EXAMPLE PROGRAM 2
        Program: Please enter 3 numbers?
        User: 10 20 25
        Program: false


        EXAMPLE PROGRAM 3
        Program: Please enter 3 numbers?
        User: 1 3 5
        Program: false

        number % 2 == 0   EVEN
        number % 2 == 1   ODD

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers?");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.println(n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0);
    }
}
