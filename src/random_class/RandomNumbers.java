package random_class;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        /*
        Get 2 random numbers bt 10 and 11

        0. Create a Random class object
        1. Find how many numbers do you have in your range
        2. put that in your nextInt() method
        3. add your smallest range number

        nextInt(bound) method returns a number between 0 and bound (but bound is not included)

        10 30 inclusive 21
         */

        Random r = new Random();

        int num1 = r.nextInt(21) + 10;


    }
}
