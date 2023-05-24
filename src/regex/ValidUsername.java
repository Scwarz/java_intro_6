package regex;

import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a username");
        String userName = scanner.nextLine();
        String regex = "[a-zA-Z0-9]{5,10}";

        //WAY 1:
        if(Pattern.matches(regex,userName)){
            System.out.println("Valid Username");
        }
        else {
            System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");
        }


        //WAY 2
        if(userName.matches(regex)){
            System.out.println("Valid Username");
        }
        else{
            System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");
        }

        //WAY 3
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);

        if(matcher.matches()){
            System.out.println("Valid Username");
        }else{
            System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");
        }

    }
}
