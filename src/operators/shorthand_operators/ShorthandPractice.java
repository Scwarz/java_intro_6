package operators.shorthand_operators;

public class ShorthandPractice {
    public static void main(String[] args) {


        int age = 45; // in 2023

        System.out.println("Age in 2023 = " + age); // Age in 2023 = 45


        //What will be the age in 2028 - 5 years later   n = n + 5
        //age = age + 5;
        age += 5; // increase the age by 5

        System.out.println(age); // 50

        age -= 20; // decrease by 20

        System.out.println(age); // 30

        age /= 3; // divide it by 3

        System.out.println(age); // 10

        age %= 4; //

        System.out.println(age); // 2
    }
}
