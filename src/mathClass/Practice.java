package mathClass;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("==========TASK01=========\n");

        //System.out.println("The random number * 5 = " + ((int)(Math.random() * 51))*5);
        int randomNumber = (int)(Math.random() * 51);
        int result = randomNumber * 5;
        //int randomNumber = (int)Math.round(Math.random() * 50);

        System.out.println("The random number * 5 = " + result);

        System.out.println("\n==========TASK02=========\n");

        /*
        Requirement:
        Write a program that generates two random numbers
        between 1 and 10 (both 1 and 10 are included)

        Find the min number
        Find the max number
        Find the absolute difference of the numbers

        Expected result:
         Min number = {min}
         Max number = {max}
         Difference = {difference}


         int randomNumber = (int) Math.round(Math.random() * 10); 0 - 9 -> False
         int randomNumb = (int)(Math.random() * 11); 0 - 10             -> False
         int randomNumb = (int)(Math.random() * 10) + 1; 0 - 9 -> 1 - 11 -> False
         int random = (int) (Math.random() * 10 + 1);                   -> True
         */

        //double random1 = Math.round(Math.random() * 9) + 1;

        // 15 - 20
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);

        System.out.println("Min number = " + Math.min(random1, random2));
        System.out.println("Max number = " + Math.max(random1, random2));
        System.out.println("Difference = " + Math.abs(random1-random2));

        System.out.println("\n==========TASK03=========\n");
        int random = (int) Math.round((Math.random() * 50 + 50));
        System.out.println("The random number % 10 = " + random % 10);


        System.out.println("\n==========TASK04==========\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 numbers btw 1-10");
        int num1 = input.nextInt() * 5;
        int num2 = input.nextInt() * 4;
        int num3 = input.nextInt() * 3;
        int num4 = input.nextInt() * 2;
        int num5 = input.nextInt();

        System.out.println(num1 + num2 + num3 + num4 + num5);












    }
}
