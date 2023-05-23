package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("\n ===== TASK 1 ===== \n");
        System.out.println(noDigit("123Tech456Global149"));
        System.out.println("\n ===== TASK 2 ===== \n");
        System.out.println(noVowels("TechGlobal"));
        System.out.println("\n ===== TASK 3 ===== \n");
        System.out.println(sumOfDigits("“$125.0"));
        System.out.println("\n ===== TASK 4 ===== \n");
        System.out.println(hasUpperCase("John’s age is 29"));
        System.out.println("\n ===== TASK 5 ===== \n");
        System.out.println(middleInt(-1, 25, 10));
        System.out.println("\n ===== TASK 6 ===== \n");
        System.out.println(Arrays.toString(new int[] {13, 2, 3}));

    }

    /* Task 1
        Create a method called noDigit()
        -This method will take one String argument and it will return
        a new String with all digits removed from the original String
     */

    public static String noDigit(String str){
        return str.replaceAll("\\d", ""); //just returning the same string that has been edited by using a regex
    }

    /* Task 2
        Create a method called noVowel()
        -This method will take one String argument and it will
        return a new String with all vowels removed
        from the original String
     */

    public static String noVowels(String str){
        return str.replaceAll("[aeiou]", ""); //All vowels have been replaced using a regex and it returns the edited string
    }

    /* Task 3
        Create a method called sumOfDigits()
        -This method will take one String argument and
        it will return an int sum of all digits from the original String.
     */

    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }

    /* Task 4
        Create a method called hasUpperCase()
        -This method will take one String argument and it will return
        boolean true if there is an uppercase letter and false otherwise.
     */

    public static boolean hasUpperCase(String str){
        boolean hasUpperCase = false;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) hasUpperCase = true;
            break;
        }
        return hasUpperCase;
    }

    /*
    Create a method called middleInt()
    -This method will take three int arguments and it will return the middle int.
     */

    public static int middleInt(int a, int b, int c){
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b;
        } else {
            return c;
        }
    }

    /* Task 6
        Create a method called no13()
        -This method will take an int array as argument
        and it will return a new array with all 13 replaced with 0.
     */

    public static int[] no13(int[] arr){
        ArrayList<Integer> no13List = new ArrayList<>(arr.length);
        for(int element : arr){
            if(element == 13) no13List.add(0);
            else no13List.add(element);
        }
        int[] no13Arr = new int[no13List.size()];
        for (int i = 0; i < no13List.size(); i++) {
            no13Arr[i] = no13List.get(i);
        }
        return no13Arr;
    }
}
