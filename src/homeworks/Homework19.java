package homeworks;

import java.util.HashMap;
import java.util.Map;

public class Homework19 {
    public static void main(String[] args) {

        System.out.println("\n-Task 1-\n");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isEvenIndexSum = true;

        int result = sum(numbers, isEvenIndexSum);
        System.out.println("Sum of elements at even indexes: " + result);

        isEvenIndexSum = false;
        result = sum(numbers, isEvenIndexSum);
        System.out.println("Sum of elements at odd indexes: " + result);

        System.out.println("\n-Task 2-\n");

        String text = "Hello, world!";
        int n = 2;

        String result2 = nthChars(text, n);
        System.out.println("Original String: " + text);
        System.out.println("String with every " + n + "th character: " + result);

        System.out.println("\n-Task 3-\n");
        String str1 = "Hello World";
        String str2 = "dowel rollh";

        boolean result3 = canFormString(str1, str2);
        System.out.println("Can form the second string: " + result);

        System.out.println("\n-TASK 4-\n");

        String str4 = "listen";
        String str5 = "silent";
        boolean result4 = isAnagram(str1, str2);
        System.out.println("Are the strings anagrams? " + result);

    }
    public static int sum(int[] arr, boolean isEvenIndexSum) {
        int sum = 0;

        if (isEvenIndexSum) {
            // Sum of elements at even indexes (0, 2, 4, ...)
            for (int i = 0; i < arr.length; i += 2) {
                sum += arr[i];
            }
        } else {
            // Sum of elements at odd indexes (1, 3, 5, ...)
            for (int i = 1; i < arr.length; i += 2) {
                sum += arr[i];
            }
        }

        return sum;

    }

    public static String nthChars(String input, int n) {
        if (input == null || input.length() < n || n <= 0) {
            return "";
        }

        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < input.length(); i += n) {
            result2.append(input.charAt(i));
        }

        return result2.toString();
    }

    public static boolean canFormString(String first, String second) {
        if (first == null || second == null) {
            return false;
        }


        String firstModified = first.replaceAll("\\s", "").toLowerCase();
        String secondModified = second.replaceAll("\\s", "").toLowerCase();

        if (firstModified.length() != secondModified.length()) {
            return false;
        }


        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : firstModified.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : secondModified.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            charCountMap.put(c, count - 1);
        }

        return true;
    }

    public static boolean isAnagram(String str4, String str5) {
        if (str4 == null || str5 == null || str4.length() != str5.length()) {
            return false;
        }
        str4 = str4.toLowerCase();
        str5 = str5.toLowerCase();

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str4.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str4.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            charCountMap.put(c, count - 1);
        }

        return true;
    }

}

