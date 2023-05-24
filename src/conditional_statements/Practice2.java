package conditional_statements;

import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Requirement:
Write a program that generates a
random number between 0 and 50
(both 0 and 50 are included)
Print true if number is in between 10
and 25 (10 and 25 included)
Print false otherwise
         */
        System.out.println("==========TASK01==========\n");

        Random random = new Random();
        //int randomNumber = (int)(Math.random() * 51);

        int randomNumber = random.nextInt(50);
        System.out.println(randomNumber >= 10 && randomNumber <=25);


        System.out.println("==========TASK02==========\n");

        /*
        Requirement:
            Write a program that generates a random number
            between 1 and 100 (both 1 and 100 are included)
            Find which quarter and half is number in
            1st quarter is 1-25
            2nd quarter is 26-50
            3rd quarter is 51-75
            4th quarter is 76-100
            1st half is 1-50
            2nd half is 51-100
            Test data:
            34
            Expected result:
            34 is in the 1st half
            34 is in the 2nd quarter
         */

        int randomNumber2 = random.nextInt(100) + 1;

        if(randomNumber2 <= 25){
            System.out.println(randomNumber2 + " is in the 1st half");
            System.out.println(randomNumber2 + " is in the 1st quarter");
        } else if(randomNumber2 <= 50){
            System.out.println(randomNumber2 + " is in the 1st half");
            System.out.println(randomNumber2 + " is in the 2st quarter");
        }else if(randomNumber2 <= 75){
            System.out.println(randomNumber2 + " is in the 2st half");
            System.out.println(randomNumber2 + " is in the 3rd quarter");
        } else{
            System.out.println(randomNumber2 + " is in the 2st half");
            System.out.println(randomNumber2 + " is in the 4th quarter");
        }
        System.out.println("==========TASK02==========\n");

        /*
        Requirement:
            -Assume you are given a single character. (It will be hard-coded)
            -If given char is a letter, then print “Character is a letter”
            -If given char is a digit, then print “Character is a digit”
            USE ASCII TABLE for this task
            Test data:
            ‘v’
            Expected result:
            Character is a letter
            Test data:
            ‘5’
            Expected result:
            Character is a digit
         */

        char c = '7';

        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            System.out.println("Character is a letter");
        }else if(c >= 48 && c <= 57) System.out.println("Character is a digit");





    }
}
