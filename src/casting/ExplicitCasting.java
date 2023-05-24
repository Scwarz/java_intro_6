package casting;

public class ExplicitCasting {
    public static void main(String[] args) {
        /*
        Explicit casting is storing bigger data type into smaller data type
        It does not happen automatically and programmer have to resolve the compiler issue
        Also known as narrowing or down-casting

        long -> byte
        int -> short
        double -> float
        double -> int
         */

        long number1 = 1;

        byte number2 = (byte) number1;

        System.out.println(number2); // 1

    }
}
