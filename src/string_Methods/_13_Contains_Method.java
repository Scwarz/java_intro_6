package string_Methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class _13_Contains_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns boolean
        3. nonstatic method
        4. takes string as argument
         */

        String name = "John Doe";


        boolean containsJohn = name.toLowerCase().contains("john");
        System.out.println(containsJohn);

        // write a program to ask the user for a string
        // return true if this string is a sentence and false if it is a single word

        //ask the user using ScannerHelper
        //check if string contains spaces
        //check if string ends with period

        String str = ScannerHelper.getString().trim();

        System.out.println(str.contains(" ") && str.endsWith("."));

    }
}
