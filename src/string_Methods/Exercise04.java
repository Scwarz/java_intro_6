package string_Methods;

public class Exercise04 {
    /*
    assume you have the string "I go to TechGlobal"
    extract every word from the string into other strings and print them out on different lines

    expected output:
    I
    go
    to
    TechGlobal
     */
    public static void main(String[] args) {
        String text = "I go to TechGlobal";

        String firstWord = "" + text.charAt(0);
        String secWord = text.substring(2,4);
        String thirdWord = text.substring(5,7);
        String fourthWord = text.substring(8);

        System.out.println(firstWord);//text.substring(0,1) //I
        System.out.println(secWord);//go
        System.out.println(thirdWord);//to
        System.out.println(fourthWord);//TechGlobal


    }

}
