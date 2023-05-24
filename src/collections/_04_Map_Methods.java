package collections;

import java.util.*;

public class _04_Map_Methods {
    public static void main(String[] args) {
        /*
        Create a map to store the countries with their capitals
        Key         Value
        Country     Capital City
        France      Paris
        Italy       Rome
        Spain       Madrid
         */

        HashMap<String, String> capitals = new HashMap<>();

        System.out.println("\n----------How to add-update entries to a map-----------\n");
        capitals.put("France", "Paris");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");

        System.out.println("\n----------How to print a map-----------\n");
        System.out.println(capitals); // {Italy=Rome, France=Paris, Spain=Madrid}


        System.out.println("\n----------How to retrieve a value with their respective key-----------\n");
        System.out.println(capitals.get("France")); // Paris
        System.out.println(capitals.get("Italy")); // Rome
        System.out.println(capitals.get("Spain")); // Madrid

        System.out.println(capitals.get("USA")); // null
        System.out.println(capitals.get("france")); // null


        System.out.println("\n----------How to check if map contains given key or value-----------\n");
        System.out.println(capitals.containsKey("Italy")); // true
        System.out.println(capitals.containsKey("Belgium")); // false

        System.out.println(capitals.containsValue("Rome")); // true
        System.out.println(capitals.containsValue("madrid")); // false


        System.out.println("\n----------How to remove some entries------------\n");
        System.out.println(capitals.remove("USA")); // null
        System.out.println(capitals.remove("Italy", "rome")); // false

        System.out.println(capitals.remove("Italy")); // Rome
        System.out.println(capitals.remove("Spain", "Madrid")); // true
        System.out.println(capitals); // {France=Paris}


        System.out.println("\n----------How to get the size of the map------------\n");
        System.out.println(capitals.size()); // 1

        capitals.put("Ukraine", "Kyiv");
        capitals.put("Turkiye", "Ankara");

        System.out.println(capitals); // {Turkiye=Ankara, Ukraine=Kyiv, France=Paris}
        System.out.println(capitals.size()); // 3


        System.out.println("\n----------How to get all keys------------\n");
        System.out.println(capitals.keySet()); // [Turkiye, Ukraine, France]

        Set<String> keys = capitals.keySet();

        for(String key : keys){
            System.out.println(key);
        }

        System.out.println("\n----------How to get all values------------\n");
        System.out.println(capitals.values()); // [Ankara, Kyiv, Paris]

        Collection<String> values = capitals.values();

        for(String value : values){
            System.out.println(value);
        }


        System.out.println("\n----------How to get all entries------------\n");
        System.out.println(capitals.entrySet()); // [Turkiye=Ankara, Ukraine=Kyiv, France=Paris]

        Set<Map.Entry<String, String>> entries = capitals.entrySet();

        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
