package arrays;

public class NullKeyword {
    public static void main(String[] args) {

        String s1 = null; // no info
        String s2 = "Jehad";
        String s3 = "null"; // actual String data which has length and characters

        System.out.println(s1); // null
        System.out.println(s2); // Jehad

        //System.out.println(s1.length()); // NullPointerException
        System.out.println(s1.charAt(1)); // NullPointerException
        System.out.println(s2.length()); // 5
    }
}
