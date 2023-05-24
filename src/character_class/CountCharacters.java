package character_class;

import utilities.ScannerHelper;

public class CountCharacters {
    public static void main(String[] args) {
        /*
        Write a method that asks user to enter a String
        Count letters
        Count digits

        Examples
        "123 Street Chicago"    -> This string has 3 digits and 13 letters
        "ABC"                   -> This string has 0 digits and 3 letters
        "12345"                 -> This string has 5 digits and 0 letters
        "     "                 -> This string has 0 digits and 0 letters


        PSEUDO
        Get characters of the String one by one
        Check if the character is letter -> if so increase the count of letters by one
        Check if the character is digit  -> if so increase the count of digits by one
         */

        System.out.println("\n-----------TASK-1------------\n");

        String str = ScannerHelper.getString();

        int digits = 0;
        int letters = 0;

        for (int i = 0; i <= str.length()-1; i++) { // 0, 1, 2, 3, 4
            if(Character.isDigit(str.charAt(i))) digits++;
            else if(Character.isLetter(str.charAt(i))) letters++;
        }

        System.out.println("This string has " + digits + " digits and " + letters + " letters");


        System.out.println("\n-----------TASK-2------------\n");
        /*
        Write a method that asks user to enter a String
        Uppercase letters
        Lowercase letters

        Examples
        "123 Street Chicago"    -> This string has 2 uppercase letters and 11 lowercase letters
        "ABC"                   -> This string has 3 uppercase letters and 0 lowercase letters
        "12345"                 -> This string has 0 uppercase letters and 0 lowercase letters
        "     "                 -> This string has 0 uppercase letters and 0 lowercase letters

         */

        str = ScannerHelper.getString();

        int upper = 0, lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) upper++;
            else if(Character.isLowerCase(c)) lower++;
        }

        System.out.println("This string has " + upper + " uppercase letters and " + lower + " lowercase letters");


        System.out.println("\n-----------TASK-3------------\n");
         /*
         Write a program that asks user to enter a String
         Count how many special characters you have in the String

         "Hello World"      -> 0
         "Hello!"           -> 1
         "abc@gmail.com"    -> 2
         "!@#$%&"           -> 6

          */
        
        str = ScannerHelper.getString();

        int specials = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // if c is not a digit and not a letter and not a space -> then it is a special
            if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) specials++;
        }

        System.out.println(specials);


        System.out.println("\n-----------TASK-4------------\n");
        /*
        Putting all together

        Write a program that asks user to enter a String

        Count letters
        Count uppercase letters
        Count lowercase letters
        Count digits
        Count spaces
        Count specials

        Example:
        The price of the iPhone is $1,000.

        EXPECTED OUTPUT:
        Letters = 21
        Uppercase letters = 2
        Lowercase letters = 19
        Digits = 4
        Spaces = 6
        Specials = 3

         */

        str = ScannerHelper.getString();

        int _letters = 0, _lower = 0, _upper = 0, _digits = 0, _spaces = 0, _specials = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isUpperCase(c)) {
                _upper++;
                _letters++;
            }
            else if(Character.isLowerCase(c)) {
                _lower++;
                letters++;
            }
            else if(Character.isDigit(c)) _digits++;
            else if(Character.isWhitespace(c)) _spaces++;
            else _specials++;
        }


        System.out.println("Letters = " + _letters);
        System.out.println("Uppercase letters = " + _upper);
        System.out.println("Lowercase letters = " + _lower);
        System.out.println("Digits = " + _digits);
        System.out.println("Spaces = " + _spaces);
        System.out.println("Specials = " + _specials);


        System.out.println("\n-----------TASK-5------------\n");
         /*
         Write a program that asks user to enter a String
         Count how many words you have in the String
         
         "I like Java"

         words = spaces + 1

         3 words
          */
    }
}
