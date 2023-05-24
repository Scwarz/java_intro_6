package regex;

public class CountWords2 {
    public static void main(String[] args) {

        System.out.println("\n-----------Count words 1-------------\n");
        String sentence = "I learned RegEx";

        System.out.println(sentence.split("\\s").length); // [I, learned, RegEx].length -> 3

        System.out.println("\n-----------Count words 2-------------\n");
        String str = "    I     like     Java      ";

        System.out.println(str.trim().split("\\s+").length); // 3
    }
}
