package conditional_statements;

public class Exercise06_CheckAll10 {
    public static void main(String[] args) {
        /*
        Write a program that generates 2 random number between 10 and 11
        If both are 10 -> print true
        Otherwise -> print false

         */

        int r1 = (int)(Math.random() * 2) + 10;
        int r2 = (int)(Math.random() * 2) + 10;

        System.out.println(r1);
        System.out.println(r2);


        System.out.println(r1 == 10 && r2 == 10);

        /*
        if(r1 != 10 || r2 != 10){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }

         */

        /*
        if(r1 == 10 && r2 == 10){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

         */
    }
}
