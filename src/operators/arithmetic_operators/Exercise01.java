package operators.arithmetic_operators;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Rectangle -
        Create two variables and store two values as a and b
        Find the area with multiplying = a * b
        Find the perimeter with formula (2 * (a + b))

        a = 5
        b = 8

        Print them out with below messages
        Area = 40
        Perimeter = 26
         */

        int a = 5, b = 8;

        System.out.println("Area = " + a * b); // Area = 40
        System.out.println("Perimeter = " + (a + b + a + b)); // Perimeter = 26
        System.out.println("Perimeter = " + (2 * a + 2 * b)); // Perimeter = 26
        System.out.println("Perimeter = " + 2 * (a + b)); // Perimeter = 26


    }
}
