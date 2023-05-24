package string_Methods;

public class _12_StartsAndEndsWith_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns a boolean
        3. nonstatic
        4. takes a char or a string as arguments
         */

        String str = "TechGlobal";

        boolean startsWith = str.startsWith("T");
        boolean endsWith = str.endsWith("T");

        System.out.println(startsWith);//true
        System.out.println(endsWith);//false

        System.out.println(str.startsWith("Techgl"));//false

        System.out.println(str.endsWith("TechGlobal"));//true


    }
}
