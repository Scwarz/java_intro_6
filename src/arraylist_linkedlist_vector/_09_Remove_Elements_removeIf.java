package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _09_Remove_Elements_removeIf {
    public static void main(String[] args) {

        //Remove all the colors that has "R" or "r" as a letter

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Purple", "Blue", "Yellow"));

        System.out.println("Before remove = " + colors);

        // Remove the elements that are asked to be removed by using removeIf() method
        colors.removeIf(element -> element.toLowerCase().contains("r"));
        System.out.println("After remove = " + colors);

    }
}
