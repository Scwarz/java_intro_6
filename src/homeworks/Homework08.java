package Homeworks;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n ---- Task01 ---- \n");
        System.out.println(countConsonants("hello"));
        System.out.println(countConsonants("JAVA"));
        System.out.println(countConsonants(""));


        System.out.println("\n ---- Task02 ---- \n");
        System.out.println(Arrays.toString(wordArray("Hello my name is yousef")));
        System.out.println(Arrays.toString(wordArray("Hello")));
        System.out.println(Arrays.toString(wordArray("Java is fun")));


        System.out.println("\n ---- Task03 ---- \n");

        System.out.println(removeExtraSpaces("java  is    fun"));





        System.out.println("\n ---- Task04 ---- \n");

        System.out.println(count3OrLess());


        System.out.println("\n ---- Task05 ---- \n");
        System.out.println(dateFormatValid("01/21/1999"));
        System.out.println(dateFormatValid("1/20/1991"));
        System.out.println(dateFormatValid("10/2/1991"));

        System.out.println("\n ---- Task06 ---- \n");
        System.out.println(isEmailFormatValid("abc@gmail.com"));
        System.out.println(isEmailFormatValid("abc@student.techglobal.com"));
        System.out.println(isEmailFormatValid("a@gmail.com"));
        System.out.println(isEmailFormatValid("abcd@@gmail.com"));
        System.out.println(isEmailFormatValid("abc@gmail"));

    }
    public static int countConsonants(String word){

        word = word.replaceAll("[aeiouAEIOU]","");

        return word.length();

    }

    public static String[] wordArray(String sentence){

        String regex = "[A-Za-z]{1,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        int wordCount = 0;
        ArrayList<String> words = new ArrayList<>();

        while(matcher.find()){
            words.add(matcher.group());
            wordCount++;
        }

        String[] arr = new String[words.size()];

        arr = words.toArray(new String[0]);

        return arr;


    }

    public static String removeExtraSpaces(String str){

        String result = str.replaceAll("\\s+", " ");

        result = result.trim();

        return result;

    }



    public static int count3OrLess(){
        String sentence = ScannerHelper.getString();

        String[] arr = sentence.split(" ");

        int count = 0;

        Pattern pattern = Pattern.compile("[a-zA-z,]{1,3}");

        for (String s : arr) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) count++;
        }

        return count;

    }

    public static boolean dateFormatValid(String date){

        Pattern pattern = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static boolean isEmailFormatValid(String email){
        Pattern pattern = Pattern.compile("[0-9a-zA-Z]{2,}@[a-zA-Z.]{1,}[.com]");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }







}

