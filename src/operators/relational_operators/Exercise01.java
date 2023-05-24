package operators.relational_operators;

public class Exercise01 {
    public static void main(String[] args) {

        int x = 10, y = 20, z = 10;

        boolean b1 = y < z; // false
        boolean b2 = x <= y; // true
        boolean b3 = (x += z) == y++; // 20 == 20 true
        boolean b4 = ++x != y / 2; // 11 != 10 true


        System.out.println(b4);

    }
}
