package operators.arithmetic_operators;

public class MathFunctions {
    public static void main(String[] args) {
        /*
        You are given 9 and 3.
        Please find the
        sum             -> 12
        multiplication  -> 27
        subtraction     -> 6
        division        -> 3
        remainder       -> 0


         */

        int num1 = 9, num2 = 3;

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " = " + sum); // 12
        System.out.println("The subtraction of " + num1 + " and " + num2 + " = " + subtraction); // 6
        System.out.println("The multiplication of " + num1 + " and " + num2 + " = " + multiplication); // 27
        System.out.println("The division of " + num1 + " and " + num2 + " = " + division); // 3
        System.out.println("The remainder of " + num1 + " and " + num2 + " = " + remainder); // 0
    }
}
