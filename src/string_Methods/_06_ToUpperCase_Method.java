package string_Methods;

public class _06_ToUpperCase_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns string
        3.NonStatic
        4. no arguments
         */



        System.out.println("HelloWorld".toUpperCase());//HELLOWORLD

        System.out.println("".toUpperCase());

        String s1 = "HELLO";
        String s2 = "hello";


        if(s1.toUpperCase().equals(s2.toUpperCase())) System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");
    }
}
