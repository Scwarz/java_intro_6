package collections;

import java.util.*;

public class _03_Map {
    public static void main(String[] args) {
        /*
        Map is an interface, and it has some implementation classes
        1. HashMap: it is the most common implementation class
            	-it stores data as key-value pairs
                -Keys are always unique - one null
                -Keys can be considered as identifiers
                -Values can be duplicate - multiple null values
                -No insertion order - no methods with indexes

        2. LinkedHashMap:
        3. TreeMap
         */

        System.out.println("\n----------HashMap-----------\n");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Sandina", 25);
        hashMap.put("Zel", 20);
        hashMap.put("Assem", 27);
        hashMap.put("Assem", 24);
        hashMap.put("okan", 18);
        hashMap.put(null, 18);
        hashMap.put(null, 100);
        hashMap.put("", null);
        hashMap.put("Anton", null);
        hashMap.put("Jazzy", null);

        System.out.println(hashMap); // {Sandina=25, Zel=20, Assem=24, null=100, =null, Anton=null, Jazzy=null, okan=18}
        System.out.println(hashMap.size()); // 8


        System.out.println("\n---------LinkedHashMap---------\n");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putAll(hashMap);


        System.out.println(linkedHashMap); // {Sandina=25, Zel=20, Assem=24, okan=18, null=100, =null, Anton=null, Jazzy=null}


        System.out.println("\n-----------TreeMap-----------\n");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Sandina", 25);
        treeMap.put("Zel", 20);
        treeMap.put("Assem", 27);
        treeMap.put("Assem", 24);
        //treeMap.put(null, 50); // NullPointerException - null key is not allowed - the program breaks
        treeMap.put("Jazzy", null);
        treeMap.put("anton", null);

        System.out.println(treeMap); // {Assem=24, Jazzy=null, Sandina=25, Zel=20, anton=null}

        System.out.println(treeMap.descendingMap()); // {anton=null, Zel=20, Sandina=25, Jazzy=null, Assem=24}

        System.out.println(treeMap.firstKey()); // Assem
        System.out.println(treeMap.lastKey()); // anton
        System.out.println(treeMap.firstEntry()); // Assem=24
        System.out.println(treeMap.lastEntry()); // anton=null

        System.out.println("\n----------Hashtable---------\n");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Adam", 20);
        //hashtable.put(null, 25); // NullPointerException
        hashtable.put("Yana", null); // NullPointerException

        System.out.println(hashtable);


        System.out.println("\n---------HashMap, LinkedHashMap, TreeMap, Hashtable in the shape of Mao----------\n");
        Map<Integer, Integer> numbers1 = new HashMap<>();
        Map<Integer, Integer> numbers2 = new LinkedHashMap<>();
        Map<Integer, Integer> numbers3 = new TreeMap<>();
        Map<Integer, Integer> numbers4 = new Hashtable<>();
    }
}
