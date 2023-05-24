package scannerClass;

import java.util.Scanner;

public class ScannerAddingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, sum;

        System.out.println("Please enter number 1");
        num1 = input.nextInt();

        System.out.println("Please enter number 2");
        num2 = input.nextInt();

        System.out.println("Please enter number 3");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        System.out.println("The sum of the numbers you entered is " + sum);


    }
}
