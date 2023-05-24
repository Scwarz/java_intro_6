package homeworks;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("==========TASK01==========\n");
        System.out.println(countConsonants("Hello123$%aaaaaB"));

        System.out.println("==========TASK02==========\n");
        System.out.println(Arrays.toString(wordArray("Hello, nice to meet you!!")));//1st - > first

        System.out.println("==========TASK03==========\n");
        System.out.println(removeExtraSpaces("   hi ,    nice    to    meet   you   "));

        System.out.println("==========TASK04==========\n");

        //System.out.println(count3OrLess());

        System.out.println("==========TASK05==========\n");
        System.out.println(isDateFormatValid("04/12/2022"));

        System.out.println("==========TASK06==========\n");
        System.out.println(isEmailFormatValid("john.doe@gmail.io"));

    }

    public static int countConsonants(String str){// Hello123$%aaaaaB
        str = str.replaceAll("[^a-zA-Z]","");
        str = str.replaceAll("[aeiouAEIOU]","");
        return str.length();//4
    }

    public static String[] wordArray(String str){
        str = str.replaceAll("\\s+"," ");
        str = str.replaceAll("[^a-zA-Z ]","");
        return str.split(" ");

//        Pattern pattern = Pattern.compile("[a-zA-Z]+");
//        Matcher matcher = pattern.matcher(str);
//
//        List<String> list = new ArrayList<>();
//
//        while(matcher.find()){
//            list.add(matcher.group());
//        }
//        return list.toArray(new String[0]);
    }

    public static String removeExtraSpaces(String str){
        str = str.trim();
        str = str.replaceAll("( )+"," ");
        return str;
    }

    public static int count3OrLess(){

        String str = ScannerHelper.getString();
        if (!str.contains(" ")){
            if (str.length()>3)return 0;
            else return 1;
        }
        return str.split("\\b\\w{1,3}\\b").length;
    }
//        str = str.replaceAll("[^a-zA-Z ]","").trim();
//        String [] arr = str.split("\\s+");
//
//        int counter = 0;
//
//        for (String s : arr) {
//            if(s.length()<=3){
//                counter++;
//            }
//        }
//        return counter;

    public static boolean isDateFormatValid(String DOB){
        return DOB.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}");
    }

    public static boolean isEmailFormatValid(String email){
        return email.matches("[\\w.]{2,}@[a-zA_Z_.-]{2,}.[a-zA-Z]{2,}");
    }

}
