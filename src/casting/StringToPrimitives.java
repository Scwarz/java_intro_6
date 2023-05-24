package casting;

public class StringToPrimitives {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;

        System.out.println(num1 + num2); // 15 - numeric 15
        System.out.println("" + num1 + num2); // 510 - text
        System.out.println("" + (num1 + num2)); // 15 - text



        //Converting primitives to String
        System.out.println("" + num1 + num2); // "510"
        System.out.println(String.valueOf(num1) + String.valueOf(num2)); // "510"

        System.out.println(String.valueOf(num2 + num1) + (7 + num2)); // "15" + 17 => "1517"



        //Converting String to primitives
        String price = "1597.06";

        System.out.println(Double.parseDouble(price) - 10.0); // 1587.06
    }
}
