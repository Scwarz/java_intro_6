package scannerClass;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //.next method

        System.out.println("Please enter your name.");
        String name = input.next();// returns us with a String of the user's choice and assigns it to String name
        input.nextLine();

        System.out.println("The user's name is: " + name);// prints out The user's name is: {name}

        System.out.println("\n=====================================\n");



        //.nextLine method
        System.out.println("Please enter your first and last name.");
        String fullName = input.nextLine();

        System.out.println("The users full name is: " + fullName);



        //nextInt method
        System.out.println("Please enter a number");
        int number = input.nextInt();

        System.out.println("The number you chose is: " + number);



    }
}
