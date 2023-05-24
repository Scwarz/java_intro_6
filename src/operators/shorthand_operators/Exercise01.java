package operators.shorthand_operators;

public class Exercise01 {
    public static void main(String[] args) {

        int a = 8;
        int b = 3;

        /*
        Use a and b to practice and print a after each operation
        +=
        -=
        *=
        /=
        %=
         */

//        System.out.println(a += b); // 11
//        System.out.println(a -= b); // 8
//        System.out.println(a *= b); // 24
//        System.out.println(a /= b); // 8
//        System.out.println(a %= b); // 2

        System.out.println("\n------------Task-1-----------\n");
        a += b; // increase a with b value
        System.out.println(a); // 11
        System.out.println(b); // 3


        System.out.println("\n------------Task-2-----------\n");
        a -= b; // decrease a with b value
        System.out.println(a); // 8
        System.out.println(b); // 3


        System.out.println("\n------------Task-3-----------\n");
        a *= b;
        System.out.println(a); // 24
        System.out.println(b); // 3


        System.out.println("\n------------Task-4-----------\n");
        a /= b;
        System.out.println(a); // 8
        System.out.println(b); // 3

        System.out.println("\n------------Task-5-----------\n");
        a %= b;
        System.out.println(a); // 2
        System.out.println(b); // 3


    }
}
