package loops.while_loops;

public class Exercise01_PrintNumbersDividedBy3 {
    public static void main(String[] args) {
        /*
        Write a program that prints all the numbers divided by 3, starting from 1 to 100 (both included)

        3
        6
        9
        12
        .
        .
        .
        96
        99
         */

        System.out.println("\n------for loop-------\n");

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0) System.out.println(i);
        }


        System.out.println("\n------while loop-------\n");

        int j = 1;

        while(j <= 100){
            if(j % 3 == 0) System.out.println(j);
            j++;
        }

        System.out.println("\n------while loop another way-------\n");

        int k = 3;

        while(k <= 100){
            System.out.println(k);
            k += 3;
        }


    }
}
