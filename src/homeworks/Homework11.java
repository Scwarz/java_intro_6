package Homeworks;

import utilities.MathHelper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n----Task01----\n");
        System.out.println(noSpace("Tech G lobal is th e best schoo l"));

        System.out.println("\n----Task02----\n");
        System.out.println(replaceFirstLast("   A    "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(replaceFirstLast("Tech Global"));

        System.out.println("\n----Task03----\n");
        System.out.println(hasVowels("gym"));

        System.out.println("\n----Task04----\n");
        System.out.println(checkAge(2000));
        System.out.println(checkAge(2010));

        System.out.println("\n----Task05----\n");
        System.out.println(averageOfEdge(10,13,20));

        System.out.println("\n----Task06----\n");
        System.out.println(Arrays.toString(noA(new String[]{"appium", "123","ABC","java"})));

        System.out.println("\n----Task07----\n");
        System.out.println(Arrays.toString(no3Or5(new int[]{10,11,12,13,14,15})));

        System.out.println("\n----Task08----\n");
        System.out.println(Arrays.toString(new int[]{countPrimes(new int[]{-10, -3, 0,1})}));
        System.out.println(Arrays.toString(new int[]{countPrimes(new int[]{7,4,11,23,17})}));


    }

    //method01

    public static String noSpace(String sentence){

        String result = sentence.replaceAll("\\s+","");
        result = result.trim();

        return result;

    }

    //method02

    public static String replaceFirstLast(String Sentence){

        String trim = Sentence.trim();

        if(trim.length() >= 3){

            return trim.charAt(trim.length()-1) + trim.substring(1,trim.length()-1) + trim.charAt(0);
        }
        else return "";
    }

    //method03
    public static boolean hasVowels(String str){

        char[] vowel = {'a','e','i','o','u'};

        boolean hasVowel = false;


        for (int i = 0; i <= str.length()-1 ; i++) {
            for (char c : vowel) {
                if (str.toLowerCase().charAt(i) == c) {
                    hasVowel = true;
                    break;
                }
            }
        }

        return hasVowel;
    }

    //method04

    public static String checkAge(int year){

        LocalDate currentDate = LocalDate.now();

        int currentYear = currentDate.getYear();

        int currentAge = (currentYear - year);

        if(currentAge >= 16 && currentAge <= 100) return "Age is Allowed";
        else if (currentAge <= 0 || currentAge > 100) return "Age is not valid";
        else  return "Age is not Allowed";
    }

    //method05

    public static int averageOfEdge(int num1,int num2,int num3){

        return (((MathHelper.maxOfThree(num1,num2,num3))+(MathHelper.minOfThree(num1,num2,num3)))/2);
    }

    //method06
    public static Object[] noA(String[] arr){

        ArrayList<String> arr1 = new ArrayList<>();

        for (String s : arr) {

            if (s.toLowerCase().startsWith("a")) arr1.add("###");
            else arr1.add(s);


        }

        return arr1.toArray();
    }


    //method07

    public static int[] no3Or5(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) arr[i] = 101;
            else if (arr[i] % 3 == 0) arr[i] = 100;
            else if (arr[i] % 5 == 0) arr[i] = 99;
            else continue;
        }
        return arr;
    }

    //method08

    public static int countPrimes(int[] arr){

        int counter = 0;

        for (int i : arr) {

            if(isPrime(i)) counter++;

        }
        return counter;

    }

    public static boolean isPrime(int n){

        if(n <= 1) return false;

        for (int i = 2; i < n; i++) {

            if(n % i == 0) return false;

        }

        return true;

    }






}

