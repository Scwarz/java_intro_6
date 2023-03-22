package projects;

import utilities.RandomGenerator;
import utilities.ScannerHelper;

public class Project05 {
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
    }
}
