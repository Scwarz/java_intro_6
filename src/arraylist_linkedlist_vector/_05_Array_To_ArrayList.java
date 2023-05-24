package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _05_Array_To_ArrayList {
    public static void main(String[] args) {

        /*
        HOW TO CONVERT AN ARRAY TO AN ARRAYLIST
        1. Arrays.asList() method
        2. Loops - manual way
        3. Collections.addAll(collection1, collection2); // it will add collection2 into collection1
         */

        System.out.println("\n----------Way-1 asList() method-------\n");
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Berlin", "Paris", "Rome"));

        System.out.println(cities); // [Berlin, Paris, Rome]


        System.out.println("\n----------Way-2 loops-------\n");
        String[] countries = {"USA", "Germany", "Spain", "Italy"};

        ArrayList<String> list = new ArrayList<>();

        for(String country : countries){
            list.add(country);
        }

        System.out.println(list);


        System.out.println("\n----------Way-3 Collections.addAll() method-------\n");
        list = new ArrayList<>();

        Collections.addAll(list, countries);

        System.out.println(list);
    }
}
