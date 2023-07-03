package projects;

import utilities.RandomGenerator;
import utilities.ScannerHelper;

public class Project05 {
<<<<<<< HEAD
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
=======
    public static void main(String[] args) {
        System.out.println("\t =========TASK 1======= \t");
        String task1Sentence1 = ScannerHelper.getString();

        int counter = 0;

        if(!task1Sentence1.contains(" ")) System.out.println("This sentence does not have multiple words");
        else {
            for (int i = 0; i < task1Sentence1.length(); i++) {
                if(task1Sentence1.charAt(i) == ' ') counter++;

            }
            System.out.println("This sentence has " + (counter + 1) + " words.");

        }
        System.out.println("\t ======TASK 1 ENDS===== \t");
        System.out.println("\t =========TASK 2======= \t");
        int task2RandomNumber1 = RandomGenerator.getRandomNumber(0,25);
        int task2RandomNumber2 = RandomGenerator.getRandomNumber(0,25);
        System.out.println("Random number 1 is = " + task2RandomNumber1);
        System.out.println("Random number 2 is = " + task2RandomNumber2);

        String answer = "";

        for (int i = Math.min(task2RandomNumber1, task2RandomNumber2); i <= Math.max(task2RandomNumber1,task2RandomNumber2) ; i++) {
            if (i % 5 != 0 ) answer += i + " - ";

        }
        System.out.println(answer.substring(0,answer.length() -3));
        System.out.println("\t ======TASK 2 ENDS===== \t");
        System.out.println("\t =========TASK 3======= \t");
        String task3Sentence1 = ScannerHelper.getString();

        int counter2 = 0;

        if(task3Sentence1.length() < 1 ) System.out.println("This sentence does not have any characters");
        else {
            for (int i = 0; i < task3Sentence1.length(); i++) {
                if(task3Sentence1.toLowerCase().charAt(i) == 'a')
                    counter2++;

            }
            System.out.println("This sentence has " + counter2 + " a or A letters.");
        }
        System.out.println("\t =========TASK 3======= \t");
        System.out.println("\t =========TASK 4======= \t");
        String task4Word = ScannerHelper.getString();

        String reverse = "";

        for (int i = task4Word.length() -1; i >=0 ; i--) {
            reverse+= task4Word.charAt(i);

        }
        if (task4Word.length() == 0) System.out.println("This word does not have 1 or more characters");
        else if(task4Word.equals(reverse)) System.out.println("This word is palindrome");
        else System.out.println("This word is not palindrome");
        System.out.println("\t ======TASK 4 ENDS===== \t");
        System.out.println("\t =========TASK 5======= \t");
        int lines = 9;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= 2 * i - 1; o++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\t ======TASK 5 ENDS===== \t");
>>>>>>> f211cd07623c5445678f97d0e2f6de0d3906e188
    }
}
