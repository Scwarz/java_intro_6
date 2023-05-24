package casting;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Divide below numbers

        Expected output:
        2.5
         */


        int num1 = 5, num2 = 2;

        System.out.println(num1 / num2); // 2
        System.out.println((double) (num1 / num2)); // 2.0

        System.out.println((double) num1 / num2); // 5.0 / 2 -> 2.5
        System.out.println(num1 / (double) num2); // 5 / 2.0 -> 2.5
        System.out.println((double) num1 / (double) num2); // 5.0 / 2.0 -> 2.5
    }
}
