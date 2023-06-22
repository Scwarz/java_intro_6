package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Homework13 {

    public static void main(String[] args) {
        System.out.println("\n ========== Task 01 ========== \n");
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("123$"));
        System.out.println(hasLowerCase("hello"));
        System.out.println("\n ========== Task 02 ========== \n");
        System.out.println(Arrays.toString(new ArrayList[]{noZero(new ArrayList<Integer>(Arrays.asList(1, 1, 10)))}));
        System.out.println(Arrays.toString(new ArrayList[]{noZero(new ArrayList<Integer>(Arrays.asList(0, 1, 10)))}));
        System.out.println(Arrays.toString(new ArrayList[]{noZero(new ArrayList<Integer>(Arrays.asList(0, 0, 0)))}));
        System.out.println("\n ========== Task 04 ========== \n");
        System.out.println(containsValue(new String[] {"abc","foo","java"},"hello"));
        System.out.println(containsValue(new String[] {"abc","foo","java"},"ABC"));
        System.out.println(containsValue(new String[] {"abc","foo","java","def","123"},"123"));
        System.out.println("\n ========== Task 05 ========== \n");
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));
    }

    public static boolean hasLowerCase(String sentence) {

        boolean isLower = false;


        for (int i = 0; i <= sentence.length() - 1; i++) {

            if (sentence.charAt(i) == sentence.toLowerCase().charAt(i)) {
                isLower = true;
                break;
            }
        }
        return isLower;
    }

    public static ArrayList<Integer> noZero(ArrayList<Integer> numbs){

        ArrayList<Integer> noZeros = new ArrayList<>();
        for (Integer numb : numbs) {

            if(numb >= 1) noZeros.add(numb);

        }
        return noZeros;
    }




    public static boolean containsValue(String[] arr,String word){

        boolean containsValue = false;

        for (String s : arr) {

            if (Objects.equals(s, word)){
                containsValue = true;
                break;
            }

        }
        return containsValue;

    }

    public static String reverseSentence(String sentence){

        String reverseWord = "";

        if(sentence.contains(" ")){
            ArrayList<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));

            for (int i = words.size()-1 ; i >= 0 ; i--) {

                reverseWord += words.get(i) + " ";
            }
            return reverseWord.substring(reverseWord.length()-1);

        }
        else return "There is not enough words!";
    }
}


