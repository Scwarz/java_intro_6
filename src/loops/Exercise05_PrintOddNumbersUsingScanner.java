package loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
         /*
        Write a Java program to ask user to enter a positive number and print
        all the odd numbers starting from 0 to given number by user
        (0 and given number is included)

        Test data:
        7

        Expected output:
        1
        3
        5
        7

        Test data:
        12

        Expected output:
        1
        3
        5
        7
        9
        11

        start point: 0
        end point: user number
        update: increment
         */

        int userNumber = ScannerHelper.getNumber();

        for (int i = 0; i <= userNumber; i++) {
            if(i % 2 == 1) System.out.println(i);
        }

    }
}
