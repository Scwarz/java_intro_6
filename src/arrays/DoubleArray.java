package arrays;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {

        // 1. create an array to store -> 5.5, 6, 10.3, 25

        double[] numbers = {5.5, 6, 10.3, 25};


        // 2. Print the array -> [5.5, 6.0, 10.3, 25.0]
        System.out.println(Arrays.toString(numbers));


        // 3. Print the size of the array -> The length is 4
        System.out.println("The length is " + numbers.length);

        // 4. Print each element using for each loop
        /*
        5.5
        6.0
        10.3
        25.0
         */

        for(double number : numbers){
            System.out.println(number);
        }

    }
}
