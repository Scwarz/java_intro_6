package homeworks;

public class Homework17 {
    public static void main(String[] args) {

        System.out.println("\n ------ Task 01 ------\n");
        String sentence1 = "I like programming languages";
        int n1 = 2;
        String result1 = nthWord(sentence1, n1);
        System.out.println("Result 1: " + result1);

        String sentence2 = "QA stands for Quality Assurance";
        int n2 = 4;
        String result2 = nthWord(sentence2, n2);
        System.out.println("Result 2: " + result2);

        String sentence3 = "Hello World";
        int n3 = 3;
        String result3 = nthWord(sentence3, n3);
        System.out.println("Result 3: " + result3);

        System.out.println("\n ------ Task 02 ------\n");
        int number1 = 153;
        boolean isArmstrong1 = isArmstrong(number1);
        System.out.println("Result 4: " + isArmstrong1);

        int number2 = 123;
        boolean isArmstrong2 = isArmstrong(number2);
        System.out.println("Result 5: " + isArmstrong2);

        System.out.println("\n ------ Task 03 ------\n");
        int number3 = 371;
        int reversedNumber1 = reverseNumber(number3);
        System.out.println("Result 6: " + reversedNumber1);

        int number4 = 12;
        int reversedNumber2 = reverseNumber(number4);
        System.out.println("Result 7: " + reversedNumber2);
    }



    public static String nthWord(String sentence, int n) {
        String[] words = sentence.split(" ");
        if (n <= 0 || n > words.length) {
            return "";
        } else {
            return words[n - 1];
        }
    }


    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number;
    }


    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

}
