package operators.arithmetic_operators;

public class DivisionPractices {
    public static void main(String[] args) {
        /*
        5 / 2   = 2.5

        2     -> 2

        int 5 / int 2 = 2

        double 5 / double 2  = 2.5

         */

        int i1 = 5, i2 = 2;
        double d1 = 5, d2 = 2;

        int division1 = i1 / i2;
        double division2 = d1 / d2;

        System.out.println(division1); // 2
        System.out.println(division2); // 2.5


        /*
        TASK
        Divide 15 by 2

        Expected output:
        The division of 15.0 by 2.0 = 7.5
         */

        double num1 = 15, num2 = 2;

        double result = num1 / num2;

        System.out.println("The division of " + num1 + " by " + num2 + " = " + result);
    }
}
