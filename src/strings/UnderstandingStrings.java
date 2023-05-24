package strings;

public class UnderstandingStrings {
    public static void main(String[] args) {
        String s1; //declaration of s1 as a String
        s1 = "TechGlobal School"; // initializing s1 as TechGlobal School

        String s2 = "is the best"; //declaration of s2 and initialization of s2 as is the best;

        System.out.println("===============CONCAT USING + ===============\n");
        String s3 = s1 + " " + s2; // concatenation using plus sign
        System.out.println(s3);// TechGlobal School is the best

        System.out.println("\n===============CONCAT USING METHOD ===============\n");
        String s4 = s1.concat(" ").concat(s2);// concatenation using method
        System.out.println(s4);// TechGlobal School is the best


        System.out.println("\n==========EX1==========\n");

        /*

         */
        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";

        String fullWord = wordPart1 + wordPart2 + wordPart3;

        System.out.println(fullWord);

    }
}
