package homeworks;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6};
        int[] arrRev = new int[arr1.length];

        int j = 0;
        for (int i = arr1.length-1; i >= 0 ; i--) {
            arrRev[i] = arr1[j];
            j++;
        }

        System.out.println(Arrays.toString(arrRev));




        int[] arr = {0,1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr));

        int firstNumber = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = firstNumber;

        System.out.println(Arrays.toString(arr));




        // 0 1 1 2 3 5 8 13


        ArrayList<Integer> answer = new ArrayList<>();
        int fib = ScannerHelper.getNumber();

        int first = 0;
        int second = 1;

        for (int i = 0; i < fib; i++) {
            answer.add(first);
            int nextNum = first + second;
            first = second;
            second = nextNum;
        }

        System.out.println(answer);


/*
        System.out.println("=======================================================");
        String word = "Civic";
        String revWord = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            revWord += word.charAt(i);
        }

        System.out.println(word.equalsIgnoreCase(revWord));


        System.out.println("\n==========Task07==========\n");
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(chars);
        for (Character c : chars) {
            System.out.println(c);
        }
        System.out.println("\n==========Task08==========\n");
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        System.out.println(obj);
        Collections.sort(obj);
        System.out.println(obj);

        int startsWithM = 0, noAorE = 0;

        for (String s : obj) {
            if(s.toLowerCase().startsWith("m")) startsWithM++;
            if(!(s.toLowerCase().contains("a") || s.toLowerCase().contains("e"))) noAorE++;
            //if(!s.toLowerCase().contains("a") && !s.toLowerCase().contains("e"))
        }

        System.out.println(startsWithM);
        System.out.println(noAorE);

        System.out.println("\n==========Task09==========\n");

        ArrayList<String> kitchenObj1 = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        int startsUpper = 0, startsLower = 0, containsP = 0, startsEndsWithP = 0;

        for (String s : kitchenObj1) {
            if(Character.isLowerCase(s.charAt(0))) startsLower++;
            else startsUpper++;

            if(s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")){
                containsP++;
                startsEndsWithP++;
            }else if(s.toLowerCase().contains("p")) containsP++;
        }

        System.out.println(kitchenObj1);
        System.out.println("Elements starts with uppercase = " + startsUpper);
        System.out.println("Elements starts with lowercase = " + startsLower);
        System.out.println("Elements having P or p= " + containsP);
        System.out.println("Elements starting or ending with P or p = " + startsEndsWithP);

        System.out.println("\n==========Task10==========\n");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));


        System.out.println("Elements that can be divided by 10 = " + list1.stream().filter(x -> x % 10 == 0).count());
        System.out.println("Elements that are even and greater than 15 = " + list1.stream().filter(x-> x >= 15 && x % 2 == 0).count());
        System.out.println("Elements that are odd and less than 20 = " + list1.stream().filter(x->x % 2 == 1 && x <20).count());
        System.out.println("Elements that are less than 15 or greater than 50 = " + list1.stream().filter(x -> x<15 || x>50).count());
/*
        int divideBy10 = 0, evenGreaterThan15 = 0, oddLessThan20 = 0, less15Greater50 = 0;

        for(int n : list1){
            if(n % 10 == 0) divideBy10++;
            if(n > 15 && n % 2 == 0) evenGreaterThan15++;
            if(n < 20 && n % 2 == 1) oddLessThan20++;
            if(n < 15 || n > 50) less15Greater50++;
        }
        System.out.println(list1);
        System.out.println("Elements that can be divided by 10 = " + divideBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Greater50);

 */


    }

}
