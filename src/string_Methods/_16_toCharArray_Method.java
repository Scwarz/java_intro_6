package string_Methods;

import java.util.Arrays;

public class _16_toCharArray_Method {
    public static void main(String[] args) {

        String name = "John";

        char[] charsOfName = name.toCharArray(); // ACCEPTABLE

        System.out.println(Arrays.toString(charsOfName)); // [J, o, h, n]

        // Print the element at the index of 1 -> o
        System.out.println(charsOfName[1]); // o

        System.out.println(charsOfName.length); // 4

        for (char c : charsOfName) {
            System.out.println(c);
        }

    }
}
