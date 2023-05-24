package string_Methods;

import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {
       /* Write a Java program that asks user to enter their favorite
        book name and quote
        •And store answers of user in different Strings
        •Finally, print the length of those Strings with proper messages

        */

        String favBook = ScannerHelper.getFavBook();
        String favQuote = ScannerHelper.getFavQuote();

        System.out.println("The length of your favorite book is " + favBook.length());
        System.out.println("The length of your favorite Quote is " + favQuote.length());



    }
}
