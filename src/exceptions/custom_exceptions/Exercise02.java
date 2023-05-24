package exceptions.custom_exceptions;

import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a number that represent the day of the week
        And check if it is valid to tell them it is checkIn hours

        Else, tell them to it is not check in hours
         */

        int day = ScannerHelper.getNumber();

        try{
            if(Exercise01.isCheckInHours(day)) System.out.println("This is check in hours");
        }catch (Exception e){
            e.printStackTrace(); // Preferred
        }
    }
}
