package methods;

import utilities.MathHelper;
import utilities.RandomGenerator;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Create a random number between 5 and 8
        Create a random number between 3 and 4
        Create a random number between 10 and 12

        Find the max of these
         */

        int r1 = RandomGenerator.getRandomNumber(5, 8);
        int r2 = RandomGenerator.getRandomNumber(3, 4);
        int r3 = RandomGenerator.getRandomNumber(10, 12);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("The max is = " + MathHelper.max(r1, r2, r3));
    }
}
