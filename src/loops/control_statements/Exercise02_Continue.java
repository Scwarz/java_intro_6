package loops.control_statements;

public class Exercise02_Continue {
    public static void main(String[] args) {
        /*
        Write a program that prints all the number from 1 to 100
        BUT, 13 is considered to be unlucky, so do not any number can be divided by 13

        13, 26, 39, 52, 65, 78, 91
         */

        for (int i = 1; i <= 100; i++) {
            if(i % 13 == 0) continue;
            else System.out.println(i);
        }

    }
}
