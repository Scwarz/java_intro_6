package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_CountStrings {

    public static void main(String[] args) {
        System.out.println(countO(new ArrayList<>(Arrays.asList("Hello", "Hi", "School", "Computer")))); // 3
        System.out.println(countO(new ArrayList<>(Arrays.asList("abc", "xyz")))); // 0
        System.out.println(countO(new ArrayList<>())); // 0
        System.out.println(countO(new ArrayList<>(Arrays.asList("Object", "Laptop")))); // 2


        System.out.println(more3(new ArrayList<>(Arrays.asList("Hello", "Hi", "School", "Computer")))); // 3
        System.out.println(more3(new ArrayList<>(Arrays.asList("abc", "xyz")))); // 2
        System.out.println(more3(new ArrayList<>())); // 0
        System.out.println(more3(new ArrayList<>(Arrays.asList("Object", "Laptop")))); // 2
    }


    /*
    Write method called as countO that takes an ArrayList of String as an argument
    It returns how many elements in the ArrayList contains "O" or "o"

    ["Hello", "Hi", "School", "Computer"]   -> 3
    ["abc", "xyz"]                          -> 0
    []                                      -> 0
    ["Object", "Laptop"]                    -> 2

     */

    public static int countO(ArrayList<String> list){
        int countO = 0;

        for (String element : list) {
            if(element.toLowerCase().contains("o")) countO++;
        }

        return countO;
    }

    /*
    Write a method called as more3 that takes an ArrayList of String as an argument
    It returns how many elements has length of 3 or more.

    ["Hello", "Hi", "School", "Computer"]   -> 3
    ["abc", "xyz"]                          -> 2
    []                                      -> 0
    ["Object", "Laptop"]                    -> 2


     */

    public static int more3(ArrayList<String> list){
        int count3 = 0;

        for (String s : list) {
            if(s.length() >= 3) count3++;
        }

        return count3;
    }


}
