package conditional_statements;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 6");
        int num = input.nextInt();

        if(num == 1){
            System.out.println("Jan");
        } else if(num == 2){
            System.out.println("Feb");
        } else if(num == 3) {
            System.out.println("Mar");
        } else if(num == 4) {
            System.out.println("Apr");
        } else if(num == 5) {
            System.out.println("May");
        } else if(num == 6) {
            System.out.println("Jun");
        } else {
            System.out.println("This is not a number from 1 to 6");
        }




        switch(num){
            case 1 : {
                System.out.println("Jan");
                break;
            }
            case 2 : {
                System.out.println("Feb");
                break;
            }
            case 3 : {
                System.out.println("Mar");
                break;
            }
            case 4 : {
                System.out.println("Apr");
                break;
            }
            case 5 : {
                System.out.println("May");
                break;
            }
            case 6 : {
                System.out.println("Jun");
                break;
            }
            default: {
                System.out.println("This is not a number from 1 to 6");
            }

        }


        System.out.println("please enter either a, b, or c");
        input.nextLine();
        String letter = input.nextLine();

        switch (letter){
            case "a": {
                System.out.println("The letter you entered is a");
                break;
            }
            case "b": {
                System.out.println("The letter you entered is b");
                break;
            }
            case "c": {
                System.out.println("The letter you entered is c");
                break;
            }
            default:{
                System.out.println("ERROR! This is not a letter from a to c");
            }
        }






    }
}
