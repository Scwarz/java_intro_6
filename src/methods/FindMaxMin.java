package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class FindMaxMin {
    public static void main(String[] args) {
        // Write a program that asks user to enter 3 numbers and find the max with below message
        // The max = {RESULT}

        System.out.println("The max = " + MathHelper.max(ScannerHelper.getNumber(), ScannerHelper.getNumber(), ScannerHelper.getNumber()));
    }
}
