package practices;

import utilities.ScannerHelper;

public class Exercise02_StringMethods {
    public static void main(String[] args) {
        /*
        Write a program that gets a String from the user.
        First check if it has at least length of 3.
        If the length is less than 3, then print “Length is less than 3”
        If it has length more than or equal to 3, then find the middle character for the odd length,
        middle 2 characters for the even length.

        ""          -> Length is less than 3
        "ab"        -> Length is less than 3
        "abc"       -> b
        "civic"     -> v
        "java"      -> av
        "toyota"    -> yo
        "TechGlobal"-> Gl

         */

        String str = ScannerHelper.getString();

        if(str.length() < 3) System.out.println("Length is less than 3");
        else if(str.length() % 2 == 0) System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
        else System.out.println(str.charAt(str.length() / 2));

    }
}
