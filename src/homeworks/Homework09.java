package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("==========Task01==========\n");

        int[] arr1 = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        System.out.println(firstDuplicatedNumber(arr1));
        System.out.println("\n==========Task02==========\n");
        System.out.println("\n==========Task03==========\n");
        System.out.println("\n==========Task04==========\n");

        String[] arr2 = {"A", "foo"};
        System.out.println(duplicatedStrings(arr2));

        System.out.println("\n==========Task05==========\n");

        String[] arr3 = {"ABC", "foo", "XYZ"};
        reversedArray(arr3);
        System.out.println("\n==========Task06==========\n");

        System.out.println(reveredString("Java is fun"));
    }

    ////////////////////////////////TASK01/////////////////////////////
    public static int firstDuplicatedNumber(int[] arr){
        ArrayList<Integer> container = new ArrayList<>();

        for (int i : arr) {
            if(container.contains(i)){
                return i;
            }else  container.add(i);
        }
        return -1;
    }

    ////////////////////////////////TASK02/////////////////////////////
    public static String firstDuplicatedString (String[] arr){
        ArrayList<String> container = new ArrayList<>();

        for (String s : arr) {
            if(container.contains(s.toLowerCase())){
                return s;
            }else  container.add(s.toLowerCase());
        }
        return "There is no duplicates";
    }
    ////////////////////////////////TASK03/////////////////////////////
    public static ArrayList<Integer> duplicatedStrings(int[] arr){
        ArrayList<Integer> dupContainer = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && !dupContainer.contains(arr[i])) dupContainer.add(arr[i]);
            }
        }
        return dupContainer;
    }
    ////////////////////////////////TASK04/////////////////////////////

    public static ArrayList<String> duplicatedStrings(String[] arr){
        ArrayList<String> dupContainer = new ArrayList<>();
        ArrayList<String> solution = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].equalsIgnoreCase(arr[j]) && !dupContainer.contains(arr[i].toLowerCase())){

                    dupContainer.add(arr[i].toLowerCase());
                    solution.add(arr[i]);

                }
            }
        }
        return solution;
    }

    ////////////////////////////////TASK05/////////////////////////////

    public static void reversedArray(String[] arr){
        /*
        WAY: 1 -> Max Iteration
        ArrayList<String> reversedList = new ArrayList<>();

        for (int i = arr.length-1; i >= 0 ; i--) {
            reversedList.add(arr[i]);
        }

        System.out.println(reversedList);

         */

        /*
        Second way:
        arr = a, b, c, d, e, f
        i: 0
        startingIndex: 0 1 2 3
        endingIndex: 5 4 3 2
        Storage: a, b, c

        first i: f, b, c, d, e, a
        sec i:   f, e, c, d, b, a
        third i: f, e, d, c, b, a


        int startingIndex = 0;
        int endingIndex = arr.length-1;
        String storage;

        while(startingIndex < endingIndex){
            storage = arr[startingIndex];
            arr[startingIndex] = arr[endingIndex];
            arr[endingIndex] = storage;

            startingIndex++;
            endingIndex--;
        }
        System.out.println(Arrays.toString(arr));

         */

        //Way 3:
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

    }

    ////////////////////////////////TASK06/////////////////////////////

    public static String reveredString(String str) {
        String reveredStr = "";

        String[] strAsArr = str.trim().split("\\s+");

        for (String s : strAsArr) {
            reveredStr += new StringBuffer(s).reverse() + " ";

        }

        return reveredStr.trim();
