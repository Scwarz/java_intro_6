package primitives;

public class FloatingNumbers {
    public static void main(String[] args) {
        /*
        Floating numbers: 10.5, 23.32423, 10000.238764823764

        float   -> 4 bytes
        double  -> 8 bytes
         */

        System.out.println("\n-------floating numbers-------\n");
        float myFloat1 = 20.5F;
        double myDouble1 = 20.5;

        System.out.println(myFloat1); // 20.5
        System.out.println(myDouble1); // 20.5


        System.out.println("\n-------floating numbers more-------\n");
        float myFloat2 = 10;
        double myDouble2 = 234235;

        System.out.println(myFloat2); // 10.0
        System.out.println(myDouble2); // 234235.0


        System.out.println("\n-------floating numbers precision-------\n");
        float f1 = 3274.23423542352F;
        double d1 = 3274.23423542352;

        System.out.println(f1);
        System.out.println(d1);
    }
}
