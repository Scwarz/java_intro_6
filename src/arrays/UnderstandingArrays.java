package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "Miami", "Toronto", "Rome", "Berlin"};


        //The number elements in the array
        System.out.println(cities.length); // 3


        //Get particular element from the array
        System.out.println(cities[1]); // Miami
        System.out.println(cities[0]); // Chicago
        System.out.println(cities[2]); // Toronto

        //ArrayIndexOutOfBoundsException
        // System.out.println(cities[10]);


        // HOW TO PRINT THE ARRAY -> [Chicago, Miami, Toronto]
        // 1. Convert your array to a String
        // 2. Print it with print method

        System.out.println(Arrays.toString(cities)); // [Chicago, Miami, Toronto]



        //HOW TO LOOP AN ARRAY
        System.out.println("\n---------for loop-------\n");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }



        System.out.println("\n---------for each loop - enhanced loop-------\n");

        for(String city : cities){
            System.out.println(city);
        }


    }
}
