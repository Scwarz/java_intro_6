package practices;

import utilities.ScannerHelper;

public class Exercise06_StringMethods {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a String.

        The program checks if a given String has length of 4 at least and starts and ends with xx.
        -If the length of String is less than 4, then print “INVALID INPUT”
        -If given String starts and ends with xx, then print true.
        -Otherwise, print false

        ""          -> INVALID INPUT
        "red"       -> INVALID INPUT
        "java"      -> false
        "xxbluexx"  -> true

         */

        String str = ScannerHelper.getString();

        //if(str.length() < 4) System.out.println("INVALID INPUT");
        //else System.out.println(str.substring(0, 2).equals("xx") && str.substring(str.length() - 2).equals("xx"));

        //System.out.println(str.length() < 4 ? "INVALID INPUT" : str.substring(0, 2).equals("xx") && str.substring(str.length() - 2).equals("xx"));


        if(str.length() < 4) System.out.println("INVALID INPUT");
        else System.out.println(str.startsWith("xx") && str.endsWith("xx"));

        //System.out.println(str.length() < 4 ? "INVALID INPUT" : str.startsWith("xx") && str.endsWith("xx"));

    }
}
