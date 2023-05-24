package operators.shorthand_operators;


import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter their balance and one day transactions.
        Subtract each transaction from balance and return new balance using shorthand operator


        Requirements:
        Use Scanner class to read input from user

        Test data:
        Balance = $100.00
        1st transaction = $25.75
        2nd transaction =  $12.50
        3rd transaction = $7.25

        Expected output:
        Balance after 1st transaction = $74.25
        Balance after 2nd transaction = $61.75
        Balance after 3rd transaction = $54.5

        PSEUDO CODE
        Create a Scanner object
        First, ask user to enter their balance
        Second, ask them to enter the transactions
        Finally, print the balance after each transaction
         */

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hey user, please enter your balance: ");
        double balance = inputReader.nextDouble();

        System.out.println("The initial balance = $" + balance);

        System.out.println("What is the first transaction amount?");
        System.out.println("The balance after first transaction = $" + (balance -= inputReader.nextDouble()));

        System.out.println("What is the second transaction amount?");
        System.out.println("The balance after second transaction = $" + (balance -= inputReader.nextDouble()));

        System.out.println("What is the third transaction amount?");
        System.out.println("The balance after third transaction = $" + (balance -= inputReader.nextDouble()));
    }
}
