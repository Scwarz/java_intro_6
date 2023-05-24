package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_Remove_Elements_Loop {
    public static void main(String[] args) {
        //Remove all the colors that has "R" or "r" as a letter

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Purple", "Blue", "Yellow"));

        System.out.println("Before remove = " + colors);

        /*
        //ConcurrentModificationException
        for (String element : colors) {
            if(element.toUpperCase().contains("R")) colors.remove(element);
        }
         */

        ArrayList<String> newList = new ArrayList<>();

        for (String element : colors) {
            if(!element.toUpperCase().contains("R")) newList.add(element);
        }


        System.out.println("After remove = " + newList); // [Blue, Yellow]
    }
}
