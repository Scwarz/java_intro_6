package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise08_CountCharacterInAString {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a String
        Count how many A or a letter you have in the given String

        Apple -> 1
        Banana -> 3
        Strawberry -> 1
        John -> 0


        PSEUDO CODE
        Check each character in the String one by one
        Increase the count of letter by one when the character is "A" or "a"
         */

        String str = ScannerHelper.getString();
        int count = 0;


        for (int i = 0; i <= str.length()-1; i++) {
           if(str.toUpperCase().charAt(i) == 'A') count++;
        }

        System.out.println(count);

    }
}
