package collections;

import java.util.*;

public class Exercise01_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 5, 2)))); // [2, 3, 4, 5]
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(10, 10, 10, 10)))); // [10]
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(-3, -3, -5, 0, 0)))); // [-3, -5, 0]
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(-3, 0, 5)))); // [-3, 0, 5]
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(10, 5, 3, 3)))); // [3, 5, 10]
    }


    /*
    Create a method that takes some numbers and return the numbers back with all duplicates removed

    2, 3, 4, 5, 5, 2    -> 2, 3, 4, 5           3, 4, 2, 5
    10, 10, 10, 10      -> 10
    -3, -3, -5, 0, 0    -> -3, -5, 0

    10, 5, 3, 3         -> 3, 5, 10

    NOTE: The order of elements should be sorted!!!
     */

    public static TreeSet<Integer> removeDuplicates(List<Integer> numbers){
        return new TreeSet<>(numbers);
    }
}
