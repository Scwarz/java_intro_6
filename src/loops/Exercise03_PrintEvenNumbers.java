package loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers from 0 to 10 (0 and 10 are included)
        Expected output:
        0
        2
        4
        6
        8
        10

        start point: 0
        end point: 10
        update: increment
         */

        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0) System.out.println(i);
        }


        // second way
        System.out.println("\n---------Second way--------\n");
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }


        // third way
        System.out.println("\n---------Third way--------\n");
        for (int i = 0; i <= 5; i++) { // 0, 1, 2, 3, 4, 5
            System.out.println(i * 2);
        }


    }
}
