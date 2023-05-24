package homeworks;

import java.util.Arrays;

public class Homework06 {

    public static void main(String[] args) {
        System.out.println("\n==========TASK05==========\n");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs) + "\n" + Arrays.asList(dogs).contains("Pluto"));


        System.out.println("\n==========TASK06==========\n");
        String[] arrStr = {"Garfield", "Tom", "Sylvester", "Azrael", "Felix"};
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));

        System.out.println(Arrays.asList(arrStr).contains("Garfield") && Arrays.asList(arrStr).contains("Felix"));
        /*
        WAY 1:
        if(Arrays.toString(arrStr).contains("Felix") && Arrays.toString(arrStr).contains("Garfield"))
            System.out.println("true");
        else System.out.println("false");


        WAY 2:
        boolean containsGarfield = false, containsFelix = false;

        for (String s : arrStr) {
            if(s.equals("Garfield")) containsGarfield = true;
            else if(s.equals("Felix"))containsFelix = true;
        }
        System.out.println(containsFelix && containsGarfield);

         */


        System.out.println("\n==========TASK07==========\n");
        double[] doubleArr = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubleArr));
        for (double d : doubleArr) {
            System.out.println(d);
        }



        System.out.println("\n==========TASK08==========\n");
        char[] charArr = {'A', 'b', 'G', 'H', '7','5', '&', '*', 'e', '@', '4'};
        int lowercase = 0, uppercase = 0, digits = 0, sc = 0;

        for(char c : charArr){
            if(Character.isUpperCase(c)) uppercase++;
            else if(Character.isLowerCase(c)) lowercase++;
            else if(Character.isDigit(c)) digits++;
            else sc++;
        }
        System.out.println(Arrays.toString(charArr));
        System.out.println("Letters = " + (uppercase + lowercase));
        System.out.println("Uppercase letters = " + uppercase);
        System.out.println("Lowercase letters = " + lowercase);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + sc);

        System.out.println("\n==========TASK09==========\n");
        String[] strArr = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int UCase = 0, LCase = 0, startsWithBorP = 0, containsBookPen = 0;

        for (String s : strArr) {
            if(Character.isUpperCase(s.charAt(0)))UCase++;
            else LCase++;

            if(s.toLowerCase().charAt(0) == 'b' || s.toLowerCase().charAt(0) == 'p')startsWithBorP++;
            if(s.toLowerCase().contains("book") || s.toLowerCase().contains("pen"))containsBookPen++;
        }
        System.out.println(Arrays.toString(strArr));
        System.out.println("Elements starts with uppercase = " + UCase);
        System.out.println("Elements starts with lowercase = " + LCase);
        System.out.println("Elements starts with B or P = " + startsWithBorP);
        System.out.println("Elements having ”book” or “pen”= " + containsBookPen);


        System.out.println("\n==========TASK10==========\n");
        int[] numbers = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int moreThan10 = 0, lessThan10 = 0, is10 = 0;

        for(int n : numbers){
            if(n > 10) moreThan10++;
            else if(n < 10) lessThan10++;
            else is10++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + is10);

        System.out.println("\n==========TASK11==========\n");
        int[] arr1 = {5, 8, 13, 1, 2};
        int[] arr2 = {9, 3, 67, 1, 0};
        int[] maxArr = new int[arr1.length];

        for (int i = 0; i < maxArr.length; i++) {
            maxArr[i] = Math.max(arr1[i], arr2[i]);
        }


        System.out.println("1st array is = " + Arrays.toString(arr1));
        System.out.println("2nd array is = " + Arrays.toString(arr2));
        System.out.println("3rd array is = " + Arrays.toString(maxArr));
    }
}
