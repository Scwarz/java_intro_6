package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _11_Remove_Elements_Iterator {
    public static void main(String[] args) {
        //Remove all the elements that are more than 10 -> [10, 5, 3, 0]


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 12, 5, 3, 0, 30));

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
           if(iterator.next() > 10) iterator.remove();
        }

        System.out.println(numbers);

    }
}
