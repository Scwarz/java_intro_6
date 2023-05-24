package conditional_statements;

import java.util.Random;

public class Exercise07_DaysOfTheWeek {
    public static void main(String[] args) {
        /*
        Write a program that generates random numbers between 0 and 6
        Based on the number generated, it will print out the day
        0 -> Sunday
        1 -> Monday
        2 -> Tuesday
        3 -> Wednesday
        4 -> Thursday
        5 -> Friday
        6 -> Saturday
         */

        Random r = new Random();

        int number = r.nextInt(7); // 0 to 6 both included

        System.out.println(number);

        //Way-1
//        if(number == 0) System.out.println("Sunday");
//        else if(number == 1) System.out.println("Monday");
//        else if(number == 2) System.out.println("Tuesday");
//        else if(number == 3) System.out.println("Wednesday");
//        else if(number == 4) System.out.println("Thursday");
//        else if(number == 5) System.out.println("Friday");
//        else System.out.println("Saturday");



        //Switch statements
        switch (number){ // byte, short, int, String, enum, char
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
        }

        System.out.println("End of the program");

    }
}
