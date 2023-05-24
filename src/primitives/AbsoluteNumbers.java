package primitives;

public class AbsoluteNumbers {
    public static void main(String[] args) {
        /*
        Absolute numbers: 1, 5, -3, -125, 2341243534
        byte -> -128 to 127 (both inclusive)   -128         -1 0 1 2 3 4          127
        short -> -32768 to 32767 (both inclusive)
        int -> -2147483648 to 2147483647 (both inclusive)
        long

        dataType variableName = value;
         */

        System.out.println("\n-------------byte------------\n");
        byte myNumber = 45;
        System.out.println(myNumber); // 45

        System.out.println("The max value of byte = " + Byte.MAX_VALUE); // 127
        System.out.println("The min value of byte = " + Byte.MIN_VALUE); // -128


        System.out.println("\n-------------short------------\n");
        short numberShort = 150;

        System.out.println(numberShort); // 150

        System.out.println("The max value of short = " + Short.MAX_VALUE); // 32767
        System.out.println("The min value of short = " + Short.MIN_VALUE); // -32768


        System.out.println("\n-------------int------------\n");
        int myInteger = 20000000;

        System.out.println(myInteger);
        System.out.println("The max value of int = " + Integer.MAX_VALUE); // 2147483647
        System.out.println("The min value of int = " + Integer.MIN_VALUE); // -2147483648



        System.out.println("\n-------------long------------\n");
        long myBigNumber = 214_748_364_823L;

        System.out.println(myBigNumber); // 2147483648



        System.out.println("\n-------------long more info------------\n");
        long l1 = 5;
        long l2 = 23_875_283_764_827_364L; // We need to put L when the number is more than the capacity int

        System.out.println(l1); // 5
        System.out.println(l2); // 23875283764827364
    }
}
