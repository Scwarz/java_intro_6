package arraylist_linkedlist_vector;


import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02_CountNumbers {

    public static void main(String[] args) {
        System.out.println(countEven(new ArrayList<>(Arrays.asList(2, 3, 5)))); // 1
        System.out.println(countEven(new ArrayList<>(Arrays.asList(10, 20, 30)))); // 3
        System.out.println(countEven(new ArrayList<>())); // 0
        System.out.println(countEven(new ArrayList<>(Arrays.asList(-1, 3, 17, 25)))); // 0



        more15(new ArrayList<>(Arrays.asList(10, 5, 2, -20))); // 0
        more15(new ArrayList<>(Arrays.asList(100, 200, 45))); // 3
        more15(new ArrayList<>()); // 0



        System.out.println(no3(new ArrayList<>(Arrays.asList(0, 1, 30, 13)))); // 2
        System.out.println(no3(new ArrayList<>(Arrays.asList(13, 3, 30, 300, 533)))); // 5
    }

    /*
    Write a method called as countEven that takes an ArrayList of Integer
    It returns the total count of elements that can be divided 2

    [2, 3, 5]       -> 1
    [10, 20, 30]    -> 3
    []              -> 0
    [-1, 3, 17, 25] -> 0
    */
/*
    public static int countEven(ArrayList<Integer> list){
        int count = 0;

        for (Integer integer : list) {
            if(integer % 2 == 0) count++;
        }

        return count;
    }

 */

    public static int countEven(ArrayList<Integer> list){
        return (int) list.stream().filter(element -> element % 2 == 0).count();
    }



    /*
    Write a method called as more15 that takes an ArrayList of Integer
    It prints how many elements in the list are more than 15

    [10, 5, 2, -20]  -> prints 0
    [100, 200, 45]   -> prints 3
    []               -> prints 0
     */

    public static void more15(ArrayList<Integer> list){
        System.out.println(list.stream().filter(x -> x > 15).count());
    }


    /*
        Write a method called as no3 that takes ArrayList of Integer
        It counts all the numbers that has 3 as a digit inside the number
        It returns the total count of the elements that has 3 as a digit

        [13, 3, 30, 300, 533]   -> 5
        [0, 1, 30, 13]          -> 2
        []                      -> 0
        [3333]                  -> 1
     */
/*
    public static int no3(ArrayList<Integer> list){
        int count = 0;

        for (Integer integer : list) {
            //if(String.valueOf(integer).contains("3")) count++;
            if(integer.toString().contains("3")) count++;
        }

        return count;
    }

 */

    public static int no3(ArrayList<Integer> list){
        return (int) list.stream().filter(e -> e.toString().contains("3")).count();
    }
}
