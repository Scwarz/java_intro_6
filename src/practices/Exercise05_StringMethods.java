package practices;

import utilities.ScannerHelper;

public class Exercise05_StringMethods {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 Strings.
        The program gets rid of first and last characters of given two String values.
        After getting rid of first and last characters, add these two String values to each other and print the result.
        If one of the String values has length that is less than 2, then print “INVALID INPUT”


        "", ""              -> INVALID INPUT
        "", "abc"           -> INVALID INPUT
        "Orange", "a"       -> INVALID INPUT
        "ab", "xy"          -> ""
        "abc", "xyz"        -> "by"
        "java", "yellow"    -> "avello"
         */



        String str1 = ScannerHelper.getString();
        String str2 = ScannerHelper.getString();

//        if(str1.length() < 2 || str2.length() < 2) System.out.println("INVALID INPUT");
//        else System.out.println(str1.substring(1, str1.length() - 1) + str2.substring(1, str2.length() - 1));


        System.out.println(str1.length() < 2 || str2.length() < 2 ? "INVALID INPUT" : str1.substring(1, str1.length() - 1) + str2.substring(1, str2.length() - 1));

    }
}
