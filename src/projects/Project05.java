package projects;

import utilities.RandomGenerator;
import utilities.ScannerHelper;

public class Project05 {
    /*
    TASK-1
    Write a program that asks user to enter a sentence as a String, and count
    how many words that sentence has, and print it with given below message.
    NOTE: Write a program that handles any String
    NOTE: First check if the given sentence has 2 words at least. If not, then just
    print “This sentence does not have multiple words”.
     */
    public static void CountWordsInString() {
        String sentence = ScannerHelper.getString(); // hello___ -> hello
        sentence = sentence.trim();
        if (!sentence.contains(" ")) System.out.println("This sentence does not have multiple words.");
        else {
            int counter = 1;
            while(sentence.contains(" ")) { // hello my name is jonathan -> my name is jonathan -> name is jonathan -> is jonathan...
                // should remove the first word
                sentence = sentence.substring(sentence.indexOf(" ") + 1).trim();
                // increment the counter
                counter++;
            }
            System.out.println("This sentence has " + counter + " words.");
        }
    }

    /*
    TASK-2
    Write a program that generates 2 random numbers between 0 and 25 (0 and
    25 are included), Then print all numbers between 2 random numbers that
    cannot be divided by 5 in ascending order.
     */
    public static void PrintAllNumbers() {
        int ranNum1 = RandomGenerator.getRandomNumber(0, 25);
        int ranNum2 = RandomGenerator.getRandomNumber(0, 25);

        System.out.println(ranNum1);
        System.out.println(ranNum2);
        System.out.println();

        int min = Math.min(ranNum1, ranNum2);
        int max = Math.max(ranNum1, ranNum2);

        for (int i = min; i <= max; i++) {
            if (i % 5 != 0) {
                System.out.print(i);
                if (i != max) System.out.print(" - ");
            }
        }
    }

    /*
    TASK-3
    Write a program that asks user to enter a sentence as a String and count
    how many a or A letters that sentence has and print it with given below
    message.
    NOTE: Write a program that handles any String
    NOTE: First check if the given sentence has 1 character at least. If not, then
    just print “This sentence does not have any characters”.
     */
    public static void CountAInString() { // apple is one of the largest it companies.
        String str = ScannerHelper.getString().toLowerCase();
        if (str.length() == 0) System.out.println("This sentence does not have any characters.");
        else {
            int counter = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') counter++;
            }
            System.out.println("This sentence has " + counter + " a or A letters.");
        }

//        while(str.contains("a")) {
//            int indexA = str.indexOf("a") + 1;
//            str = str.substring(indexA);
//            counter++;
//        }

    }

    /*
    TASK-4
    Write a program that asks user to enter a word, and check if it is palindrome
    or not.
    Palindrome: It is a word that is read the same backward as forward
    •EX/ kayak, civic, madam
    NOTE: Write a program that handles any String
    NOTE: First check if the given String has at least 1 character, if the String
    does not have at least one character, then print message “This word does
    not have 1 or more characters”
     */
    public static void Palindrome() {
        String str = ScannerHelper.getString();

        boolean isPalindrome = true;
        if (str.length() != 0) {
            for (int i = 0, j = str.length() - 1; i <= str.length() / 2; i++, j--) {
                if (str.charAt(i) != str.charAt(j)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println("This word is palindrome.");
            else System.out.println("This word is not palindrome.");

        } else System.out.println("This word does not have 1 or more characters.");

        /*
        String word = ScannerHelper.getString();
        String reverseWord = "";

        if (word.length() != 0) {
            for (int i = word.length() - 1; i >= 0; --i) {
                reverseWord = reverseWord + word.charAt(i);
            }
            if (word.equals(reverseWord)) {
                System.out.println("This word is palindrome");
            } else
                System.out.println("This word is not palindrome");
        } else
            System.out.println("This word does not have 1 or more characters");
         */
    }

    /*
    TASK-5
    Write a program that prints the shape below.

                        *
                      * * *
                    * * * * *
                  * * * * * * *
                * * * * * * * * *
              * * * * * * * * * * *
            * * * * * * * * * * * * *
          * * * * * * * * * * * * * * *
        * * * * * * * * * * * * * * * * *
     */
    public static void PrintPyramid(int rows) {
        // rows is 9 for this task
        int maxAsterisks = rows * 2 - 1;
        int spaces = maxAsterisks / 2; // 17 / 2 = 8

        // Outer loop is printing new lines
        for (int i = 0; i < rows; i++) { // i stops at 8

            // First inner loop is to print spaces
            for (int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            // Second inner loop is to print asterisk
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            spaces--;
            System.out.println();
        }

        /*
         int rows = 9;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */
    }


    public static void main(String[] args) {
        PrintPyramid(9);
    }
}
