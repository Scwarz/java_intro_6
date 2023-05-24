package string_Methods;

public class _15_IsEmpty_method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns boolean
        3. non-Static
        4. no arguments
         */
        String emptyStr = "";
        String word = "Hello";

        System.out.println("First String is empty = " + emptyStr.isEmpty());// true
        System.out.println("First String is empty = " + word.isEmpty());// false
    }
}
