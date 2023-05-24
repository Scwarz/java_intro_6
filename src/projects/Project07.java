package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {
    /*
    TASK-1 - countMultipleWords() method
    •Write a method that takes a String[] array as an argument and counts
    how many strings in the array has multiple words.
    •This method will return an int which is the count of elements that have
    multiple words.
    •NOTE: be careful about these as they are not multiple words ->“”,    “   “,
    “    abc”,  “abc   “
     */
    public static int countMultipleWords(String[] arr) {
        // we need a counter to track which strings in the arr have multiple words
        int counter = 0;

        // access each string in the array (using a loop) and then check if there exists a space
        for (String str : arr) {
            str = str.trim();
            if (str.contains(" ")) counter++;
        }

        return counter;
    }

    /*
    TASK-2 - removeNegatives() method
    •Write a method that takes an “ArrayList<Integer> numbers” as an
    argument and removes all negative numbers from the given list if there
    are any.
    •This method will return an ArrayList with removed negatives.
     */
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list) {
        // we loop through each integer
        // if the element is negative, remove from the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) list.remove(i--); // i-- needed to not skip over an element
        }
        //list.removeIf(element -> element < 0);
        return list;
    }

    /*
    TASK-3 - validatePassword() method
    •Write a method that takes a “String password” as an argument and
    checks if the given password is valid or not.
    •This method will return true if given password is valid, or false if given
    password is not valid.
    •A VALID PASSWORD:
    -should have length of 8 to 16 (both inclusive).
    -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
    char.
    -should NOT have any space.
     */
    public static boolean validatePassword(String password) {
        // the password needs to be 8 to 16 characters AND not have any spaces
        if (password.length() < 8 || password.length() > 16 || password.contains(" ")) return false;
        else {
            // and the conditions are that it needs 1 digit, upper, lower, special
            boolean hasDigit = false, hasUpper = false, hasLower = false, hasSpecial = false;

            // loop through each character until all conditions are checked
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                // checks
                if (!hasDigit && Character.isDigit(c)) hasDigit = true;
                else if (!hasUpper && Character.isUpperCase(c)) hasUpper = true;
                else if (!hasLower && Character.isLowerCase(c)) hasLower = true;
                else if (!hasSpecial && !Character.isLetterOrDigit(c)) hasSpecial = true;

                if (hasDigit && hasUpper && hasLower && hasSpecial) return true;
            }
        }
        return false;
    }

    /*
    TASK-4 - validateEmailAddress() method
    •Write a method that takes a “String email” as an argument and checks if
    the given email is valid or not.
    •This method will return true if given email is true, or false if given email is
    not valid.
    •A VALID EMAIL:
    -should NOT have any space.
    -should not have more than one “@” character.
    -should be in the given format <2+chars>@<2+chars>.<2+chars>
     */
    public static boolean validateEmailAddress(String email) { // abcd@gmail.com
        // should not contain any spaces AND should not have more than 1 "@"
        // BUT it should contain an "@" AND a "."
        if (email.contains(" ") || !email.contains("@") || !email.contains(".")) return false;
        else {
            // look for the index of @ and the last index of period
            // we know it should only have 1 @, ab@ -> indexOf(@) >= 2
            int ampIndex = email.indexOf("@"), periodIndex = email.lastIndexOf("."), len = email.length() - 1;

            // if indexOf(@) is the same index of lastIndexOf(@), then its looking at the same @ (only one exists)
            // if not, then there exists at least 2 @ in different positions
            boolean singleAmp = ampIndex == email.lastIndexOf("@");

            /// THESE ARE TO VALIDATE EMAIL IS VALID
            // if ampIndex > 2 -> ab@......
            // if the distance between @ and . are greater or equal 2 -> ..@gm.
            // if the distance between the length of the string minus the "." is greater or equal to 2
            return singleAmp && ampIndex >= 2 && ampIndex + 3 <= periodIndex && len - periodIndex >= 2;
        }
    }


    public static void main(String[] args) {
        String[] arr1 = {"foo", "", "", "foo bar", "java is fun", " ruby "};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        String pass1 = "";
        String pass2 = "abcd";
        String pass3 = "abcd1234";
        String pass4 = "Abcd1234";
        String pass5 = "Abcd123!";

        String email1 = "a@gmail.com";
        String email2 = "abc@g.com";
        String email3 = "abc@gmail.c";
        String email4 = "abc@@gmail.com";
        String email5 = "abcd@gmail.com";

        System.out.println("***** Task 1 *****");
        System.out.println(countMultipleWords(arr1));

        System.out.println("\n***** Task 2 *****");
        System.out.println(removeNegatives(list2));

        System.out.println("\n***** Task 3 *****");
        System.out.println(validatePassword(pass1));
        System.out.println(validatePassword(pass2));
        System.out.println(validatePassword(pass3));
        System.out.println(validatePassword(pass4));
        System.out.println(validatePassword(pass5));

        System.out.println("\n***** Task 4 *****");
        System.out.println(validateEmailAddress(email1));
        System.out.println(validateEmailAddress(email2));
        System.out.println(validateEmailAddress(email3));
        System.out.println(validateEmailAddress(email4));
        System.out.println(validateEmailAddress(email5));
    }
}
