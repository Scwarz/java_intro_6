package regex;

import utilities.ScannerHelper;

import java.util.regex.Pattern;

public class Recap {
    public static void main(String[] args) {
        /*
        RegEx: Regular Expression
        RegEx: pattern that we create to search in some texts


        Meta Characters
        .               -> any character
        \d              -> [0-9]        -> any digit
        \D              -> [^0-9]       -> any character but not digit
        \s              -> space character
        \S              -> any character but not space
        \w              -> [0-9a-zA-Z_]
        \W              -> space + specials except _
         */

        String str = "123 St Chicago IL 12345.";

        // [^0-9] not digits
        System.out.println(str.replaceAll("[^\\d]", "")); // 12312345
        System.out.println(str.replaceAll("\\D", "").length()); // 8


        // Count letters -> 11 -> [^a-zA-Z]
        System.out.println(str.replaceAll("[^a-zA-Z]", "")); // StChicagoIL
        System.out.println(str.replaceAll("[^a-zA-Z]", "").length()); // 11

        // Special characters -> 1 -> [^0-9a-zA-Z ]
        System.out.println(str.replaceAll("[0-9a-zA-Z ]", "")); // .
        System.out.println(str.replaceAll("[0-9a-zA-Z ]", "").length()); // 1

        // Spaces -> 4
        System.out.println("\n------------------------------------\n");
        System.out.println(str.replaceAll("\\S", "")); // "    "
        System.out.println(str.replaceAll("\\S", "").length()); // 4

        // spaces + specials
        System.out.println("\n------------------------------------\n");
        System.out.println(str.replaceAll("\\w", "")); // "    ."
        System.out.println(str.replaceAll("\\w", "").length()); // 5


        System.out.println("\n-----------Phone number task------------\n"); // ddd-ddd-dddd
        String phoneNumber = ScannerHelper.getString();

        if(Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phoneNumber)) System.out.println("Phone number is valid!");
        else System.out.println("Phone numbers is not valid!!!");


        System.out.println("\n-----------SSN number task--------------\n"); // ddd-dd-dddd
        String SSN = ScannerHelper.getString();

        if(SSN.matches("\\d{3}-\\d{2}-\\d{4}")) System.out.println("SSN is valid!");
        else System.out.println("SSN is not valid!!!");


        System.out.println("\n-----------Email task----------\n"); // 2+chars@2+chars.2+chars
        String email = ScannerHelper.getString();

        if(email.matches("[\\w-]{2,}@[\\w-]{2,}\\.[\\w-]{2,}")) System.out.println("Email is valid!");
        else System.out.println("Email is not valid!!!");
    }
}
