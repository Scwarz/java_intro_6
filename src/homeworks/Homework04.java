package homeworks;


import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("==========TASK01==========\n");

        String name = ScannerHelper.getFirstName();//David

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));

        //Second way name.toLowerCase().startsWith("a")
        //Third way name.startsWith("A") || name.startsWith("a")
        if(name.substring(0,1).equalsIgnoreCase("a")) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");

        /*
         Second way name.toLowerCase().startsWith("a")
         Third way name.startsWith("A") || name.startsWith("a")

         Fourth way(NOT RECOMMENDED)

        switch (name.charAt(0)) {
            case 'A':
            case 'a':
                System.out.println("You are in the club!");
                break;
            default:
                System.out.println("Sorry, you are not in the club");
        }

         */



        

        System.out.println("\n==========TASK02==========\n");

        String address = ScannerHelper.getAddress();

        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if(address.toLowerCase().contains("des plains")) System.out.println("You are welcome to join the club");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("\n==========TASK03==========\n");

        String favCountry = ScannerHelper.getFavCountry().toLowerCase();

        if(favCountry.contains("a") && favCountry.contains("i"))
            System.out.println("A and i are there");
        else if(favCountry.contains("a"))
            System.out.println("A is there");
        else if(favCountry.contains("i"))
            System.out.println("I is there");
        else System.out.println("A and i are not there");




        System.out.println("\n==========TASK04==========\n");
        String str = "   java is FUN   ";
        str = str.trim().toLowerCase();//"java is fun"

        String word1 = str.substring(0,str.indexOf(' '));// 0,4 -> java
        String word2 = str.substring(str.indexOf(' ') + 1, str.lastIndexOf(' ')); //5, 7 -> is
        String word3 = str.substring(str.lastIndexOf(' ') + 1);//8 -> fun

        /*
        String word1 = str.substring(0,4);//java
        String word2 = str.substring(5,7);//is
        String word3 = str.substring(8);//fun

         */

        System.out.println("The first word in the str is = " + word1);
        System.out.println("The second word in the str is = " + word2);
        System.out.println("The third word in the str is = " + word3);

    }
}
