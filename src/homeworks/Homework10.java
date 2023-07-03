package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {

    public static void main(String[] args) {
        System.out.println("==========TASK8==========");
        int[] arr = {10, -13,12, 8, 15, -20};
        System.out.println(findClosestTo10(arr));

        System.out.println("==========TASK7==========");
        int[] arr2 = {10, 3, 6, 3, 2};
        int[] arr3 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(sum(arr2, arr3)));

        System.out.println("==========TASK6==========");
        System.out.println(removeExtraSpaces("  I   am      learning     Java     "));// Java is Fun

        System.out.println("==========TASK5==========");
        ArrayList<String> strList1 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));

        System.out.println(removeDuplicateElements(strList1));// [java, C#, ruby, JAVA, C++]


        System.out.println("==========TASK4==========");
        ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(intList1));// [10, 20, 35, 60, 70]


        System.out.println("==========TASK02==========");
        System.out.println(countA("TechGlobal is a QA bootcamp"));


    }

    //////////////////Task01/////////////////////

    public static int countWords(String str){
        return str.trim().split("[\\s]+").length;
    }

    //////////////////Task02/////////////////////

    public static int countA(String str){
        return str.replaceAll("[^aA]", "").length();
    }

    //////////////////Task03/////////////////////
    public static int countPos(ArrayList<Integer> list){
        return (int) list.stream().filter(e -> e > 0).count();
    }


    //////////////////Task04/////////////////////

    public static ArrayList<Integer> removeDuplicateNumbers (ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();

        for (int s : list) {
            if(!newList.contains(s)) newList.add(s);
        }
        return newList;
    }

    //////////////////Task05/////////////////////
    public static ArrayList<String> removeDuplicateElements (ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();

        for (String s : list) {
            if(!newList.contains(s)) newList.add(s);
        }
        return newList;
    }


    //////////////////Task06/////////////////////

    public static String removeExtraSpaces (String str){// java   is fun - > java is fun
        return str.trim().replaceAll("[\\s]+", " ");

//        String newStr = "";
//
//        char[] strAsArr = str.toCharArray();
//
//        for (int i = 0; i < strAsArr.length; i++) {
//            if(strAsArr[i] != ' ') newStr += strAsArr[i];
//            else if(i != strAsArr.length-1 && strAsArr[i+1] != ' ') newStr += strAsArr[i];
//        }
//
//        return newStr.trim();

    }

    //////////////////Task07/////////////////////

    public static int[] sum (int[] arr1, int[] arr2){
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            if(arr1.length> arr2.length) arr1[i] += arr2[i];
            else arr2[i] += arr1[i];
        }

        return arr1.length > arr2.length ? arr1 : arr2;
    }


    //////////////////Task08/////////////////////
    public static int findClosestTo10 (int[] arr){// 3 5 6 10 12 25 45 62
//        Arrays.sort(arr);
//        int numberBefore10 = 0;
//        int numberAfter10 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < 10) numberBefore10 = arr[i];
//            else break;
//        }
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if(arr[i] > 10 ) numberAfter10 = arr[i];
//        }
//
//        if(Math.abs(numberBefore10 - 10) <= numberAfter10 - 10) return numberBefore10;
//        else return numberAfter10;


        Arrays.sort(arr);
        int closest = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number != 10 && Math.abs(number - 10) < Math.abs(closest - 10)) {
                closest = number;
            }
        }
        return closest;

    }

}
