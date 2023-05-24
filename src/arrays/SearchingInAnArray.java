package arrays;

import java.util.Arrays;

public class SearchingInAnArray {
    public static void main(String[] args) {

        int[] numbers = {3, 10, 8, 5, 5}; // 0, 1, 2, 3, 4

        // Check if this array has an element equals 5, print true if 5 exists, and false otherwise -> true

        System.out.println("\n----------Loop way----------\n");
        boolean has5 = false;

        for (int number : numbers) {
            if (number == 5) {
                has5 = true;
                break;
            }
        }

        System.out.println(has5);


        System.out.println("\n----------Binary Search way----------\n");
        //binary search cannot be used without sorting

        Arrays.sort(numbers); // [3, 5, 5, 8, 10] 0, 1, 2, 3, 4
        System.out.println(Arrays.binarySearch(numbers, 10)); // 4
        System.out.println(Arrays.binarySearch(numbers, 3)); // 0
        System.out.println(Arrays.binarySearch(numbers, 5)); // returns the index of 5 if found -> 2

        System.out.println(Arrays.binarySearch(numbers, 7)); // -4 -> [3, 5, 5, 7, 8, 10] -3-1 -> -4
        System.out.println(Arrays.binarySearch(numbers, 15)); // -6 -> [3, 5, 5, 8, 10, 15] -5-1 -> -6
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1 [1, 3, 5, 5, 8, 10] -0-1 -> -1
    }
}
