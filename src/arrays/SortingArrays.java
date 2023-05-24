package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 10};
        String[] words = {"Alex", "ali", "John", "James"};

        //Sort them - after this line you cannot get back to original array
        /*
        static
        void
         */

        Arrays.sort(numbers);
        Arrays.sort(words);


        //Print the arrays back
        System.out.println(Arrays.toString(numbers)); // [3, 5, 10]
        System.out.println(Arrays.toString(words)); // [Alex, James, John, ali]
    }
}
