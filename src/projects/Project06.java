package projects;

import java.util.Arrays;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("==========TASK 1==========");
        int[] task1Numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(task1Numbers);
        System.out.println("==========TASK 2==========");
        int[] task2Numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallest(task2Numbers);
        System.out.println("==========TASK 3==========");
        int[] task3Numbers = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(task3Numbers);
        System.out.println("==========TASK 4==========");
        int[] task4Numbers = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(task4Numbers);
        System.out.println("==========TASK 5==========");
        String[] task5String = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(task5String);
        System.out.println("==========TASK 6==========");
        String[] task6String = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(task6String);


    }
    public static void findGreatestAndSmallestWithSort(int[] numbers){
        Arrays.sort(numbers);
        int task1Min = numbers[0];
        int task1Max = numbers[numbers.length - 1];
        System.out.println("Smallest = " + task1Min);
        System.out.println("Greatest = " + task1Max);
    }
    public static void findGreatestAndSmallest(int[] numbers){
        int task1Max = Integer.MAX_VALUE;
        int task1Min = Integer.MIN_VALUE;
        for (int number : numbers){
            task1Max = number < task1Max ? number : task1Max;
            task1Min = number > task1Min ? number : task1Min;
        }
        System.out.println("Smallest = " + task1Max);
        System.out.println("Greatest = " + task1Min);
    }



    public static void findSecondGreatestAndSmallestWithSort(int[] numbers){
        Arrays.sort(numbers);
        int task3Min = numbers[0];
        int task3Max = numbers[numbers.length - 1];
        int task3SecondMin = 0;
        int task3SecondMax = 0;

        //10, 5, 6, 7, 8, 5, 15, 15   5, 5, 6, 7, 8, 10, 15, 15
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] != task3Min) {
                task3SecondMin = numbers[i];
                break;
            }
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            if(numbers[i] != task3Max) {
                task3SecondMax = numbers[i];
                break;
            }
        }
        System.out.println("the smallest second is = " + task3SecondMin);
        System.out.println("the greatest second is = " + task3SecondMax);

    }

    public static void findSecondGreatestAndSmallest(int[] numbers) {
        //10, 5, 6, 7, 8, 5, 15, 15

        if (numbers.length > 0) {
            int minimum = numbers[0];
            int maximum = numbers[0];
            for (int number : numbers) {
                if (number > maximum) {
                    maximum = number;

                } else if (number < minimum) {
                    minimum = number;
                }

            }
            int secondMinimum = numbers[0];
            int secondMaximum = numbers[0];
            for (int numSecond : numbers){
                if(numSecond < secondMinimum && numSecond != minimum) secondMinimum = numSecond;
                else if(numSecond > secondMaximum && numSecond != maximum) secondMaximum = numSecond;
            }

            System.out.println("the smallest second is = " + secondMinimum);
            System.out.println("the greatest second is = " + secondMaximum);
        } else System.out.println("No data entered");
    }



    public static void findDuplicatedElementsInAnArray(String[] str){
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]))System.out.println(str[i]);
            }

        }

    }
    public static void findMostRepeatedElementInAnArray(String[] str){
        int count = 0;
        //[“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]
        int secondCount = 0;
        String strWord = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])){
                    count++;
                    if(count > secondCount){
                        strWord = str[i];
                    }
                }

            }


        }
        System.out.println(strWord);

    }
}
