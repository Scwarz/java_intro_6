package recursion;

public class ReverseAString {
    /*
    Create a method called reverse
    It takes one String and returns it back reversed
    Use recursion

    a       -> a
    w           -> w

     */

    public static String reverse(String str){
        if(str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    /*
    Hello

    reverse("Hello")    -> o + l + l + e + H;
    reverse("ello")     -> o + l + l + e;
    reverse("llo")      -> o + l + l;
    reverse("lo")       -> o + l;
    reverse("o")        -> o
     */


    public static void main(String[] args) {
        System.out.println(reverse("Hello")); // olleH
        System.out.println(reverse("Java")); // avaJ
    }
}
