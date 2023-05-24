package loops.while_loops;

public class WhileLoop {
    public static void main(String[] args) {

        //Print numbers starting from 1 to 5

        System.out.println("\n-----------for loop-----------\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }



        System.out.println("\n-----------while loop-----------\n");
        int num = 1;

        while(num <= 5){
            System.out.println(num);
            num++;
        }


    }
}
