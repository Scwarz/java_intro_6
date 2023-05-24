package recaps;

import java.util.Random;
import java.util.Scanner;

public class Homework03JORecap {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);
        int num3 = (int) (Math.random() * 101);

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);

        if (num1 > 25 && num2 > 25 && num3 > 25) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(num1 > 25 && num2 > 25 && num3 > 25);

    }
}
