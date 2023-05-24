package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise07_FindDuplicates {

    public static void main(String[] args) {
        System.out.println(countDuplicateNumbers(new int[]{5, 5, 3, 7, 10, 7, 15, 7})); // 2
        System.out.println(countDuplicateNumbers(new int[]{3, 5, 3, 3, 3})); // 1
        System.out.println(countDuplicateNumbers(new int[]{10, 10, 10, 10, 10})); // 1
        System.out.println(countDuplicateNumbers(new int[]{2, 10, 25})); // 0
        System.out.println(countDuplicateNumbers(new int[0])); // 0


        System.out.println(countDuplicateString(new String[]{"Apple", "123", "12", "Apple"})); // 1
        System.out.println(countDuplicateString(new String[]{"a", "xx", "a", "A", "A"})); // 2
        System.out.println(countDuplicateString(new String[]{"abc", "abc", "abc", "abc"})); // 1
        System.out.println(countDuplicateString(new String[]{"John", "Jane", "john"})); // 0
        System.out.println(countDuplicateString(new String[0])); // 0
    }


    /*
    Write a method that counts how many duplicates you have in an int array
    It returns the count of duplicated elements

    [5, 5, 3, 7, 10, 7, 15, 7]      -> 2
    [3, 5, 3, 3, 3]                 -> 1
    [10, 10, 10, 10, 10]            -> 1
    [2, 10, 25]                     -> 0
    []                              -> 0
     */
/*
    public static int countDuplicateNumbers(int[] arr){
        int count = 0;
        String duplicates = "";

        //Count all the duplicates
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(!duplicates.contains("" + arr[i]) && arr[i] == arr[j]){
                    duplicates += "-" + arr[i] + "-";
                    count++;
                    break;
                }
            }
        }

        return count;
    }
 */
/*
    public static int countDuplicateNumbers(int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(!duplicates.contains(arr[i]) && arr[i] == arr[j]) duplicates.add(arr[i]);
            }
        }
        //System.out.println(duplicates);
        return duplicates.size();
    }

 */
    public static int countDuplicateNumbers(int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> uniques = new ArrayList<>();

        for(Integer element : arr){
            if(!uniques.contains(element)) uniques.add(element);
            else if(!duplicates.contains(element)) duplicates.add(element);
        }

        return duplicates.size();
    }


    /*
    Write a method that counts how many duplicates you have in a String array
    It returns the count of duplicated elements

    ["Apple", "123", "12", "Apple"]      -> 1
    ["a", "xx", "a", "A", "A"]           -> 2
    ["abc", "abc", "abc", "abc"]         -> 1
    ["John", "Jane", "john"]             -> 0
    []                                   -> 0
     */

    public static int countDuplicateString(String[] arr){
        ArrayList<String> uniques = new ArrayList<>();
        ArrayList<String> duplicates = new ArrayList<>();

        for(String element : arr){
            if(!uniques.contains(element)) uniques.add(element);
            else if(!duplicates.contains(element)) duplicates.add(element);
        }

        return duplicates.size();
    }


}
