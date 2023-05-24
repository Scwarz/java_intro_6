package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_ArrayList_Introduction {
    public static void main(String[] args) {

        // 1. How to create an Array vs ArrayList
        System.out.println("\n-----TASK-1-----\n");
        String[] array = new String[3];
        ArrayList<String> list = new ArrayList<>(); // capacity = 10 by default


        // 2. How to get size of an Array and ArrayList
        System.out.println("\n-----TASK-2-----\n");
        System.out.println("The size of the array = " + array.length); // 3
        System.out.println("The size of the list = " + list.size()); // 0


        // 3. How to print an Array vs ArrayList
        System.out.println("\n-----TASK-3-----\n");
        System.out.println("The array = " + Arrays.toString(array)); // [null, null, null]
        System.out.println("The list = " + list); // []


        // 4. How to add elements to anArray vs ArrayList
        System.out.println("\n-----TASK-4-----\n");
        array[1] = "Alex";
        array[2] = "Max";
        array[0] = "John";

        System.out.println("The array = " + Arrays.toString(array)); // [John, Alex, Max]

        list.add("Joe");
        list.add("Jane");
        list.add("Mike");
        list.add("Adam");

        list.add(2, "Jazzy");
        //list.add(7, "Yahya"); // IndexOutOfBoundsException
        System.out.println("The list = " + list); // [Joe, Jane, Jazzy, Mike, Adam]


        // 5. How to update an existing element in an Array vs ArrayList
        System.out.println("\n-----TASK-5-----\n");
        array[1] = "Ali";
        System.out.println("The array = " + Arrays.toString(array)); // [John, Ali, Max]

        list.set(1, "Jasmine");
        System.out.println("The list = " + list); // [Joe, Jasmine, Jazzy, Mike, Adam]


        // 6. How to retrieve-get and element from Array vs ArrayList
        System.out.println("\n-----TASK-6-----\n");
        System.out.println(array[2]); // Max
        System.out.println(list.get(3)); // Mike


        // 7. How to loop an Array vs ArrayList
        System.out.println("\n-----TASK-7 - fori loop-----\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println("\n-----TASK-7 - for each loop-----\n");
        for(String element : array){
            System.out.println(element);
        }

        for(String  element : list){
            System.out.println(element);
        }


        System.out.println("\n-----forEach() method-----\n");
        list.forEach(System.out::println);
    }
}
