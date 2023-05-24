package string_Methods;

public class _14_Replace_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returning a String
        3. Non Static method
        4. takes 2 arguments: either a 2 chars or 2 Strings
         */
        String str = "ABC123";

        System.out.println(str);//ABC123

        str = str.replace("ABC", "abc");
        System.out.println(str);//abc123

        System.out.println(str.replace("2",""));//ABC13


    }
}
