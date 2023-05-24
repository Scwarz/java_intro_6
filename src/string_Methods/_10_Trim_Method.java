package string_Methods;

public class _10_Trim_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns a String
        3. Non-Static
        4. No arguments
         */

        String str = "  TechGlobal   ";

        System.out.println(str);//  TechGlobal
        System.out.println(str.trim());//TechGlobal

        String str2 = "   Hel lo Wor ld   ";
        System.out.println(str2);//   Hel lo Wor ld
        System.out.println(str2.trim());//Hel lo Wor ld
    }
}
