package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("\n ====== Task 1 ====== \n");
        System.out.println(countWords("     Java is fun    "));
        System.out.println("\n ====== Task 2 ====== \n");
        System.out.println(countA("TechGlobal is a QA bootcamp"));
        System.out.println("\n ====== Task 3 ====== \n");
        System.out.println(removeDuplicateNumbers(new ArrayList<Integer>(Arrays.asList(-45, 0, 0, 34, 5, 67))));
        System.out.println("\n ====== Task 4 ====== \n");
        System.out.println(removeDuplicateNumbers(new ArrayList<Integer>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60))));
        System.out.println("\n ====== Task 5 ====== \n");
        System.out.println(removeDuplicateElements(new ArrayList<String>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"))));
        System.out.println("\n ====== Task 6 ====== \n");
        System.out.println(" I  am  learning  Java   ");
        System.out.println("\n ====== Task 7 ====== \n");

    }

    // method 01

    public static int countWords(String sentence){

        String[] words = sentence.trim().split(" ");

        return words.length;
    }

    //method 02
    public static int countA(String sentence){
        int countA = 0;

        for (int i = 0; i <= sentence.length()-1; i++) {

            if(sentence.toLowerCase().charAt(0) == 'a') countA++;

        }
        return countA;

    }

    // method 03

    public static int countPos(ArrayList<Integer> nums){

        int countPos = 0;

        for (Integer num : nums) {
            if(num >= 1)countPos++;
        }
        return countPos;
    }

    // method 04

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> nums){

        ArrayList<Integer> cleanList = new ArrayList<>();

        for (Integer num : nums) {

            if(cleanList.contains(num))continue;
            else cleanList.add(num);
        }
        return cleanList;

    }


    public static ArrayList<String> removeDuplicateElements(ArrayList<String> Words){

        ArrayList<String> cleanList = new ArrayList<>();

        for (String  word : Words) {

            if(cleanList.contains(word))continue;
            else cleanList.add(word);
        }
        return cleanList;

    }

    public static String removeExtraSpaces(String str){

        String result = str.replaceAll("\\s+", " ");

        result = result.trim();

        return result;

    }
}
