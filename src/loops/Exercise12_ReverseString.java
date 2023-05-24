package loops;

import utilities.ScannerHelper;

public class Exercise12_ReverseString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from user
        Reverse the name and print it back

        Test data:
        James

        Expected Output:
        semaJ


        Test data:
        John

        Expected Output:
        nhoJ
        */

        String name = ScannerHelper.getFirstName();

        String reversedName = "";

        for(int i = name.length()-1; i >= 0; i--){
            reversedName += name.charAt(i);
        }

        System.out.println(reversedName);


    }
}
