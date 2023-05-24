package conditional_statements;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Write a program that asks the user to enter a day of the week in lowercase format and print out
        what number of day of the week that is. If the user enters any other word or does not do it in lowercase format
        print ERROR!

        monday -> 1st day of the week
        tuesday -> 2nd day of the week
        wednesday -> 3rd day of the week
        thursday -> 4th day of the week
        friday -> 5th day of the week
        saturday -> 6th day of the week
        sunday -> 7th day of the week
        anything else -> ERROR!
         */

        System.out.println("Please enter a day of the week:");
        String dayOfWeek = input.nextLine();

        switch (dayOfWeek){
            case "monday": {
                System.out.println("1st day of the week");
                break;
            }
            case "tuesday": {
                System.out.println("2nd day of the week");
                break;
            }
            case "wednesday": {
                System.out.println("3rd day of the week");
                break;
            }
            case "thursday": {
                System.out.println("4th day of the week");
                break;
            }
            case "friday": {
                System.out.println("5th day of the week");
                break;
            }
            case "saturday": {
                System.out.println("6th day of the week");
                break;
            }
            case "sunday": {
                System.out.println("7th day of the week");
                break;
            }
            default: {
                System.out.println("ERROR!");
            }
        }

    }
}
