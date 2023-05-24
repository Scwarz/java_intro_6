package homeworks;

public class Homework01 {
    public static void main(String[] args) {
        System.out.println("\n---------TASK1---------\n");
        /*
        74 - 64 = 10 - 8 = 2 - 2 = 0
                           128 64 32 16 8 4 2 1
                             0  1  0  0 1 0 1 0
        65 - 64 = 1
                            128 64 32 16 8 4 2 1
                             0   1  0  0 0 0 0 1

       86  - 64 = 22 - 16 = 6 - 4 = 2 - 2 = 0
                            128 64 32 16 8 4 2 1
                             0   1  0  1 0 1 1 0


        JAVA = 01001010 01000001 01010110 01000001
        SELENIUM =
         */

        System.out.println("\n---------TASK2---------\n");
        /*
               128  64  32 16 8 4 2 1
                 0  1   0  0  1 1 0 1     1 + 4 + 8 + 64 = 77

        01001101    = 77  = M
        01101000    = 104 = h
        01111001    = 121 = y
        01010011    = 83  = S
        01101100    = 108 = l
         */

        System.out.println("\n---------TASK3---------\n");

        System.out.println("I start to practice \"JAVA\" today, and I like it.");
        System.out.println("The secret of getting ahead is getting started.");
        System.out.println("\"Don't limit yourself. \"");
        System.out.println("Invest in your dreams. Grind now. Shine later.");
        System.out.println("It's not the load that breaks you down, it's the way you carry \n" +
                        "it.");
        System.out.println("The hard days are what make you stronger.");
        System.out.println("You can waste your lives drawing lines. Or you can live your \n" +
                           "life crossing them.");

        System.out.println("\n---------TASK4---------\n");

        System.out.println("\tJava is easy to write and easy to run—this is the \n" +
                "foundational strength of Java and why many developers \n" +
                "program in it. When you write Java once, you can run it \n" +
                "almost anywhere at any time.\n" +
                "\n" +
                "\tJava can be used to create complete applications \n" +
                "that can run on a single computer or be distributed \n" +
                "across servers and clients in a network.\n" +
                "\n" +
                "\tAs a result, you can use it to easily build mobile \n" +
                "applications or run-on desktop applications that use \n" +
                "different operating systems and servers, such as Linux \n" +
                "or Windows.");

        System.out.println("\n---------TASK5---------\n");
        /*
        myAge
        myFavoriteNumber
        myHeight
        myWeight
        myFavoriteLetter
         */
        int myAge= 25;
        int myFavoriteNumber = 7;
        //double myHeight = 5.11;
        String myHeight = "5'11";
        double myWeight = 175.83;
        char myFavoriteLetter = 'B';

        System.out.println(myAge);
        System.out.println(myFavoriteNumber);
        System.out.println(myHeight);
        System.out.println(myWeight);
        System.out.println(myFavoriteLetter);



    }
}
