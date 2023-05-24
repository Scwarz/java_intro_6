package operators.arithmetic_operators;

public class Exercise02 {
    public static void main(String[] args) {
        /*
            An annual average salary for an SDET in the Unites States is 120k.
            Write a Java program that calculates and prints the monthly and bi-weekly and
            weekly average amount that an SDETs makes in the United States.

            90000

            Monthly = $90k / 12
            Weekly = $90k / 52
            Bi-weekly = $90k / 26

            When we are going to store data in variables?
         */

        double averageSalary = 90_000;

        System.out.println("Monthly = $" + averageSalary / 12);
        System.out.println("Bi-weekly = $" + averageSalary / 26); //
        System.out.println("Weekly = $" + averageSalary / 52);

    }
}
