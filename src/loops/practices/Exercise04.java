package loops.practices;

import utilities.ScannerHelper;

public class Exercise04 {
    public static void main(String[] args) {
        String str = ScannerHelper.getString();
        int vowelCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toUpperCase(str.charAt(i));

            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') vowelCounter++;
        }
        System.out.println(vowelCounter);

    }
}
