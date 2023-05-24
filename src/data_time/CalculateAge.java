package data_time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
         /*
        Ask user to enter their year of birth
        Calculate their age
        currentYear - yearOfBirth

        1993    -> 2023 - 1993  -> 30
        2002    -> 2023 - 2002  -> 21
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year of birth:");
        int age = input.nextInt();

        System.out.println(LocalDate.now().getYear() - age); //
    }
}
