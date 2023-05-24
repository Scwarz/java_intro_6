package string_Methods;

import utilities.ScannerHelper;

public class Exercise05 {
    public static void main(String[] args) {
        /*
        create a program to ask the user to enter a String.
        if the word starts with a or A and ends with e or E then print out true
        if not then print out false

        EX:
        Program: Please enter a String
        user: apple

        program:true
         */

        String word = ScannerHelper.getString().toLowerCase();

        System.out.println(word.startsWith("a") && word.endsWith("e"));

    }
}
