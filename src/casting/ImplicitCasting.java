package casting;

public class ImplicitCasting {
    public static void main(String[] args) {
        /*
        Implicit casting is storing smaller data type into bigger data type
        Implicit casting happens automatically as bigger data type can definitely handle the smaller data type
        Also known as widening or upcasting


        SMALL = LARGE
        byte -> short
        short -> long
        short -> int
        float -> double
        int -> long
         */

        short num1 = 45;
        int num2 = num1;


        float decimal1 = 34.5F;
        double decimal2 = decimal1;

        System.out.println(num2); // 45
        System.out.println(decimal2); // 34.5

    }
}
