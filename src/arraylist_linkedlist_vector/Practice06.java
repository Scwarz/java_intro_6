package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice06 {
    public static void main(String[] args) {
        System.out.println("==========TASK01==========\n");
        System.out.println(Arrays.toString(double1(new int[]{3, 2, 5, 7, 0})));

        System.out.println("\n==========TASK02==========\n");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        System.out.println(secondMax(list));

        System.out.println("\n==========TASK03==========\n");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,1,1,1));
        System.out.println(secondMin(list1));

        System.out.println("\n==========TASK04==========\n");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(null, null, null));
        System.out.println(removeEmpty(list2));

        System.out.println("\n==========TASK05==========\n");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-12, -123, -5, 1000, 500, 0));
        System.out.println(remove3orMore(list3));

        System.out.println("\n==========TASK06==========\n");
        System.out.println(uniqueWords("Star Light Star Bright"));


    }
    /*
    ////////////////////TASK01

    Write a method called as double to double each element
    in an int array and return it back.
    NOTE: The return type is an array.
    Test data 1:
    {3, 2, 5, 7, 0}
    Expected output 1:
            [6, 4, 10, 14, 0]
    Test data 2:
            [-2, 0, 3, 10, 100]
    Expected output 2:
            [-4, 0, 6, 20, 200]
    NOTE: Make your code dynamic that works for any given
    array.

     */

    public static int[] double1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
/*
    ////////////////////TASK02

        Requirement:
        Write a method called as secondMax to find and return
        the second max number in an ArrayList
        Test data 1:
        {2, 3, 7, 1, 1, 7, 1}
        Expected output 1:
        3
        Test data 2:
        [5, 7, 2, 2, 10, 10]
        Expected output 2:
        7
        NOTE: Make your code dynamic that works for any
        given ArrayList
 */

    public static int secondMax(ArrayList<Integer> list){//2, 3, 7, 1, 1, 7, 1
        Collections.sort(list);//1, 1, 1, 2, 3, 7, 7

        for (int i = list.size()-2; i >= 0 ; i--) {
            if(list.get(i) < list.get(list.size() - 1)) return list.get(i);
        }
        return -1;


        /*
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        //WAY1
        for (int n : list) {
            max = Math.max(max, n);
        }
        for (int n : list) {
            if(n > secondMax && n < max) secondMax = n;
        }

        //WAY2
        for (int n : list) {
            if(n > max) {
                secondMax = max;
                max = n;
            }
        }

         */

        /*
      ////////////////////TASK03

        Requirement:
        Write a method called as secondMin to find and return
        the second min number in an ArrayList
        Test data 1:
        {2, 3, 7, 1, 1, 7, 1}
        Expected output 1:
        2
        Test data 2:
        [5, 7, 2, 2, 10, 10]
        Expected output 2:
        5
        NOTE: Make your code dynamic that works for any
        given ArrayList
         */
    }
    public static int secondMin(ArrayList<Integer> list){
        Collections.sort(list);
        // 1,1,1,1,1,1
        //
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) > list.get(0)) return list.get(i);
        }
        System.out.println("There is no second min");
        return -1;

    }

    public static ArrayList<String> removeEmpty(ArrayList<String> list){

        /*
        list.removeIf(e -> e == null || e.isEmpty());
        return list;
         */

        //Way 2
        ArrayList<String> noEmpty = new ArrayList<>();
        for (String s : list) {
            if(s != null){
                if(!s.isEmpty()) noEmpty.add(s);
            }

        }
        return noEmpty;

    }

    public static ArrayList<Integer> remove3orMore(ArrayList<Integer> list){
        /*
        Way 1:
        list.removeIf(e -> Math.abs(e) >= 100);
        return list;

         */

        ArrayList<Integer> listRemovedElements = new ArrayList<>();
        for (int n : list) {
            if(Math.abs(n) < 100) listRemovedElements.add(n);
        }
        return listRemovedElements;

    }

    public static ArrayList<String> uniqueWords(String str){//"Star Light star Bright"
        ArrayList<String> strAsList = new ArrayList<>();

        String[] arr = str.split(" "); //[Star, Light, Star, Bright]

        for(String s : arr){
            if(!strAsList.contains(s)) strAsList.add(s);
        }

        return strAsList;
    }


}
