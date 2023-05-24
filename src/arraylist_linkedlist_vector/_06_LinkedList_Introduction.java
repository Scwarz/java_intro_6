package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.LinkedList;

public class _06_LinkedList_Introduction {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>(Arrays.asList("Berlin", "Rome", "Kyiv", "Ankara", "Madrid", "Chicago"));

        System.out.println(cities.size()); // 6
        System.out.println(cities.contains("Miami")); // false
        System.out.println(cities.indexOf("Evanston")); // -1

        System.out.println(cities.getFirst()); // Berlin
        System.out.println(cities.getLast()); // Chicago

        System.out.println(cities.removeFirst()); // Berlin
        System.out.println(cities.removeLast()); // Chicago

        System.out.println(cities); // [Rome, Kyiv, Ankara, Madrid]


        System.out.println(cities.pop()); // Rome

        System.out.println(cities); // [Kyiv, Ankara, Madrid]

        cities.push("Barcelona");

        System.out.println(cities);

        System.out.println(cities.offer("Gent")); // true

        System.out.println(cities); // [Barcelona, Kyiv, Ankara, Madrid, Gent]
    }
}
