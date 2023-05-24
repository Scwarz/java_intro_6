package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class _01_List {
    public static void main(String[] args) {
        /*
        List is an interface, and it has some class implementation
        1. ArrayList: The most common implementation of List interface
        2. LinkedList: the way it stores element is different ArrayList (node)
        3. Vector: synchronized List

        Common features:
            -They keep insertion order
            -They allow duplicates
            -They allow null elements
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("Carmela");
        list.add("Carmela");
        list.add("Zel");
        list.add("Zel");
        list.add("Okan");
        list.add(null);
        list.add(null);
        list.add(null);


        System.out.println(list); // [Carmela, Carmela, Zel, Zel, Okan, null, null, null]


        System.out.println("\n-----------ArrayList and LinkedList in the shape of List---------\n");
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new LinkedList<>();
        List<Integer> numbers3 = new Vector<>();


    }
}
