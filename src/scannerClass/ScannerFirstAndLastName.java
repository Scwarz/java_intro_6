package scannerClass;

import java.util.Scanner;

public class ScannerFirstAndLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName, lName, address;

        System.out.println("Please enter your first name:");
        fName = scanner.next();

        System.out.println("Please enter your last name:");
        lName = scanner.next();
        scanner.nextLine();

        System.out.println("Please enter your address:");
        address = scanner.nextLine();

        System.out.println("Your full name is " + fName + " " + lName);
        System.out.println("Address: " + address);

    }
}
