package methods;

import utilities.ScannerHelper;

public class CheckName {
    public static void main(String[] args) {

        //I can invoke static methods with class name
        //I can call non-static methods with object


        /*
        Write a program that asks user to enter first name and last name separately
        Then print them with below message

        Expected Output:
        The full name entered is = {RESULT}
         */

        String fName = ScannerHelper.getFirstName();
        String lName = ScannerHelper.getLastName();

        System.out.println("The full name entered is = " + fName + " " + lName);
    }
}
