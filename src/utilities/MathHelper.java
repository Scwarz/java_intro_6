package utilities;

import java.util.Random;
import java.util.Scanner;

public class MathHelper {

    static Scanner input = new Scanner(System.in);

    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(Math.max(num1,num2),num3);
    }

    public static int minOfThree(int num1, int num2, int num3){
        return Math.min(Math.min(num1,num2),num3);
    }


    public static int sum(int num1,int num2){return (num1+num2);}

    public static int product(int num1,int num2){return (num1*num2);}

    public static int square(int num1){return (num1*num1);}




}
