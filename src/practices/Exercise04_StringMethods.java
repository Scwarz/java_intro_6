package practices;

import utilities.ScannerHelper;

public class Exercise04_StringMethods {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a String.
        First check if it has at least length of 2.
        If the length is less than 2, then print “Length is less than 2”

        If it has length more than or equal to 2, then check if first 2 and last 2 characters of the given String are same.
        If first 2 and last characters are same, then print true.
        Otherwise, print false.


        ""          -> Length is less than 2
        "a"         -> Length is less than 2
        "ab"        -> true
        "abc"       -> false
        "aba"       -> false
        "aaa"       -> true
        "xyzxy"     -> true

         */

        String str = ScannerHelper.getString();

        if(str.length() >= 2) System.out.println(str.substring(0, 2).equals(str.substring(str.length() - 2)));
        else System.out.println("Length is less than 2");

    }
}
