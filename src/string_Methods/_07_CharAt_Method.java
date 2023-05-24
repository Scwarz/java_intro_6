package string_Methods;

public class _07_CharAt_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns char
        3. NON-Static
        4. it takes an int index as an argument
         */
        String name = "Bilal";

        char firstLetter = name.charAt(0);//B
        char secondLetter = name.charAt(1);//i
        char thirdLetter = name.charAt(2);//l
        char fourthLetter = name.charAt(3);//a
        char fifthLetter = name.charAt(4);//l

        System.out.println(name);

        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);
        System.out.println(fourthLetter);
        System.out.println(fifthLetter);


        String str = "Hello World";
        System.out.println(str.charAt(9));//l
        System.out.println(str.charAt(10));//d
        //System.out.println(str.charAt(-3)); --> RUNTIME ERROR - IndexOutOfBoundsException


        String s = "";
        System.out.println(s.charAt(0));




    }
}
