package collections;

import java.util.*;

public class _02_Set {
    public static void main(String[] args) {
        /*
        SET comes to mind when we talk about collections that has unique elements

        Set is an interface, and it has some class implementation as below
            -Set does not keep insertion order
            -Set does not allow duplicates
            -Set allow ONLY 1 null element

        1. HashSet: the most common Set implementation
               - It does not keep insertion order - unpredictable
               - It does not allow duplicates
               - It allows ONLY 1 null element

        2. LinkedHashSet
               - It keeps insertion order - predictable
               - It does not allow duplicates
               - It allows ONLY 1 null element

        3. TreeSet
               - It keeps insertion order - it sorts the elements
               - It does not allow duplicates
               - It DOES NOT ALLOW any null element as it does not know how to sort it with numbers and strings when the element is null
         */

        System.out.println("\n----------HashSet---------\n");
        HashSet<String> objects = new HashSet<>();
        objects.add(null);
        objects.add("Sandina");
        objects.add(null);
        objects.add("Okan");
        objects.add("Alex");
        objects.add("Alex");
        objects.add("John");
        objects.add("abc");
        objects.add("123");
        objects.add("");
        objects.add("Sal");
        objects.add("Boo");


        System.out.println(objects); // [null, Sandina, , Alex, 123, abc, Boo, John, Okan, Sal]

        objects.remove(null);

        System.out.println(objects); // [Sandina, , Alex, 123, abc, Boo, John, Okan, Sal]

        objects.add(null);

        System.out.println(objects); // [Sandina, , null, Alex, 123, abc, Boo, John, Okan, Sal]
        ArrayList<String> list = new ArrayList<>(objects);
        System.out.println(list.get(2)); //


        System.out.println("\n----------LinkedHashSet---------\n");
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add(null);
        words.add("Sandina");
        words.add(null);
        words.add("Okan");
        words.add("Alex");
        words.add("Alex");
        words.add("John");
        words.add("abc");
        words.add("123");
        words.add("");
        words.add("Sal");
        words.add("Boo");

        System.out.println(words); // [null, Sandina, Okan, Alex, John, abc, 123, , Sal, Boo]


        System.out.println("\n----------TreeSet---------\n");
        TreeSet<String> treeSet = new TreeSet<>();
        //treeSet.add(null); // NullPointerException
        treeSet.add("Sandina");
        treeSet.add("Okan");
        treeSet.add("Alex");
        treeSet.add("Alex");
        treeSet.add("John");
        treeSet.add("abc");
        treeSet.add("123");
        treeSet.add("");
        treeSet.add("Sal");
        treeSet.add("Boo");

        System.out.println(treeSet); // [, 123, Alex, Boo, John, Okan, Sal, Sandina, abc]

        System.out.println(treeSet.descendingSet()); // [abc, Sandina, Sal, Okan, John, Boo, Alex, 123, ]

        System.out.println(treeSet.subSet("Boo", "Sandina")); // [Boo, John, Okan, Sal]

        System.out.println(treeSet.tailSet("Okan")); // [Okan, Sal, Sandina, abc]
        System.out.println(treeSet.headSet("Okan")); // [, 123, Alex, Boo, John]

        System.out.println(treeSet.floor("Okan")); // Okan
        System.out.println(treeSet.ceiling("Okan")); // Okan

        System.out.println(treeSet.lower("Okan")); // John
        System.out.println(treeSet.higher("Okan")); // Sal

        System.out.println(treeSet.first()); // min
        System.out.println(treeSet.last()); // max

        System.out.println("\n-----------HashSet, LinkedHashSet and TreeSet in the shape of Set----------\n");
        Set<Integer> number1 = new HashSet<>();
        Set<Integer> number2 = new LinkedHashSet<>();
        Set<Integer> number3 = new TreeSet<>();

    }
}
