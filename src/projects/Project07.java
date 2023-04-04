package projects;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {
        System.out.println("======TASK 1=====");
        String[] task1Array1 = {"foo", "", " ", "foo bar", "java is fun", "ruby "};
        System.out.println(countMultipleWords(task1Array1));
        System.out.println("======TASK 2=====");
        System.out.println(removeNegatives(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
        System.out.println("======TASK 3=====");
        System.out.println(validatePassword("Abcd123!"));
        System.out.println("======TASK 4=====");
        System.out.println(validateEmailAddress("abcd@gmail.com"));
    }

    public static int countMultipleWords(String[] arr){
        int counter = 0;
        for(String el : arr){
            if(el.split(" ").length > 1) counter++;
        }

        return counter;
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int el : list){
            if(el >= 0) newList.add(el);
        }
        return newList;
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
