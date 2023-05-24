package arrays.practice05;

import utilities.RandomGenerator;

import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {
        minAndMaxWithoutSort();
        minAndMaxUsingSort();
    }
     public static void minAndMaxUsingSort(){
         int[] randArr = {RandomGenerator.getRandomNumber(1,10),
                 RandomGenerator.getRandomNumber(1,10),
                 RandomGenerator.getRandomNumber(1,10),
                 RandomGenerator.getRandomNumber(1,10),
                 RandomGenerator.getRandomNumber(1,10)};
         System.out.println(Arrays.toString(randArr));
         Arrays.sort(randArr);
         System.out.println(Arrays.toString(randArr));

         System.out.println("The max number is = " + randArr[4]);
         System.out.println("The min number is = " + randArr[0]);

     }

    public static void minAndMaxWithoutSort(){
        int[] randArr = {RandomGenerator.getRandomNumber(1,10),
                        RandomGenerator.getRandomNumber(1,10),
                        RandomGenerator.getRandomNumber(1,10),
                        RandomGenerator.getRandomNumber(1,10),
                        RandomGenerator.getRandomNumber(1,10)};

        System.out.println(Arrays.toString(randArr));

        int min = 10;
        int max = 1;

        for (int i : randArr) {
            if(i > max) max = i;
            else if(i<min) min = i;
        }
        System.out.println("The max number is = " + max);
        System.out.println("The min number is = " + min);
       // System.out.println(Math.max(Math.max(Math.max(randArr[0],randArr[1]),Math.max(randArr[2],randArr[3])),randArr[4]));

    }
}
