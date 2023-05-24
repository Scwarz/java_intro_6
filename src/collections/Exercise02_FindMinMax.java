package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Exercise02_FindMinMax {
    public static void main(String[] args) {
        System.out.println(max(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(max(new Integer[]{5, -7, 23}));
        System.out.println(max(new Integer[]{12}));

        System.out.println(min(new Integer[]{10, 100, 123, 507, 25})); // 10
        System.out.println(min(new Integer[]{5, -7, 23})); // -7
        System.out.println(min(new Integer[]{12})); // 12


        System.out.println("\n---------Second min-max-----------\n");
        System.out.println(secondMin(new Integer[]{10, 100, 123, 507, 25})); // 25
        System.out.println(secondMax(new Integer[]{10, 100, 123, 507, 25})); // 123
    }


    /*
    Write a method called as max, and it takes an Integer array as an argument and return the max number

    [10, 100, 123, 507, 25] -> 507
    [5, -7, 23] -> 23
    [12] -> 12
     */

    public static int max(Integer[] numbers){
        return new TreeSet<>(Arrays.asList(numbers)).last();
    }

    public static int min(Integer[] numbers){
        return new TreeSet<>(Arrays.asList(numbers)).first();
    }

    public static int secondMax(Integer[] numbers){
       if(numbers.length < 2) throw new NoSuchElementException("Size is " + numbers.length);
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(numbers));
        // set.remove(set.last());
        set.pollLast(); // remove the last element

        return set.last();
    }

    public static int secondMin(Integer[] numbers){
        if(numbers.length < 2) throw new NoSuchElementException("Size is " + numbers.length);
        // else return new ArrayList<>(new TreeSet<>(Arrays.asList(numbers))).get(1);
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(numbers));
        // set.remove(set.first());
        set.pollFirst(); // remove the first element

        return set.first();
    }
}
