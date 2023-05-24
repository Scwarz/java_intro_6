package arrays;

import utilities.ScannerHelper;

import java.util.Arrays;

public class Exercise05_CountWords {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a String
        And count how many words you have in the given String

        "Hello World"           -> 2
        "Java is fun"           -> 3
        "Today is a nice class with technical issues" -> 8

         */

        System.out.println("\n---------1st way--------\n");

        String str1 = ScannerHelper.getString();

        int countSpace = 0;

        for (char c : str1.toCharArray()) {
            if(Character.isWhitespace(c)) countSpace++;
        }

        System.out.println(countSpace + 1);


        System.out.println("\n---------2nd way--------\n");

        String str2 = ScannerHelper.getString();

        System.out.println(str2.split(" ").length);


        System.out.println("\n------how to avoid miscounting when there is more spaces-------\n");

        String str3 = "Hello   World"; // 2 words

        String[] arr = str3.split(" ");

        System.out.println(Arrays.toString(arr)); // [Hello, , , World]

        int actualWords = 0;

        for (String s : arr) {
            if(!s.isEmpty()) actualWords++;
        }

        System.out.println(actualWords); // 2
    }
}
