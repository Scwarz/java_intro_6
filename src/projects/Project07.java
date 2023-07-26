package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {

    public static void main(String[] args) {
        String[] arr1 = {"foo", "", "", "foo bar", "java is fun", " ruby "};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        String pass1 = "";
        String pass2 = "abcd";
        String pass3 = "abcd1234";
        String pass4 = "Abcd1234";
        String pass5 = "Abcd123!";

        String email1 = "a@gmail.com";
        String email2 = "abc@g.com";
        String email3 = "abc@gmail.c";
        String email4 = "abc@@gmail.com";
        String email5 = "abcd@gmail.com";

        System.out.println("***** Task 1 *****");
        System.out.println(countMultipleWords(arr1));

        System.out.println("\n***** Task 2 *****");
        System.out.println(removeNegatives(list2));

        System.out.println("\n***** Task 3 *****");
        System.out.println(validatePassword(pass1));
        System.out.println(validatePassword(pass2));
        System.out.println(validatePassword(pass3));
        System.out.println(validatePassword(pass4));
        System.out.println(validatePassword(pass5));

        System.out.println("\n***** Task 4 *****");
        System.out.println(validateEmailAddress(email1));
        System.out.println(validateEmailAddress(email2));
        System.out.println(validateEmailAddress(email3));
        System.out.println(validateEmailAddress(email4));
        System.out.println(validateEmailAddress(email5));
    }
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int el : list){
            if(el >= 0) newList.add(el);
        }
        return newList;
    }
    public static int countMultipleWords(String[] arr){
        int counter = 0;
        for(String el : arr){
            if(el.split(" ").length > 1) counter++;

        }

        return counter;
    }

    public static boolean validatePassword(String str){
        boolean hasDigit = false, hasUpper = false, hasLower = false, hasSpecial = false;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) hasUpper = true;
            else if(Character.isDigit(str.charAt(i))) hasDigit = true;
            else if(Character.isLowerCase(str.charAt(i))) hasLower = true;
            else hasSpecial = true;

        }
        return (str.length() > 7 && str.length() < 17 && !str.contains(" ") && hasUpper && hasDigit && hasLower && hasSpecial);
    }

    public static boolean validateEmailAddress(String str){
        //format   <2+chars>         @          <2+chars>         .         <2+chars>
        //       <hasEmailName> <notMoreAt>  <hasAddressName>  <hasDot> <hasCharsAfterDot>
        boolean hasEmailName = false, notMoreAt = false, hasAddressName = false, hasCharsAfterDot = false, hasDot = false;
        int countAt = 0, countDot = 0;
        if(1 < str.substring(0, str.indexOf('@')).length()) hasEmailName = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '@') countAt++;
            else if(str.charAt(i) == '.') countDot++;
        }
        if(countAt == 1) notMoreAt = true;
        if(1 < str.substring(str.indexOf('@') + 1, str.indexOf('.')).length()) hasAddressName = true;
        if(countDot == 1) hasDot = true;
        if(1 < str.substring(str.indexOf('.') + 1).length()) hasCharsAfterDot = true;
        return (hasEmailName && notMoreAt && hasAddressName && hasCharsAfterDot && hasDot);
    }
}
