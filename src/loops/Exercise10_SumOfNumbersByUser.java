package loops;

import utilities.ScannerHelper;

public class Exercise10_SumOfNumbersByUser {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 5 numbers
        Find sum of the given numbers by user.
        NOTE: Ask user to enter numbers one by one.

        2, 3, 4, 5, 6

        Output:
        20

        11, 15, 23, -7, 8

        Output:
        50
         */
/*
        System.out.println("\n---------without loop----------\n");
        int n1 = ScannerHelper.getNumber();
        int n2 = ScannerHelper.getNumber();
        int n3 = ScannerHelper.getNumber();
        int n4 = ScannerHelper.getNumber();
        int n5 = ScannerHelper.getNumber();

        System.out.println(n1 + n2 + n3 + n4 + n5);
 */


        System.out.println("\n---------with for loop----------\n");

        int sum = 0;

        for (int i = 1; i <= 5; i++) { // 1, 2, 3, 4, 5
            sum += ScannerHelper.getNumber();
        }

        System.out.println(sum);


        System.out.println("\n---------with while loop----------\n");


        int start = 1;
        int sumWhile = 0;

        while(start <= 7){
            sumWhile += ScannerHelper.getNumber();
            start++;
        }

        System.out.println(sumWhile);
    }
}
