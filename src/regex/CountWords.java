package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
    public static void main(String[] args) {
        String sentence = "hello,  my name is john.";
        String[] arr = sentence.split(" ");// ["hello,", "", "my", "name", "is", "john."]

        System.out.println("This sentence contains " + arr.length + " words");
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("\n==========REGEX WAY===========\n");
        //REGEX WAY

        Pattern pattern = Pattern.compile("[a-zA-Z]{1,}");
        Matcher matcher = pattern.matcher("hello,  my name is john.");
        int wordCount = 0;

        while(matcher.find()){
            System.out.println(matcher.group());
            wordCount++;
        }
        System.out.println("This sentence contains " + wordCount + " words");
    }
}
