package projects;

public class Project03 {
    public static void main(String[] args) {
        /*
        TASK-1
        -Assume that you are given below Strings
        String s1 = “24”, s2 = “5”;
        -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
        Output:
        The sum of 24 and 5 = 29
        The subtraction of 24 and 5 = 19
        The division of 24 and 5 = 4.8
        The multiplication of 24 and 5 = 120
        The remainder of 24 and 5 = 4
        */
        System.out.println("\n***** TASK 1 *****\n");
        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (num1 + num2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (num1 - num2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + ((double) num1 / num2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + (num1 * num2));
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + (num1 % num2));

        /*
        TASK-2
        -Write a program that generates a random number between 1 to 35 (1 and 35 are
        included)
        -Find if the given number is a Prime Number
        -If random number generated is a prime one, then print “{NUMBER} IS A PRIME NUMBER”.
        -Otherwise, print “{NUMBER} IS NOT A PRIME NUMBER”
        Prime numbers - 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
         */
        System.out.println("\n***** TASK 2 *****\n");
        int ranNum = 1 + (int)(Math.random() * 35);

        // if the number is divisible by 2 (unless it is 2), then it is not prime number
        if (ranNum == 2 || ranNum == 3 || ranNum == 5) {
            System.out.println(ranNum + " IS A PRIME NUMBER");
        } else if (ranNum == 1 || ranNum % 2 == 0 || ranNum % 3 == 0 || ranNum % 5 == 0) { // ranNum = 24 { 2 % 2 = 0
            System.out.println(ranNum + " IS NOT A PRIME NUMBER");
        } else System.out.println(ranNum + " IS A PRIME NUMBER");

        // 25
//        boolean isPrime = true;
//        for(int i = 2; i <= ranNum; i++) {
//            System.out.println(ranNum + " being divided by " + i);
//            if (ranNum % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime) System.out.println(ranNum + " IS A PRIME NUMBER");
//        else System.out.println(ranNum + " IS NOT A PRIME NUMBER");


        /*
        TASK-3
        -Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are
        included)
        -Find and print each number in an ascending order
        -Ascending order is ordering from lowest to greatest
         */
        System.out.println("\n***** TASK 3 *****\n");
        int ranNum1 = 1 + (int)(Math.random() * 50);
        int ranNum2 = 1 + (int)(Math.random() * 50);
        int ranNum3 = 1 + (int)(Math.random() * 50);

        int lowest = Math.min(Math.min(ranNum1, ranNum2), ranNum3);
        int greatest = Math.max(Math.max(ranNum1, ranNum2), ranNum3);
        int middle = ranNum1 + ranNum2 + ranNum3 - lowest - greatest;

        System.out.println("Lowest number is = " + lowest);
        System.out.println("Middle number is = " + middle);
        System.out.println("Greatest number is = " + greatest);


        /*
        TASK-4 (Find if given char is lowercase or uppercase)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
        NOTE: You need to use ASCII table and casting for this task
        Char = '5', 'a', 'R'
         */
        System.out.println("\n***** TASK 4 *****\n");
        char c1 = 'R';

        boolean isLower = (c1 >= 'a' && c1 <= 'z');
        boolean isUpper = (c1 >= 65 && c1 <= 90);

        if (isLower || isUpper) { // character is a letter
            if (isLower) System.out.println("The letter is lowercase"); // the letter lowercase
            else System.out.println("The letter is uppercase"); // the letter is uppercase
        } else System.out.println("Invalid character detected!!!");

        /*
        TASK-5 (Find if given char is vowel or consonant)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If it is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out whether it is a vowel or a consonant.
        -If the letter is vowel, then print “The letter is vowel”, else print “The letter is
        consonant”.
        -Vowel letters: a, e, i o, u, A, E, I, O, U
        NOTE: You need to use ASCII table and casting for this example
        Char = '#', 'e', 'R'
         */
        System.out.println("\n***** TASK 5 *****\n");
        char c2 = 'R'; // 65 + 32 = 97 -> 'a'

        boolean isLower2 = (c2 >= 'a' && c2 <= 'z');
        boolean isUpper2 = (c2 >= 65 && c2 <= 90); //  (c2 >= 'A' && c2 <= 'Z')

        if (isLower2 || isUpper2) { // is it a letter?
            if (isUpper2) c2 += 32; // if it's an uppercase letter, then convert to lowercase
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') System.out.println("The letter is vowel");
            else System.out.println("The letter is a consonant");
        } else System.out.println("Invalid character detected!!!");

        /*
        TASK-6 (Find if given char is special character or not)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if the given char is a special character but not a digit or not a letter.
        -If it is not a special character, then print “Invalid character detected!!!”.
        -If it is a special character, then print “Special character is =
        {givenCharacter}”.
        NOTE: You need to use ASCII table and casting for this example
        Char = '8', '*'
         */
        System.out.println("\n***** TASK 6 *****\n");
        char c3 = '*';

        boolean isDigit = (c3 >= 48 && c3 <= 57);
        boolean isLetter = (c3 >= 'a' && c3 <= 'z') || (c3 >= 'A' && c3 <= 'Z');

        if (isDigit || isLetter) System.out.println("Invalid character detected!!!");
        else System.out.println("Special character is = " + c3);

        /*
        TASK-7 (Find if given char is a letter or digit or special character)
        -Assume you are given a single character. (It will be hard-coded)
        -If given char is a letter, then print “Character is a letter”
        -If given char is a digit, then print “Character is a digit”
        -Otherwise, print “Character is a special character”
         */
        System.out.println("\n***** TASK 7 *****\n");
        char c4 = '!';

        boolean isDigit2 = (c4 >= 48 && c4 <= 57);
        boolean isLetter2 = (c4 >= 'a' && c4 <= 'z') || (c4 >= 'A' && c4 <= 'Z');

        if (isDigit2) System.out.println("Character is a digit");
        else if (isLetter2) System.out.println("Character is a letter");
        else System.out.println("Character is a special character");
    }
}
