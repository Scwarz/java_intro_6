package homeworks;

import java.util.Arrays;

public class Homework18 {
    public static void main(String[] args) {
        // Task 1
        int[] arr1 = {1, 5, 10};
        boolean doubleValue1 = true;
        int[] result1 = doubleOrTriple(arr1, doubleValue1);
        System.out.println("Task 1:");
        System.out.println("Input: " + Arrays.toString(arr1) + ", doubleValue: " + doubleValue1);
        System.out.println("Output: " + Arrays.toString(result1));

        int[] arr2 = {3, 7, 2};
        boolean doubleValue2 = false;
        int[] result2 = doubleOrTriple(arr2, doubleValue2);
        System.out.println("\nInput: " + Arrays.toString(arr2) + ", doubleValue: " + doubleValue2);
        System.out.println("Output: " + Arrays.toString(result2));

        // Task 2
        String str1 = "Java";
        int splitBy1 = 2;
        String result3 = splitString(str1, splitBy1);
        System.out.println("\nTask 2:");
        System.out.println("Input: \"" + str1 + "\", splitBy: " + splitBy1);
        System.out.println("Output: \"" + result3 + "\"");

        String str2 = "JavaScript";
        int splitBy2 = 5;
        String result4 = splitString(str2, splitBy2);
        System.out.println("\nInput: \"" + str2 + "\", splitBy: " + splitBy2);
        System.out.println("Output: \"" + result4 + "\"");

        String str3 = "Hello";
        int splitBy3 = 3;
        String result5 = splitString(str3, splitBy3);
        System.out.println("\nInput: \"" + str3 + "\", splitBy: " + splitBy3);
        System.out.println("Output: \"" + result5 + "\"");

        // Task 3:
        String str4 = "Mom and Dad";
        int palindromeCount1 = countPalindrome(str4);
        System.out.println("\nTask 3:");
        System.out.println("Input: \"" + str4 + "\"");
        System.out.println("Palindrome Count: " + palindromeCount1);

        String str5 = "Kayak races attracts racecar drivers";
        int palindromeCount2 = countPalindrome(str5);
        System.out.println("\nInput: \"" + str5 + "\"");
        System.out.println("Palindrome Count: " + palindromeCount2);

    }

    public static int[] doubleOrTriple(int[] arr, boolean doubleValue) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (doubleValue) {
                result[i] = arr[i] * 2;
            } else {
                result[i] = arr[i] * 3;
            }
        }

        return result;
    }

    public static String splitString(String str, int splitBy) {
        if (str.length() % splitBy != 0) {
            return "";
        }

        int chunkSize = str.length() / splitBy;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % chunkSize == 0) {
                result.append(' ');
            }
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static int countPalindrome(String str) {
        String[] words = str.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}

