package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise03_RemoveElements {

    public static void main(String[] args) {
        System.out.println(removeVowels(new ArrayList<>(Arrays.asList("Hello", "World")))); // []
        System.out.println(removeVowels(new ArrayList<>(Arrays.asList("abc", "A", "123")))); // [123]
        System.out.println(removeVowels(new ArrayList<>(Arrays.asList("xyz", "tt", "   ")))); // [xyz, tt,     ]

        System.out.println(removeVowels2(new ArrayList<>(Arrays.asList("Hello", "World")))); // []
        System.out.println(removeVowels2(new ArrayList<>(Arrays.asList("abc", "A", "123")))); // [123]
        System.out.println(removeVowels2(new ArrayList<>(Arrays.asList("xyz", "tt", "   ")))); // [xyz, tt,     ]

        System.out.println(removeVowels3(new ArrayList<>(Arrays.asList("Hello", "World")))); // []
        System.out.println(removeVowels3(new ArrayList<>(Arrays.asList("abc", "A", "123")))); // [123]
        System.out.println(removeVowels3(new ArrayList<>(Arrays.asList("xyz", "tt", "   ")))); // [xyz, tt,     ]
    }

    /*
    Write a method that takes an ArrayList of String and removes all the elements that has a vowel letter
    It returns an ArrayList of String
    Name the method as removeVowels

    a,e,o,u,i,A,E,O,U,I

    ["Hello", "World"]          -> []
    ["abc", "A", "123"]         -> [123]
    ["xyz", "tt", "   "]        -> [xyz, tt,     ]

     */

    public static ArrayList<String> removeVowels(ArrayList<String> list){
        list.removeIf(element -> element.toLowerCase().contains("a") ||
                element.toLowerCase().contains("e") || element.toLowerCase().contains("i") ||
                element.toLowerCase().contains("u") || element.toLowerCase().contains("o"));

        return list;
    }


    public static ArrayList<String> removeVowels2(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<>();

        for (String element : list) {
            if(!element.toLowerCase().contains("a") && !element.toLowerCase().contains("e") &&
                    !element.toLowerCase().contains("i") && !element.toLowerCase().contains("o") &&
                    !element.toLowerCase().contains("u")) result.add(element);
        }

        return result;
    }


    public static ArrayList<String> removeVowels3(ArrayList<String> list){
        Iterator<String> iterator = list.iterator(); // Hello, World

        while(iterator.hasNext()){ // false
            String currentElement = iterator.next();

            if(currentElement.toLowerCase().contains("a") ||
                    currentElement.toLowerCase().contains("e") ||
                    currentElement.toLowerCase().contains("i") ||
                    currentElement.toLowerCase().contains("o") ||
                    currentElement.toLowerCase().contains("u")) iterator.remove();
        }

        return list;
    }

}
