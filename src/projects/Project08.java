package projects;

import java.util.Arrays;

public class Project08 {
    /*
    TASK-1 - findClosestDistance() method
    •Write a method that takes an int[] array as an argument and returns the
    closest difference between the numbers.
    •This method will return an int which is the closest difference between 2
    elements in the array
    •NOTE: if array does not have at least 2 elements, then return -1.
     */
    public static int findClosestDistance(int[] arr) { // 4, 8, 7, 15
        // Two approaches:
        // 1: We can sort the array and find the difference between the next value, until we find the smallest diff
        // 2: Two loops, outer loop holds the ith value to subtract to the jth value, until we find the smallest diff

        if (arr.length < 2) return -1;

        Arrays.sort(arr); // 4, 7, 8, 15
        int ans = Integer.MAX_VALUE, len = arr.length - 1;

        for (int i = 0; i < len; i++) {
            // Find the difference between ith index and ith + 1 index
            int diff = arr[i + 1] - arr[i];
            if (diff < ans) ans = diff;
        }
        return ans;
    }

    /*
    TASK-2 – findSingleNumber() method
    Write a method that takes an int[] array as an argument and returns the
    element occurs only once.
    You will be given a non-empty array in which all the elements appear at
    least twice except for one.
     */
    public static int findSingleNumber(int[] arr) { // 2, 2, 2, 3, 3, 4, 4, 5, 5, 6
        // By sorting, we can compare the elements in pairs (or more) until we find an element without a pair
        if (arr.length == 1) return arr[0];

        Arrays.sort(arr);
        int len = arr.length - 1, found = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++) {
            // we need to restart i to the next unique element
            if (found != Integer.MIN_VALUE && arr[i] == found) continue;
            // if the number after our current ith element is the same as the ith element, then we can skip those numbers
            if(arr[i] != arr[i + 1]) return arr[i];
            else {
                found = arr[i]; // found = 2; -> found = 3
                i++;
            }
        }
        return arr[len];
    }

    // This won't work with more than two digit numbers!
    public static int findSingleNumberB(int[] arr) { // 2, 2, 3, 3, 4, 4, 5, 5, 6, 12
        if (arr.length == 1) return arr[0];
        String str = Arrays.toString(arr);
        str = str.substring(1); // removed [
        str = str.substring(0, str.length() - 1); // removed ]
        str = str.replaceAll(",", ""); // 2 2 3 3 4 4 5 5 6
        str = str.replaceAll("-", "");

        while(str.length() > 1) {
            str = str.trim();
            if (str.indexOf(str.charAt(0)) != str.lastIndexOf(str.charAt(0))) {
                str = str.replaceAll("" + str.charAt(0), "");
            }
            else return Integer.parseInt("" + str.charAt(0));
        }
        return Integer.parseInt(str);
    }

    /*
    TASK-3 - findFirstUniqueCharacter() method
    Write a method that takes a non-empty String as an argument and
    returns the first unique character in the String.
    This method returns a char.
    If there is no unique character in the String, then return empty String.
    This task is case-sensitive.
     */
    public static String findFirstUniqueCharacter(String str) { // H e l l o
        // we can ignore spaces
        str = str.replaceAll(" ", "");

        // create int array with all possible ascii values
        int[] charCount = new int[128]; // [][][][][][][][][][][][][].....[][][][H][][][h]

        // first loop will build the int array
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // second loop will iterate through the int array
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] == 1) return "" + c;
        }
        return "";
    }

    /*
    TASK-4 – findMissingNumber() method
    Write a method that takes an int[] array as an argument and returns the
    missing element.
    You will be given an array length of 2 at least.
    Array elements will be representing a sequence of numbers that increases
    by 1.
    Assume, there will always be a missing number from given array.
     */
    public static int findMissingNumber(int[] arr) {
        // Sort the sequence to compare the current value with the next
        // if the number differs by 2, then the missing number is current number + 1
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) return arr[i] + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("***** TASK 1 *****");
        System.out.println(findClosestDistance(new int[]{4}));
        System.out.println(findClosestDistance(new int[]{4, 8, 7, 15}));
        System.out.println(findClosestDistance(new int[]{10, -5, 20, 50, 100}));

        System.out.println("\n***** TASK 2a *****");
        System.out.println(findSingleNumber(new int[]{2}));
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 7, -1}));
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 5, 7, 3, -1}));

        System.out.println("\n***** TASK 2b *****");
        System.out.println(findSingleNumberB(new int[]{2}));
        System.out.println(findSingleNumberB(new int[]{5, 3, -1, 3, 5, 7, -1}));
        System.out.println(findSingleNumberB(new int[]{5, 3, -1, 3, 5, 5, 7, 3, -1}));

        System.out.println("\n***** TASK 3 *****");
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abc abc d"));
        System.out.println(findFirstUniqueCharacter("abab"));

        System.out.println("\n***** TASK 4 *****");
        System.out.println(findMissingNumber(new int[]{2, 4}));
        System.out.println(findMissingNumber(new int[]{2, 3, 1, 5}));
        System.out.println(findMissingNumber(new int[]{4, 7, 8, 6}));
    }
}
