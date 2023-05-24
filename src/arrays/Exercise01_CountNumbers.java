package arrays;

import java.net.Inet4Address;

public class Exercise01_CountNumbers {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*

        negatives
        positives
        neutral

        evens
        odds

        divisible by 3
        divisible by 5
        divisible by 10

        sum
        average
        product

        max
        min
        abs difference bt min and max
        the biggest difference bt respective 2 numbers -> 17

        closest number to 9 (take the smallest in case you have 2 on the left and the right) ->

        find how many unique elements -> 7
        find how many numbers are represented in fibonacci series -> 6
        find how many numbers are prime numbers -> 2


         */
        //Write a program that counts how many negative numbers you in the array -> 2

        /*
        PSEUDO CODE
        Check each number one by one
        Count whenever a number is negative
        After checking all numbers, print the result
         */

        System.out.println("\n-------for each loop------\n");

        int negatives = 0;

        for (int number : numbers) {
            if(number < 0) negatives++;
        }

        System.out.println(negatives); // 2


        System.out.println("\n-------for  loop------\n");
        negatives = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) negatives++;
        }

        System.out.println(negatives); // 2


        //Write a program that counts how many even numbers you in the array -> 6
        System.out.println("\n-------count evens------\n");
        int evens = 0;

        for (int number : numbers) {
            if(number % 2 == 0) evens++;
        }

        System.out.println(evens);


        //Write a program that finds the sum of all the numbers in the array -> 28
        // -1, 3, 0, 5, -7, 10, 8, 0, 10, 0
        System.out.println("\n-------sum------\n");

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
