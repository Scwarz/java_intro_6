package string_Methods;

import utilities.ScannerHelper;

public class ExerciseCharAt {
    public static void main(String[] args) {
        String str = "TechGlobal";         // last index is 9  | Length is 10
        String str2 = "Hello World";       // last index is 10 | length is 11
        String str3 = "I really love java";// last index is 17 | length is 18
        System.out.println(str.charAt(4));//G

        //Print out the last character of the string
        System.out.println(str.charAt(9));//l
        System.out.println(str2.charAt(9));
        System.out.println(str3.charAt(9));

        System.out.println("\nWay 2\n");
        //Way 2
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str2.charAt(str2.length()-1));
        System.out.println(str3.charAt(str3.length()-1));







        /*
        Ask the user to enter a string and print out the last character of that string

        program: Please enter a string
        User: hello
        program: o
         */

        String strFromUser = ScannerHelper.getString();

        System.out.println(strFromUser.charAt(strFromUser.length() - 1));







    }
}
