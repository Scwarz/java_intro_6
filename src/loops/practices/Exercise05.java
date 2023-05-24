package loops.practices;

public class Exercise05 {
    public static void main(String[] args) {
        int fib = 5;


        int num1 = 0;//1 1 2 3 5
        int num2 = 1;//1 2 3 5 8
        int num3;    //1 2 3 5 8
        String answer = ""; // 0 - 1 - 1 - 2 - 3

        for (int i = 1; i <= fib; i++) {// i = 1 2 3 4 5
            answer += num1 + " - ";
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(answer.substring(0, answer.length()-3));
    }

}
