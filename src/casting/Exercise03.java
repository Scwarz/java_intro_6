package casting;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Multiplication, addition, division and subtraction of the numbers

        EXPECTED:
        42
        23
        10.5
        19
         */

        String s1 = "21", s2 = "2";

        // Way 1
        /*
        System.out.println(Integer.parseInt(s1) * Integer.parseInt(s2)); // 42
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); // 23
        System.out.println(Double.parseDouble(s1) / Double.parseDouble(s2)); // 10.5
        System.out.println(Integer.parseInt(s1) - Integer.parseInt(s2)); // 19
         */


        // Way 2
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println(n1 * n2); // 42
        System.out.println(n1 + n2); // 23
        System.out.println((double)n1 / n2); // 10.5
        System.out.println(n1 - n2); // 19
    }
}
