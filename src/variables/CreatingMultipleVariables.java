package variables;

public class CreatingMultipleVariables {
    public static void main(String[] args) {
        int age1;
        int age2;
        int age3;

        int age4, age5, age6;
        age4 = 15;
        age6 = 30;
        System.out.println(age4);
        System.out.println(age6);
        //System.out.println(age5); -> compile error because age5 is not initialized

        double d1;
        double d2 = 50.5;
        double d3;

        double d4, d5 = 50.5, d6;// d4 and d6 are not initialized but d5 is with 50.5
        d4 = d5;

        String s1, s2, s3;

        String str;
        char c1;




    }
}
