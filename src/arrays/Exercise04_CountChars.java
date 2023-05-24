package arrays;

import utilities.ScannerHelper;

public class Exercise04_CountChars {

    public static void main(String[] args) {

        String str = ScannerHelper.getString();

        System.out.println("\n-------1st way------\n");

        int letters = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) letters++;
        }

        System.out.println(letters);


        System.out.println("\n-------2nd way------\n");  // toCharArray()

        letters = 0;

        for (char c : ScannerHelper.getString().toCharArray()) {
            if(Character.isLetter(c)) letters++;
        }

        System.out.println(letters);
    }
}
