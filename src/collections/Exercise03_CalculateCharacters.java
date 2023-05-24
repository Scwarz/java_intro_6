package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Exercise03_CalculateCharacters {
    public static void main(String[] args) {
        /*
        You are given a String as "banana"
        Print all duplicated letters

        Expected:
        a
        n

        Key             Value
        Character       CountOFTheCharacter
        b               1
        a               3
        n               2

        Print the key which has the value more than 1
         */

        System.out.println("\n-----------TASK-1----------\n");

        String str = "banana";

        HashMap<Character, Integer> lettersMap = new HashMap(); // {}

        for(char letter: str.toCharArray()){ // b
           if(!lettersMap.containsKey(letter)) lettersMap.put(letter, 1);
           else lettersMap.put(letter, lettersMap.get(letter) + 1);
        }

        // System.out.println(lettersMap); // {a=3, b=1, n=2}


        for(Map.Entry<Character, Integer> entry : lettersMap.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey());
        }

        /*
        Assume that you are given a String like "pineapple"
        Find the most counted character and print it with a message like below

        EXPECTED OUTPUT:
        Character "p" is the most counted with 3 times.

        NOTE: Assume that there will always be one character that is counted the most.


        Key     Value
        p       3
        i       1
        n       1
        e       2
        a       1
        l       1
         */

        System.out.println("\n-----------TASK-2----------\n");
        String word = "pineapple";

        Map<Character, Integer> charactersMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if(charactersMap.containsKey(currentChar)) charactersMap.put(currentChar, charactersMap.get(currentChar) + 1);
            else charactersMap.put(currentChar, 1);
        }

        // System.out.println(charactersMap); // {p=3, a=1, e=2, i=1, l=1, n=1}

        // System.out.println(charactersMap.values()); // [3, 1, 2, 1, 1, 1]

        int maxCount = new TreeSet<>(charactersMap.values()).last();

        // System.out.println(maxCount); // 3

        for(Map.Entry<Character, Integer> entry : charactersMap.entrySet()){
            if(entry.getValue() == maxCount) {
                System.out.println("Character \"" + entry.getKey() + "\" is the most counted with " + entry.getValue() + " times.");
                break;
            }
        }
    }
}
