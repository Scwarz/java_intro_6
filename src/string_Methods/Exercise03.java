package string_Methods;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Assume you are given below sentence
	    “The best is Java”
        Write a Java program that extracts “Java” from given sentence
        And store extracted value in another String
        Finally, print the extracted String
         */

        String sent = "I am learning Java and i enjoy it";

        String java = sent.substring(12);

        System.out.println(java);

        //Second way

        java = sent.substring(sent.indexOf("Java"));
        System.out.println(java);

        //Third way
        java = sent.substring(sent.lastIndexOf(' ')).trim();
        System.out.println(java);

    }
}
