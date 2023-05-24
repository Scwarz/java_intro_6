package regex;

import java.util.regex.Pattern;

public class RemoveAll {
    public static void main(String[] args) {
        //counting vowels(without regex)
        String str = "Hello, my name is bilal and i go to techGlobal";

        int vowelCounter = 0;
        for (char c : str.toCharArray()) {
            if(Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'u'){
                vowelCounter++;
            }
        }
        System.out.println("The word has " + vowelCounter + " vowels");

        //counting vowels(with regex)
        str = str.replaceAll("[^aeiouAEIOU]", "");//Apple -> Ae
        System.out.println("The word has " + str.length() + " vowels");

        //[^xyz]



    }
}
