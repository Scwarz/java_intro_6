package string_Methods;

public class MethodChaining {
    public static void main(String[] args) {
        String str = "TechGlobal";

        //single method
        System.out.println(str.toLowerCase());//techglobal

        //2 methods chained
        System.out.println(str.toLowerCase().contains("tech"));//TechGlobal -> techglobal - > true

        //3 method chained
        System.out.println(str.toUpperCase().substring(4).length());// TechGlobal -> TECHGLOBAL -> GLOBAL -> 5

        //6 method chained
        String sentence = "Hello, my name is John Doe. I am 30 years old and i got to school at TechGlobal";
        System.out.println(sentence.toLowerCase().replace("a", "X")
                .replace("e", "X")
                .replace("i","X")
                .replace("o","X")
                .replace("u", "X"));


    }
}
