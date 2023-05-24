package casting;

public class WrapperClasses {
    public static void main(String[] args) {

        int age1 = 45;

        Integer age2 = 45;

        System.out.println(age1 + 5); // 50
        System.out.println(age2 + 5); // 50

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String s = "25.5";

        System.out.println(Double.parseDouble(s) + 5); // 30.5
        System.out.println((int) Double.parseDouble(s) + 5); // 30


        String str = "12345";

        System.out.println(Integer.parseInt(str) + 5); // 12350


        char c1 = 'A';
        Character c2 = c1; // primitive into object -> Autoboxing or boxing

        Character c3 = 'E';
        char c4 = c3; // object into primitive -> unboxing
    }
}
