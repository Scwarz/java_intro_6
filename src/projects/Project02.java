package projects;

import java.time.Year;
import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        /*
        TASK-1
        -Write a program that asks user to enter their 3 numbers
        -Then multiply these numbers and print the result in the format:
        The product of the numbers entered is =
        {number1}*{number2}*{number3}
         */
        System.out.println("\n***** TASK 1 *****\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers: "); // 2 4 5
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        input.nextLine();

        int product = num1 * num2 * num3;

        System.out.println("The product of the numbers entered is = " + product);


        /*
        TASK-2
        -Write a program that asks user to enter their first name, last name and year of
        birth.
        -Then calculate the age by subtracting the year of birth from current year we are in.
        -Print result in the format: {firstName} {lastName}’s age is = {currentYear}
        – {yearOfBirth}.
         */
        System.out.println("\n***** TASK 2 *****\n");

        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.println("What is your birth year?");
        int yearOfBirth = input.nextInt();
        input.nextLine();

        int currentYear = Year.now().getValue();
        int age = currentYear - yearOfBirth;

        System.out.println(firstName + " " + lastName + "'s age is = " + --age);

        /*
        TASK-3
        -Write a program that asks user to enter their full name and weight as kg.
        -Then calculate the weight as lb. NOTE: Assume 1 kg = 2.205 lbs.
        -Print result in the format: {fullName}’s weight is = {kgWeight * 2.205} lbs.
         */
        System.out.println("\n***** TASK 3 *****\n");

        System.out.println("What is your full name?");
        String fullName = input.nextLine();

        System.out.println("What is your weight as kg?");
        double weight = input.nextDouble();
        input.nextLine();

        double weightInLb = weight * 2.205;

        System.out.println(fullName + "'s weight is = " + weightInLb + "lbs.");

        /*
        TASK-4
        -Write a program that asks 3 students to enter their full name and age
        -Then print each student’s age with their full names as {fullName}’s age is {age}.
        -And, calculate the average age for these students and print result as The average
        age is {averageAge}.
        -And, find the eldest age and print result as The eldest age is {eldestAge}.
        -And, find the youngest age and print result as The youngest age is {youngestAge}.
         */
        System.out.println("\n***** TASK 4 *****\n");

        System.out.println("What is your full name?");
        String studentFullName1 = input.nextLine();

        System.out.println("What is your age?");
        int studentAge1 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String studentFullName2 = input.nextLine();

        System.out.println("What is your age?");
        int studentAge2 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String studentFullName3 = input.nextLine();

        System.out.println("What is your age?");
        int studentAge3 = input.nextInt();
        input.nextLine();

        System.out.println(studentFullName1 + "'s age is " + studentAge1 + ".");
        System.out.println(studentFullName2 + "'s age is " + studentAge2 + ".");
        System.out.println(studentFullName3 + "'s age is " + studentAge3 + ".");

        int averageAge = (studentAge1 + studentAge2 + studentAge3) / 3;
        int eldestAge = Math.max(studentAge1, Math.max(studentAge2, studentAge3));
        int youngestAge = Math.min(studentAge1, Math.min(studentAge2, studentAge3));

        System.out.println("The average age is " + averageAge + ".");
        System.out.println("The eldest age is " + eldestAge + ".");
        System.out.println("The youngest age is " + youngestAge + ".");

        int middleAge;
        String middleAgePerson;
        /*
            Matt = 34;
            Scott = 48;
            Ben = 23;
         */
        // 34 != 48 && 34 != 23 -> 34 is the middle age
        if (studentAge1 != eldestAge && studentAge1 != youngestAge) {
            middleAge = studentAge1;
            middleAgePerson = "Matt";
        } else if (studentAge2 != eldestAge && studentAge2 != youngestAge) {
            middleAge = studentAge2;
            middleAgePerson = "Scott";
        } else {
            middleAge = studentAge3;
            middleAgePerson = "Ben";
        }

    }
}
