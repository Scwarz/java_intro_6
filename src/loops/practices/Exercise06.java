package loops.practices;

import utilities.ScannerHelper;

public class Exercise06 {
    public static void main(String[] args) {
        int number = 0;// 150

        int i = 0;// 1

        do{
            number += ScannerHelper.getNumber();// 150
            i++;
        }while(number < 100);

        if(i > 1) System.out.println("Sum of the entered numbers is at least 100");
        else System.out.println("This number is already more than 100");
    }
}
