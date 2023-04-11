package projects;

import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {

        System.out.println("\n ---- task 01 ---- \n");
        System.out.println(findClosestDistance(new int[]{4,8,7,15}));
        System.out.println(findClosestDistance(new int[]{10, -5, 20, 50, 100}));

        System.out.println("\n ---- task 02 ---- \n");
        System.out.println(findSingleNumber(new int[]{2}));
        System.out.println(findSingleNumber(new int[]{5,3,-1,3,5,7,-1}));

        System.out.println("\n ---- task 03 ---- \n");
        System.out.println(findFirstUniqueCharacter("abc abc d"));
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abab"));

        System.out.println("\n ---- task 04 ---- \n");
        System.out.println(findMissingNumber(new int[]{2,4}));
        System.out.println(findMissingNumber(new int[]{2,3,1,5}));
        System.out.println(findMissingNumber(new int[]{4,7,8,6}));

    }

    public static int findClosestDistance(int[] arrs){

        int smallestDistance = Integer.MAX_VALUE;

        if(arrs.length >= 2){
            for (int i = 0; i < arrs.length; i++) {

                for (int j = i + 1; j <arrs.length ; j++) {

                    int difference = Math.abs(Math.max(arrs[i],arrs[j]) - Math.min(arrs[i],arrs[j]));
                    if (difference < smallestDistance) smallestDistance = difference;
                }
            }

        } else smallestDistance = -1;

        return smallestDistance;
    }



    public static int findSingleNumber(int[] arr) {

        Arrays.sort(arr);


        int num = 0;
        while (num < arr.length-1){
            if (arr[num] != arr[num + 1]) return arr[num];

            num = num + 2;

        }
        return arr[num];
    }


    public static char findFirstUniqueCharacter(String word){
        int len = word.length();
        int i = 0;
        char unique = '0';

        while(i < len){
            char c = word.charAt(i);
            int firstIndex = word.indexOf(c);
            int lastIndex = word.lastIndexOf(c);
            if (firstIndex == lastIndex) {
                unique = c;
                break;
            }
            else unique = ' ';

            i++;
        }
        return unique;
    }
    public static int findMissingNumber(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] > 1)return arr[i]+1;
        }
        return -1;
    }



}

