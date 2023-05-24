package loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 different positive numbers
        Print all the even numbers bt given numbers by user in ascending order
        3, 10 ->
        4
        6
        8
        10

        7, 2  ->
        2
        4
        6

        start point: Math.min(first, second)
        end point: Math.max(first, second)
        update: increment ++

         */

        int first = ScannerHelper.getNumber();
        int second = ScannerHelper.getNumber();

        for (int i = Math.min(first, second); i <= Math.max(first, second); i++) {
            if(i % 2 == 0) System.out.println(i);
        }

    }
}
