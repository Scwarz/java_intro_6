package string_Methods;

public class _05_ToLowerCase_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns a string
        3.non-static
        4.does not take arguments
         */

        String str1 = "JAVA IS FUN";
        String str2 = "java is fun";

        System.out.println(str1);//JAVA IS FUN

        System.out.println(str1.toLowerCase());//java is fun

        System.out.println(str2.toLowerCase());//java is fun


        char c = 'A';

        System.out.println((String.valueOf(c)).toLowerCase());


    }
}
