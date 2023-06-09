package arrays;

import arrays.practice05.Exercise01;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        double[] doubles = new double[5];
        char[] characters = new char[5];
        boolean[] booleans = new boolean[5];
        String[] words = new String[5];



        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(doubles)); // [0.0, 0.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(characters)); // [ ,  ,  ,  ,  ]
        System.out.println(Arrays.toString(booleans)); // [false, false, false, false, false]
        System.out.println(Arrays.toString(words)); // [null, null, null, null, null]
    }
}
