package loops.do_while_loops;

import utilities.ScannerHelper;

public class Exercise01_GetNumberDividedBy5 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number.
        Keep asking till they enter a number that can be divided by 5.

        Please enter a number:
        3

        Please enter a number:
        4

        Please enter a number:
        25

        End of the program.



        Please enter a number:
        10

        End of the program.
         */

        int number;

        do{
           number = ScannerHelper.getNumber();
        }
        while(number % 5 != 0);


        System.out.println("End of the program");


        System.out.println("\n-----------while loop----------\n");

        //Create an infinite loop, keep asking user to enter a number but break the loop when you got a number that can be divided by 5

        while(true){
            int n1 = ScannerHelper.getNumber();
            if(n1 % 5 == 0) {
                System.out.println("End of the program");
                break;
            }
        }

        System.out.println("\n-----------for loop----------\n");
        //Create an infinite loop, keep asking user to enter a number but break the loop when you got a number that can be divided by 5

        for (; ;) {
            int n2 = ScannerHelper.getNumber();
            if(n2 % 5 == 0) {
                System.out.println("End of the program");
                break;
            }
        }

    }
}
