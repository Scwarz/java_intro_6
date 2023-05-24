package operators.increment_decrement_operators;

public class PostIncrementPostDecrement {
    public static void main(String[] args) {
        int num1 = 10, num2 = 10;

        System.out.println(num1++); // 10
        System.out.println(num1); // 11
        System.out.println(num1); // 11

        System.out.println(++num2); // 11
        System.out.println(num2); // 11


        System.out.println("\n---------TASK-2-----------\n");
        int n1 = 5, n2 = 7;

        n1++; // keep it as 5 but increase it by 1 for the next use
        n1 += n2;

        System.out.println(n1); // 13

        System.out.println("\n---------TASK-3-----------\n");
        int i1 = 10;

        --i1; // decrease it by 1 right now - 9
        i1--; // decrease it by one for the next use

        System.out.println(--i1); // 7

        System.out.println("\n---------TASK-4-----------\n");
        int number1 = 50;

        number1 -= 25; // 25

        number1 -= 10; // 15

        System.out.println(number1--); // 15


        System.out.println("\n---------TASK-5-----------\n");

        int i = 5;

        int age = 10 * i++;
        System.out.println(age); // 50


        System.out.println("\n---------TASK-6-----------\n");
        int var1 = 27;

        int result = --var1 / 2; // 13

        System.out.println(++result); // 14
    }
}
