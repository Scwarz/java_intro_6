package homeworks;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("\n ---- task 01 ----\n");
        fizzBuzz1(7);
        fizzBuzz1(3);
        fizzBuzz1(18);
        System.out.println("\n ---- task 02 ----\n");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println("\n ---- task 03 ----\n");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c 6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));
        System.out.println("\n ---- task 05 ----\n");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));


    }

    public static void fizzBuzz1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static String fizzBuzz2(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) result.append(i);
            else if (i % 3 == 0) result.append(i);
            else if (i % 5 == 0) result.append(i);
            else result.append(i);
        }
        return result.toString();
    }

    public static int findSumNumbers(String str) {

        int sum = 0;
        String[] numbs = str.split("\\D+");
        for (String num : numbs) {
            if (!num.isEmpty()) sum += Integer.parseInt(num);
        }
        return sum;
    }

    public static String countSequenceOfCharacters(String str) {
        if (str.isEmpty())
            return "";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) count++;
            else result.append(str.charAt(i - 1)).append(count);
            count = 1;
        }
        result.append(str.charAt(str.length() - 1)).append(count);

        return result.toString();

    }


}


