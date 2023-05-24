package loops;

public class Exercise02_DescendingNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers backward starting from 100 to 0 (100 and 0 are included)
        Expected output:
        100
        99
        98
        .
        .
        .
        2
        1
        0

        start point: 100
        end point: 0
        update: --
         */

        for(int j = 100; j >= 0; j--){
            System.out.println(j);
        }

    }
}
