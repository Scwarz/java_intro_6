package arrays.practice05;

public class Exercise04 {
    public static void main(String[] args) {
        String[] arr = {"pineapple", "banana", "orange"};
        containsApple(arr);
    }

    public static void containsApple(String[] arr) {
        boolean containApple = false;
        for (String s : arr) {
            if(s.equalsIgnoreCase("apple")){
                containApple = true;
                break;
            }
        }
        System.out.println(containApple);
    }

}
