package operators.arithmetic_operators;

public class AdditionSubtractionConcatenation {
    public static void main(String[] args) {
        /*
            Find sum, and subtraction of 10 and 5
            sum = 15
            subtraction = 5

            EXPECTED OUTPUT:
            The sum = 15
            The subtraction = 5

            *
            /
            %

         */

        System.out.println("The sum = " + (10 + 5)); // The sum = 15
        System.out.println(5 + 10 + " Hello" + 5 + 10); // 15 Hello510


        System.out.println("The subtraction = " + (10 - 5)); // The subtraction = 5

        System.out.println(10 - 5 + " Hello"); // 5 Hello


        System.out.println("The remainder = " + 10 % 5); // 0
        System.out.println("The product = " + 10 * 5); // 50
        System.out.println("The division = " + 10 / 5); // 2

    }
}
