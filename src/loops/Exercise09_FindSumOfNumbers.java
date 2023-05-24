package loops;

public class Exercise09_FindSumOfNumbers {
    public static void main(String[] args) {
         /*
        Write a Java program to find sum of the numbers from 10 to 15 ( 10 and 15 are included)

        10 + 11 + 12 + 13 + 14 + 15 -> 75

        Expected output:
        75


        start point: 10
        end point: 15
        update: increment
         */

        int sum = 0;

        for (int i = 10; i <= 15; i++) { // 10, 11, 12, 13, 14, 15
            sum += i; // sum = sum + i;
        }


        System.out.println(sum);

    }
}
