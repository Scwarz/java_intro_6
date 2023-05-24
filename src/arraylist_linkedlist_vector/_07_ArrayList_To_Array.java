package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _07_ArrayList_To_Array {

    public static void main(String[] args) {
        System.out.println(uniques(new int[]{3, 5, 7, 3, 5})); // [3, 5, 7]
        System.out.println(uniques(new int[]{10, 10, 10, 10})); // [10]
        System.out.println(uniques(new int[]{13, 20, 20, 13})); // [13, 20]
        System.out.println(uniques(new int[0])); // []

    }

    /*
    Write a method (uniques) that takes some numbers in an int array and returns the unique numbers back
    Return type must be an array

    [3, 5, 7, 3, 5]         -> [3, 5, 7]
    [10, 10, 10, 10]        -> [10]
    [13, 20, 20, 13]        -> [13, 20]
    []                      -> []
     */

    public static Integer[] uniques(int[] arr){
        ArrayList<Integer> list = new ArrayList<>(); // [3, 5, 7]

        for(int i : arr){
            if(!list.contains(i)) list.add(i);
        }

        return list.toArray(new Integer[0]);
    }

}
