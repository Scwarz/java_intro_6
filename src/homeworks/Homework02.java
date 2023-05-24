package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("==========Task01==========\n");

        //System.out.println("\n==========Task02==========\n");

        //System.out.println("\n==========Task03==========\n");

        //System.out.println("\n==========Task04==========\n");

        //System.out.println("\n==========Task05==========\n");

        System.out.println("\n==========Task06==========\n");
        int num1, num2, num3, num4, num5;

        System.out.println("Please enter 5 numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        System.out.println("The average of the given numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);

        //System.out.println("\n==========Task07==========\n");

        System.out.println("\n==========Task08==========\n");
        System.out.println("Please enter the side of the square:");
        int lengthOfSide = input.nextInt();
        input.nextLine();

        System.out.println("Perimeter of the square = " + lengthOfSide * 4);
        System.out.println("Area of the square = " + lengthOfSide * lengthOfSide);

        System.out.println("\n==========Task09==========\n");
        double salary = 90_000;
        double salaryPer3Years = salary * 3;

        System.out.println("A Software Engineer in Test can earn $" + salaryPer3Years + " in 3 years.");

        System.out.println("\n==========Task10==========\n");
        String favColor, favBook;
        int favNumber;

        System.out.println("Please enter your fav book:");
        favBook = input.nextLine();

        System.out.println("Please enter your fav color:");
        favColor = input.nextLine();

        System.out.println("Please enter your fav number:");
        favNumber = input.nextInt();
        input.nextLine();

        System.out.println("User's favorite book is: " + favBook +
                        "\nUser's favorite color is: " + favColor +
                        "\nUser's favorite number is: " + favNumber);

        System.out.println("\n==========Task11==========\n");
        String fname, lname, email, address, phone;
        int age;

        System.out.println("Please enter your first name:");
        fname = input.nextLine();

        System.out.println("Please enter your last name:");
        lname = input.nextLine();

        System.out.println("Please enter your age:");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your email address:");
        email = input.nextLine();

        System.out.println("Please enter your phone number:");
        phone = input.nextLine();

        System.out.println("Please enter your address:");
        address = input.nextLine();

        System.out.println("\tUser who joined this program is " + fname + " " + lname + ". " + fname + "'s age is \n" +
                            age + ". " + fname + "'s email address is " + email + ", phone number \n" +
                            "is " + phone + ", and address is " + address + ".");




    }
}