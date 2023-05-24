package loops.do_while_loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int num = 0;

        do{
            System.out.println(num); // 0
            num++;
        }
        while(num <= -1);

        System.out.println("End of the program");


        int start = 0;

        while(start <= -1){ // nothing will be printed
            System.out.println(start);
            start++;
        }
    }
}
