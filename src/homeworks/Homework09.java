package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Homework09 {

    public static void main(String[] args) {
        System.out.println("===== TASK 1=====");
        System.out.println(firstDuplicateNumber(new int[] {-4,0,-7,0,5,10,45,45}));
        System.out.println("===== TASK 2=====");
        System.out.println(duplicateStrings(new String[] {"A","foo","12","Foo","bar","a","a","Java"}));
        System.out.println(duplicateStrings(new String[] {"Python","foo","bar","java","123"}));
        System.out.println("===== TASK 3=====");
        System.out.println(reversedArray(new String[] {"abc","foo","bar"}));
        System.out.println("===== TASK 4=====");
        System.out.println(reverseStringWords("Java is fun"));
    }


    public static int firstDuplicateNumber(int[] arr){

        int num = 0;

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                    break;
                }
            }
        }
        return num;
    }


    public static ArrayList<String> duplicateStrings(String[] arr){

        ArrayList<String>duplicate = new ArrayList<>();

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].toLowerCase().equals(arr[i].toLowerCase())) duplicate.add(arr[i]);

            }
        }
        return duplicate;
    }


    public static String reversedArray(String[] arr){

        ArrayList<String> reversedArr = new ArrayList<>();

        for (int i = arr.length-1 ; i >= 0 ; i--) {

            reversedArr.add(arr[i]);
        }

        return Arrays.toString(reversedArr.toArray());
    }


    public static StringBuilder reverseStringWords(String sentence){

        String[] words = sentence.split(" ");

        StringBuilder reverseSentence = new StringBuilder();

        for (String word : words) {

            StringBuilder r = new StringBuilder(word);

            reverseSentence.append(r.reverse()).append(" ");

        }

        return reverseSentence;

    }

}

