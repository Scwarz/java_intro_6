package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("\n --- task01 --- \n");
        System.out.println(fibonacciSeries1(3));
        System.out.println(fibonacciSeries1(8));
        System.out.println("\n --- task02 --- \n");
        System.out.println(fibonacciSeries2(3));
        System.out.println(fibonacciSeries2(8));
        System.out.println("\n --- task03 --- \n");
        System.out.println(Arrays.toString(findUnique(new int[] {1,2,3,4}, new int[] {3,4,5,5})));
        System.out.println("\n --- task04 --- \n");
        System.out.println(firstDuplicate(new int[]{1,2,2,3}));
        System.out.println(firstDuplicate(new int[]{1,2,3,3,4,1}));
        System.out.println("\n --- task05 --- \n");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));
    }

    public static String fibonacciSeries1(int numb) {
        int[] arr = new int[numb];
        int first = 0, second = 1;

        for (int i = 0; i < numb; i++) {
            arr[i] = (first);
            int nextNum = first + second;
            first = second;
            second = nextNum;
        }
        return Arrays.toString(arr);
    }

    public static int fibonacciSeries2(int numb) {
        int[] arr = new int[numb];
        int first = 0, second = 1;

        for (int i = 0; i < numb; i++) {
            arr[i] = (first);
            int nextNum = first + second;
            first = second;
            second = nextNum;
        }
        return arr[arr.length-1];
    }
    public static int[] findUnique(int[] arr1, int[] arr2){

        int[] uniqueNumbs = new int[Math.max(arr1.length,arr2.length)];
        ArrayList<Integer> nonUniqueNumbs = new ArrayList<>();


        for (int i = 0; i <= arr1.length-1; i++) {

            for (int j = i+1; j <= arr2.length-1 ; j++) {

                if (arr1[i] == arr2[j])nonUniqueNumbs.add(i);
                else uniqueNumbs[i] = arr1[i];
            }

        }
        return uniqueNumbs;

    }
    public static int firstDuplicate(int[] arr){
        if (arr.length == 0 || arr.length == 1) return -1;
        else {
            int firstDup = 0;
            for (int i = 0; i <=arr.length-1; i++) {
                for (int j = i+1; j <= arr.length-1; j++) {
                    if (arr[i] == arr[j]) {
                        firstDup = arr[i];
                        break;
                    }
                    break;
                }

            }
            return firstDup;
        }
    }

    public static boolean isPowerOf3(int numb){
        return numb % 3 == 0 || numb == 1;
    }
}

