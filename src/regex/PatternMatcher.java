package regex;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String input = ScannerHelper.getString();
        System.out.println(Pattern.matches("[a-z0-9_ -]{3,11}",input));
        // "java" -> true
        // "i love java" -> false
        // "1a2B3" -> false
        // "tech-global-school" -> false



        Pattern pattern = Pattern.compile("Java");//compiles String regex into a Regex pattern
        Matcher matcher = pattern.matcher("I love Java, Java is fun");

        System.out.println(pattern);// prints out compiled regex pattern as a Pattern

        System.out.println(pattern.toString());// prints out compiled regex pattern as a string
        System.out.println(pattern.pattern());// prints out compiled regex pattern as a string

        System.out.println(matcher.matches());


        System.out.println();


        int counter = 0;
        while(matcher.find()){// matcher.find() -> finds the next matched word in the given string and returns true or false
            counter++;
            System.out.println(matcher.group());// prints out the found matched word
            System.out.println(matcher.start());// prints out the starting index of the matched word
            System.out.println(matcher.end());// prints out the ending index of the matched word
        }
        System.out.println("Java count: " + counter);


        //Exercise 4
        System.out.println("\n==========EXERCISE04==========\n");
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{9,15}", "BalsiLwa$Di01"));


        //Phone number validation

        String phoneNumberRegex = "\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}";
        System.out.println(Pattern.matches(phoneNumberRegex, "(123)-283-9786"));

        //(xxx)-xxx-xxxx
        //(xxx) -> [0-9]{3}
        //xxx
        //xxxx
    }
}
