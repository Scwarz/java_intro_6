package loops;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop value = " + i);

            // inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.println("\tInner loop value = " + j);
            }
        }

        System.out.println("\nEnd of the program\n");


        for (int i = 1; i <= 12; i++) {
            System.out.println("This is month = " + i);

            for (int j = 1; j <= 30; j++) {
                System.out.println("\tThis is day = " + j);
            }
        }
    }
}
