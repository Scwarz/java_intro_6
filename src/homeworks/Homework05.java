package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner askUser = new Scanner(System.in);
        System.out.println("\t----- TASK1 -----\t");

        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0) {
                System.out.print("" + i + " - ");
            }
        }
        System.out.println("\t----- TASK1 ENDS-----\t");
        System.out.println("\t----- TASK2 -----\t");
        for (int i = 1; i < 51; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " - ");
            }
        }
        System.out.println("\t----- TASK2 ENDS-----\t");
        System.out.println("\t----- TASK3 -----\t");
        for (int i = 100; i > 49; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " - ");
            }
        }
        System.out.println("\t----- TASK3 ENDS-----\t");
        System.out.println("\t----- TASK4 -----\t");
        for (int i = 0; i < 8; i++) {
            System.out.println("The square of " + i + " is = " + (int)Math.pow(i, 2));
        }
        System.out.println("\t----- TASK4 ENDS-----\t");
        System.out.println("\t----- TASK5 -----\t");
        int task5sum = 0;
        for (int i = 1; i < 11; i++) {
            int sum5 = task5sum + i;
            task5sum = sum5;
        }
        System.out.println(task5sum);
        System.out.println("\t----- TASK5 ENDS-----\t");
        System.out.println("\t----- TASK6 -----\t");

        System.out.println("Enter a positive number, please.");
        int task6Num = askUser.nextInt();
        int factorial = 1;
        for (int i = 1; i <= task6Num ; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + task6Num + " = " + factorial);
        System.out.println("\t----- TASK6 ENDS-----\t");
        System.out.println("\t----- TASK7 -----\t");
        System.out.println("Enter a name, please.");
        String task7Name = askUser.nextLine();
        int vowels = 0;
        char vow;
        task7Name = task7Name.toLowerCase();
        for (int i = 0; i < task7Name.length(); i++) {
            vow = task7Name.charAt(i);
            if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u'){
                vowels++;
            }
        }
        System.out.println("There are " + vowels + " vowels in this name");
        System.out.println("\t----- TASK7 ENDS-----\t");
        /*
        Belal's way of doing this task
        TASK8
        int sum = 0;
        int i = 0;
        do {
            sum += askUser.NextInt();
            i++;
        }
        while (sum < 100);
        if (i == 1) sout("Number is more than 100");
        else sout("sum is at least 100");
         */
        System.out.println("\t----- TASK8 -----\t");
        int task8Num = 0;
        int task8Sum = 0;
        do{
            System.out.println("Please enter a number");
            task8Num = askUser.nextInt();
            if(task8Num > 100){
                System.out.println("Entered number is more than 100");
                break;
            }
            else if (task8Sum + task8Num <= 100)
                task8Sum += task8Num;
        }
        while (task8Sum <= 100);
        System.out.println("Sum of the entered numbers is at least 100");
        System.out.println("\t----- TASK8 ENDS-----\t");
        System.out.println("\t----- TASK9 -----\t");
        /*
        Belal's way of doing this task ---->

        int givenNum = 5; //scanner imagined
        int firstNum = 0;
        int secNum = 1;
        int nextNum;

        String answer = "";

        if (givenNum == 1) sout("0");
        else if (givenNum == 2) sout("0 - 1");
        else {
            for (int i = 0; i < givenNum; i++) {
                nextNum = firstNum + secNum;
                firstNum = secNum;
                secNum = nextNum;
                answer += nextNum + " - ";
                 }
            sout (answer.substring(0, answer.length() - 3));
       }
         */
        System.out.println("Please enter a number");
        int task9Num = askUser.nextInt();
        int starts1 = 1, starts0 = 0;
        for (int i = 0; i < task9Num; ++i) {
            System.out.println(starts0 + " - ");
            int fibonacci = starts0 + starts1;
            starts0 = starts1;
            starts1 = fibonacci;
        }
        System.out.print(task9Num);

        System.out.println("\t----- TASK9 ENDS-----\t");
        System.out.println("\t----- TASK10 -----\t");
        /*
        Belal's way of doing this task ---->

        String name;

        do {
            name = ScannerHelper.getAName();
        }
        while (name.toLowerCase().charAt(0) != 'j');
         */
        char letter;
        System.out.println("Enter a name, please.");
        String task10Name = askUser.nextLine();
        for (int i = 0; i <= task10Name.length() - 1 ; i++) {
            task10Name = task10Name.toLowerCase();
            if(task10Name.charAt(0) == 'j')
                break;
        }
        System.out.println("End of program");
        System.out.println("\t----- TASK10 ENDS-----\t");
    }
}
