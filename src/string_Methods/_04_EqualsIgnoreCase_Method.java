package string_Methods;

public class _04_EqualsIgnoreCase_Method {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hi";
        String str3 = " hello";
        String str4 = "HeLlOHI";

        String username = "A1B2c3";



        System.out.println(str1.equalsIgnoreCase(str2));//false

        System.out.println(str1.equalsIgnoreCase(str3));//true

        System.out.println("123".equalsIgnoreCase("123"));//true

        System.out.println((str1 + str2).equalsIgnoreCase(str4));


    }
}
