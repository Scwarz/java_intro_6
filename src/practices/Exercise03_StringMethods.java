package practices;

import utilities.ScannerHelper;

public class Exercise03_StringMethods {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a String and divides the given String.
        Length of given will be at least 4.
        if length of the String is not at least 4, then print “INVALID INPUT”
        If the length is 4 or more, then
        -print the first two characters
        -print the last two characters
        -print all the middle characters other than first and last 2 characters

        Java
        First 2 characters are = Ja
        Last 2 characters are = va
        The other characters are =


        Python
        First 2 characters are = Py
        Last 2 characters are = on
        The other characters  are = th

        TechGlobal
        First 2 characters are = Te
        Last 2 characters are = chGlob
        The other characters  are = al

         */

        String str = ScannerHelper.getString();

        if(str.length() < 4){
            System.out.println("INVALID INPUT");
        }
        else {
            System.out.println("First 2 characters are = " + str.substring(0, 2));
            System.out.println("Last 2 characters are = " + str.substring(str.length() - 2));
            System.out.println("The other characters  are = " + str.substring(2, str.length() - 2));
        }
    }
}
