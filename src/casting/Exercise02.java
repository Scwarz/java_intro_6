package casting;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        Phone -> $900
        $50 per day

        How many days later, you can buy this phone

        You can buy the phone after 18 days.
         */

        double price = 900;
        double dailySaveAmount = 50;

        System.out.println("You can buy the phone after " + (int) (price / dailySaveAmount) + " days.");


    }
}
