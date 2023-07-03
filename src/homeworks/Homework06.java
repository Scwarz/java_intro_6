package homeworks;

import java.util.Arrays;

public class Homework06 {




    public static void main(String[] args) {

        System.out.println("/t======TASK 1=====");
        int[] task1Numbers = new int[10];
        task1Numbers[2] = 23;
        task1Numbers[4] = 12;
        task1Numbers[7] = 34;
        task1Numbers[9] = 7;
        task1Numbers[6] = 15;
        task1Numbers[0] = 89;
        System.out.println(task1Numbers[3]);
        System.out.println(task1Numbers[0]);
        System.out.println(task1Numbers[9]);
        System.out.println(Arrays.toString(task1Numbers));
        System.out.println("/t======TASK 2=====");
        String[] task2String = new String[5];
        task2String[1] = "abc";
        task2String[4] = "xyz";
        System.out.println(task2String[3]);
        System.out.println(task2String[0]);
        System.out.println(task2String[4]);
        System.out.println(Arrays.toString(task2String));
        System.out.println("/t======TASK 3=====");
        int[] task3Numbers = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(task3Numbers));
        Arrays.sort(task3Numbers);
        System.out.println(Arrays.toString(task3Numbers));
        System.out.println("/t======TASK 4=====");
        String[] task4Countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(task4Countries));
        Arrays.sort(task4Countries);
        System.out.println(Arrays.toString(task4Countries));
        System.out.println("/t======TASK 5=====");
        String[] task5Dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(task5Dogs));
        for (String dogs : task5Dogs) {
            if (dogs.contains("Pluto")) System.out.println(true);
        }
        System.out.println("/t======TASK 6=====");
        String[] task6Cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(task6Cats);
        System.out.println(Arrays.toString(task6Cats));
        boolean containsFelix = false, containsGarfield = false;
        for(String cats : task6Cats){
            if (!containsFelix && cats.contains("Felix")) containsFelix = true;
        }
        for(String cats : task6Cats){
            if (!containsGarfield && cats.contains("Garfield")) containsGarfield = true;
        }
        System.out.println(containsFelix && containsGarfield);
        System.out.println("/t======TASK 7=====");
        double[] task7Numbers = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(task7Numbers));
        for (double number : task7Numbers){
            System.out.println(number);
        }
        System.out.println("/t======TASK 8=====");
        char[] task8String = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(task8String));
        int task8Letter = 0;
        int task8Uppercase = 0;
        int task8Lowercase = 0;
        int task8Digits = 0;
        int task8Specials = 0;
        for (char character : task8String) {
            if (Character.isLetter(character)) {
                task8Letter++;
                if (Character.isUpperCase(character)) task8Uppercase++;
                else if (Character.isLowerCase(character)) task8Lowercase++;
            }
            else if (Character.isDigit(character)) task8Digits++;
            else task8Specials++;
        }
        System.out.println("Letters = " + task8Letter);
        System.out.println("Uppercase letters = " + task8Uppercase);
        System.out.println("Lowercase letters = " + task8Lowercase);
        System.out.println("Digits = " + task8Digits);
        System.out.println("Special characters = " + task8Specials);
        System.out.println("/t======TASK 9=====");
        String[] task9String = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(task9String));
        int task9Uppercase = 0;
        int task9Lowercase = 0;
        int task9BOrP= 0;
        int task9BookOrPen = 0;
        for (String element : task9String){
            if (element.charAt(0) >= 65 && element.charAt(0) <= 90)  task9Uppercase++;
            if (element.charAt(0) >= 97 && element.charAt(0) <= 122)  task9Lowercase++;
            if (element.charAt(0) == 'b'|| element.charAt(0) == 'P'|| element.charAt(0) == 'B' || element.charAt(0) == 'p' )  task9BOrP++;
            if (element.toLowerCase().contains("book") || element.toLowerCase().contains("pen")) task9BookOrPen++;
        }
        System.out.println("Elements starts with uppercase = " + task9Uppercase);
        System.out.println("Elements starts with lowercase = " + task9Lowercase);
        System.out.println("Elements starts with B or P = " + task9BOrP);
        System.out.println("Elements starts with \"book\" or \"pen\" = " + task9BookOrPen);
        System.out.println("/t======TASK 10=====");
        int[] task9Numbers = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int task9More10 = 0;
        int task9Less10 = 0;
        int task9Are10 = 0;
        System.out.println(Arrays.toString(task9Numbers));
        for (int number : task9Numbers){
            if (number > 10) task9More10++;
            if (number < 10) task9Less10++;
            if (number == 10) task9Are10++;
        }
        System.out.println("Elements that are more than 10 = " + task9More10);
        System.out.println("Elements that are less than 10 = " + task9Less10);
        System.out.println("Elements that are 10 = " + task9Are10);
        System.out.println("/t======TASK 11=====");
        int[] task11Arr1 = {5, 8, 13, 1, 2};
        int[] task11Arr2 = {9, 3, 67, 1, 0};
        int[] task11Arr3 = new int[5];
        System.out.println(Arrays.toString(task11Arr1));
        System.out.println(Arrays.toString(task11Arr2));
        for (int i = 0; i < task11Arr3.length; i++) {
            task11Arr3[i] = Math.max(task11Arr1[i], task11Arr2[i]);
        }
        System.out.println(Arrays.toString(task11Arr3));

    }
}
