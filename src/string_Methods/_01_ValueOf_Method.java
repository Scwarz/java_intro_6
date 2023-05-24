package string_Methods;

public class _01_ValueOf_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. String
        3. static
        4. takes any variable as an argument
         */
        int num = 125;


        String numAsStr = String.valueOf(num);


        System.out.println(num + 5);//130
        System.out.println(numAsStr + 5);//1255

        char c = 'B';

        System.out.println(c);
        System.out.println(String.valueOf(c));

    }
}
