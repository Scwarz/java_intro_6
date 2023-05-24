package conditional_statements;

import java.util.Scanner;

public class Exercise02_MathScore {
    public static void main(String[] args) {
        /*
        Assume David took a math exam and the passing grade for the exam was 60.
        Write a program that asks David what his grade is. If David’s grade is greater than or equal to 60,
        then print message “Awesome! You have passed the math class!”.
        If David’s grade is less than 60, then print message “Sorry!  You failed!”.

        EXAMPLE PROGRAM 1
        Program: Hey David! Please enter your math grade?
        User: 60
        Program: Awesome! You have passed the math class!

        EXAMPLE PROGRAM 2
        Program: Hey David! Please enter your math grade?
        User: 59
        Program: Sorry! You failed!
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Hey David! Please enter your math grade?");

        int grade = input.nextInt();

        if(grade < 60){
            System.out.println("Sorry! You failed!");
        }
        else{
            System.out.println("Awesome! You have passed the math class!");
        }


        System.out.println("End of the program!");

    }
}
