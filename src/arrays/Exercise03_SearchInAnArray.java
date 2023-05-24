package arrays;

import java.util.Arrays;

public class Exercise03_SearchInAnArray {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        /*
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        RESULT:
        true
        */

        System.out.println("\n--------Loop way-------\n");

        boolean hasM = false;

        for (String object : objects) {
            if(object.equals("Mouse")){
                hasM = true;
                break;
            }
        }

        System.out.println(hasM);



        System.out.println("\n--------binarySearch() way-------\n");
        Arrays.sort(objects); // [Keyboard, Mouse, Mouse, Remote, iPad]

        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "mouse") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "board") >= 0); // false

    }
}
