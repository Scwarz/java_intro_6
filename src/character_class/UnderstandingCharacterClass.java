package character_class;

import utilities.ScannerHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {
        /*
        char is primitive data type
        Character is a wrapper class
        Character is object representation char primitive

        Wrapper classes provides us some methods that allows to manipulate the data
         */

        String str = ScannerHelper.getString();

        //Print true if str starts with uppercase, print false otherwise

        char firstChar = str.charAt(0);

       // System.out.println(65 <= firstChar && firstChar <= 90); // Instead of decimal values from ASCII

        //Use Character class and useful methods - check USA
        System.out.println(Character.isUpperCase(firstChar)); // true
        System.out.println(Character.isLowerCase(firstChar)); // false
        System.out.println(Character.isLetter(firstChar)); // true
        System.out.println(Character.isLetterOrDigit(firstChar)); // true
        System.out.println(Character.isDigit(firstChar)); // false
        System.out.println(Character.isWhitespace(firstChar)); // false
        System.out.println(Character.isSpaceChar(firstChar)); // false



    }
}
