package conditional_statements;

import java.util.Scanner;

public class Turnery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = 10;
        int num2 = 5;
        int difference;

        /*if(num1 > num2){
            difference = num1 - num2;
        }else{
            difference = num2 - num1;
        }
        System.out.println(difference);

         */

        difference = num1 > num2 ? num1 - num2 : num2 - num1;
        System.out.println(difference);


        System.out.println("Please enter a number");
        int number = input.nextInt();

//        if(number % 2 != 1){
//            System.out.println("even");
//        }else System.out.println("odd");


        System.out.println( (number % 2 != 1) ? ("even") : ("odd") );







    }
}
