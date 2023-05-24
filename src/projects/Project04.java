package projects;

import utilities.ScannerHelper;

public class Project04{

    public static int counter = 1; // assuming that there exists at least 1 word

    /*
    TASK-1
    Write a program that asks user to enter a String, and swaps first and last 4
    characters of this String and print the modified String
    NOTE: Write a program that handles any String
    NOTE: First check if the length of String is at least 8, if the String’s length is
    less than 8, then print message “This String does not have 8 characters”
     */
    public static void Task1() {
        String s1 = ScannerHelper.getString();

        if (s1.length() < 8) System.out.println("This String does not have 8 characters");
        else {
            int len = s1.length();
            System.out.println(s1.substring(len - 4) + s1.substring(4, len - 4) + s1.substring(0, 4));
        }
    }

    /*
    TASK-2
    Write a program that asks user to enter a sentence, and swaps first and last
    words of this sentence and print the modified sentence
    NOTE: Write a program that handles any sentence
    NOTE: First check if the sentence has at least 2 words, if the sentence has
    only one or no word, then print message “This sentence does not have 2 or
    more words to swap”
     */
    public static void Task2() {
        String s2 = ScannerHelper.getString().trim();

        if (s2.indexOf(" ") == -1) System.out.println("This sentence does not have 2 or more words to swap");
        else {
            String firstWord = s2.substring(0, s2.indexOf(" "));
            String lastWord = s2.substring(s2.lastIndexOf(" ") + 1);
            System.out.println(lastWord + s2.substring(firstWord.length(), s2.lastIndexOf(" ") + 1) + firstWord);
        }
    }

    /*
    TASK-3
    Assume that you are given some Strings as below, and you want to replace
    bad words with good words.
    NOTE: Write a program that handles any String
    String str1 = “These books are so stupid”;
    String str2 = “I like idiot behaviors”;
    String str3 = “I had some stupid t-shirts in the past and also some idiot
    look shoes”;
    Write a Java program that replaces bad words like “stupid” and “idiot” with
    “nice” keyword.
     */
    public static void Task3() {
        String s3 = ScannerHelper.getString().trim();

        String badWord1 = "stupid", badWord2 = "idiot";
        if (s3.contains(badWord1)) s3 = s3.replaceAll(badWord1, "nice");
        if (s3.contains(badWord2)) s3 = s3.replaceAll(badWord2, "nice");

        System.out.println(s3);
    }

    /*
    TASK-4
    Write a program that asks user to enter their name.
    First check if length of name is more than 2 and is even or odd
    If length of name is less than 2, then print “Invalid input!!!”
    If length of name is odd, then print middle character from the name
    If length of name is even, then print middle 2 characters from the name
     */
    public static void Task4() {
        String s4 = ScannerHelper.getString();

        int len = s4.length();
        if (len < 2) System.out.println("Invalid input!!!");
        else {
            if (len % 2 == 0) {
                //int firstIndex = len / 2 - 1, lastIndex = len / 2 + 1;
                System.out.println(s4.substring(len / 2 - 1, len / 2 + 1));
            } else System.out.println(s4.substring(len / 2, len / 2 + 1)); // use charAt for best solution
        }
    }


    /*
    TASK-5
    Write a program that asks user to enter a country.
    First check if length of country is more than 5. If not, then print “Invalid
    input!!!”
    If length of country is more than 5, then print country name without first 2
    and last 2 characters
     */
    public static void Task5() {
        String s5 = ScannerHelper.getString();

        if (s5.length() < 5) System.out.println("Invalid input!!!");
        else {
            int len = s5.length();
            System.out.println(s5.substring(2, len - 2));
        }
    }

    /*
    TASK-6
    Write a program that asks user to enter their full address.
    Replace all letter ‘a’ or ‘A’ with ‘*’
    Replace all letter ‘e’ or ‘E’ with ‘#’
    Replace all letter ‘i’ or ‘I’ with ‘+’
    Replace all letter ‘u’ or ‘U’ with ‘$’
    Replace all letter ‘o’ or ‘O’ with ‘@’
    Then, print result after replacements
     */
    public static void Task6() {
        String s6 = ScannerHelper.getString();

        if (s6.contains("a") || s6.contains("A"))
            s6 = s6.replaceAll("a", "*").replaceAll("A", "*");
        if (s6.contains("e") || s6.contains("E"))
            s6 = s6.replaceAll("e", "#").replaceAll("E", "#");
        if (s6.contains("i") || s6.contains("I"))
            s6 = s6.replaceAll("i", "+").replaceAll("I", "+");
        if (s6.contains("o") || s6.contains("O"))
            s6 = s6.replaceAll("o", "@").replaceAll("O", "@");
        if (s6.contains("u") || s6.contains("U"))
            s6 = s6.replaceAll("u", "$").replaceAll("U", "$");

        System.out.println(s6); //2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018
    }

    /*
    TASK-7
    Write a program that asks user to enter a sentence as a String, and count how many words that sentence has,
    and print it with given below message.
    NOTE: Write a program that handles any String
    NOTE: First check if the given sentence has 2 words at least. If not, then just print
    “This sentence does not have multiple words”.
     */
    public static void Task7() {
        String s7 = ScannerHelper.getString();
        String[] words = s7.split(" ");
        System.out.println(words.length);
    }

    /*
    1st run -
    input = my name jeff
    newInput = name jeff
    counter++ = 2

    2nd run -
    input = name jeff
    newInput = jeff
    counter++ = 3

    3rd run -
    input = jeff
     */
    public static void Task7a(String str) {
        if (str.contains(" ")) {
            str = str.substring(str.indexOf(" ") + 1);
            counter++;
            Task7a(str);
        }
    }

    public static void main(String[] args) {
        String s7 = ScannerHelper.getString();
        Task7a(s7);
        System.out.println("This sentence has " + counter + " words");
    }
}
