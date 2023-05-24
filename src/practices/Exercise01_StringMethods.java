package practices;

import utilities.ScannerHelper;

public class Exercise01_StringMethods {
    public static void main(String[] args) {

        /*
        TASK-1
        Write a program that asks user to enter a String as str
        Then print the String with given message below

        EXPECTED OUTPUT:
        The string given is = {RESULT}
         */

        System.out.println("\n------------TASK-1------------\n");

        String str = ScannerHelper.getString();

        System.out.println("The string given is = " + str);


        /*
        TASK-2
        Check if the given String has at least one character
        If it does not have any character, print "The string given is empty"
        If it is not empty, then print the length of the String with a message -> The length is = {LENGTH}
         */

        System.out.println("\n------------TASK-2------------\n");
        if(str.isEmpty()) System.out.println("The string given is empty");
        else System.out.println("The length is = " + str.length());

        //System.out.println(str.isEmpty() ? "The string given is empty" : "The length is = " + str.length()); // Ternary way


        /*
        TASK-3
        if it is not empty, print the first character with message -> The first character = {RESULT}
        if it is empty, "There is no character in this String"
         */

        System.out.println("\n------------TASK-3------------\n");
        if(!str.isEmpty()) System.out.println("The first character = " + str.charAt(0));
        else System.out.println("There is no character in this String");


        /*
        TASK-4
        if it is not empty, print the last character with message -> The last character = {RESULT}
        if it is empty, "There is no character in this String"
         */

        System.out.println("\n------------TASK-4------------\n");
        if(!str.isEmpty()) System.out.println("The first character = " + str.charAt(str.length() - 1));
        else System.out.println("There is no character in this String");


        /*
            -Check if the String contains any vowel letters
            -if it has any vowel, then print “This String has vowel”
            -Else, print “This String does not have vowel”
            Vowels = a, e, i, u, o, A, E, I, U, O

            Hello -> This String has vowel
            bcd   -> This String does not have vowel
            "  "  -> This String does not have vowel
            "abc" -> This String has vowel
         */

        System.out.println("\n------------TASK-5------------\n");

        str = str.toUpperCase();

        if(str.contains("A") || str.contains("E") || str.contains("I") || str.contains("U") || str.contains("O")){
            System.out.println("This String has vowel");
        }
        else {
            System.out.println("This String does not have vowel");
        }
    }
}
