package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("-----TASK1-----");


        System.out.println("Please enter 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));



        System.out.println("\n-----TASK2-----");

        int number1, number2, number3, number4, number5;

        System.out.println("Please enter 5 numbers:");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        number4 = input.nextInt();
        number5 = input.nextInt();

        System.out.println("Max value = " + (Math.max(number1, Math.max(Math.max (number2, number3), Math.max (number4, number5) ))));
        System.out.println("Min value = " + (Math.min(number1, Math.min(Math.min (number2, number3), Math.min (number4, number5) ))));



        System.out.println("\n-----Task3-----");

        int randomOne = (int) (Math.random() * (51) + 50);
        int randomTwo = (int) (Math.random() * (51) + 50);
        int randomThree = (int) (Math.random() * (51) + 50);

        System.out.println("Number 1 = " + randomOne);
        System.out.println("Number 2 = " + randomTwo);
        System.out.println("Number 3 = " + randomThree);

        System.out.println("The sum of the numbers is = " + (randomOne + randomTwo + randomThree));



        System.out.println("\n-----TASK4-----");

        double alex = 125.0;
        double mike = 220.0;

        double alexNewAmount = alex - 25.5;
        double mikeNewAmount = mike + 25.5;
        System.out.println("Alex's money: $" + alexNewAmount);
        System.out.println("Mike's money: $" + mikeNewAmount);

        System.out.println("\n-----TASK5-----");

        double costOfBike = 390.0;
        double dailySavings = 15.60;
        int perDay = (int) (costOfBike / dailySavings);

        System.out.println(perDay);



        System.out.println("\n-----TASK6-----");

        String s1 = "5", s2 = "10";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("Product of 5 and 10 is = " + (i1 * i2));
        System.out.println("Division of 5 and 10 is = " + (i1 / i2));
        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("Remainder of 5 and 10 is = " + (i1 % i2));



        System.out.println("\n-----TASK7-----");

        String s3 = "200", s4 = "-50";

        int i3 = Integer.parseInt(s3);
        int i4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(i3, i4));
        System.out.println("The smallest value is = " + Math.min(i3, i4));
        System.out.println("The average is = " + (i3 + i4) / 2);
        System.out.println("The absolute difference is = " + Math.abs(i3 - i4));



        System.out.println("\n-----TASK8-----");

        double quarter = .25 * 3;
        double dime = .10;
        double nickles = .05 * 2;
        double penny = .01;
        double total = quarter + dime + nickles + penny;

        int daysToSave24 = (int) (24/(total));
        int daysToSave168 = (int) (168/(total));
        double saving5Months = ((30 * 5) * (total));

        System.out.println(daysToSave24 + " days");
        System.out.println(daysToSave168 + " days");
        System.out.println("$" + saving5Months);



        System.out.println("\n-----TASK9-----");

        double newComputer = 1_250.0;
        double saving = 62.5;
        int daysUntilComputer = (int) (newComputer / saving);
        System.out.println(daysUntilComputer);



        System.out.println("\n-----TASK10-----");

        double costOfCar = 14_265.0;
        double option1 = 475.50;
        double option2 = 951.0;

        int monthsToPay1 = (int) (costOfCar / option1);
        int monthsToPay2 = (int) (costOfCar / option2);

        System.out.println("Option 1 will take " + monthsToPay1 + " months");
        System.out.println("Option 2 will take " + monthsToPay2 + " months");



        System.out.println("\n-----TASK11-----");

        System.out.println("Enter first number = ");
        number1 = input.nextInt();
        System.out.println("Enter second number = ");
        number2 = input.nextInt();

        double division = (double)number1/(double)number2;
        System.out.println(division);



        System.out.println("\n-----TASK12-----");

        int randomOne1 = (int) (Math.random() * 101);
        int randomTwo2 = (int) (Math.random() * 101);
        int randomThree3 = (int) (Math.random() * 101);

        System.out.println(randomOne1 > 25 && randomTwo2 > 25 && randomThree3 > 25);


        System.out.println("\n-----TASK13-----");

        System.out.println("Hey user, please enter a number between 1 to 7: ");
        int input1 = input.nextInt();

        switch (input1){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }

        }
        /*
        SECOND WAY:
        if(input1 == 1){
            System.out.println("MONDAY");
        }
        else if(input1 == 2){
            System.out.println("TUESDAY");
        }
        else if(input1 == 3){
            System.out.println("WEDNESDAY");
        }
        else if(input1 == 4){
            System.out.println("THURSDAY");
        }
        else if (input1 == 5){
            System.out.println("FRIDAY");
        }
        else if(input1 == 6){
            System.out.println("SATURDAY");
        }
        else if(input1 == 7){
            System.out.println("SUNDAY");
        }


 */


        System.out.println("\n-----TASK14-----");

        int exam5, exam6, exam7;

        System.out.println("Tell me your exam results?");
        exam5 = input.nextInt();
        exam6 = input.nextInt();
        exam7 = input.nextInt();

        int average = (exam5 + exam6 + exam7) / 3;

        if(average >= 70){
            System.out.println("YOU PASSED!");
        } else{
            System.out.println("YOU FAILED!");
        }

        System.out.println("\n------Task15------");

        int n1, n2, n3;

        System.out.println("Enter 3 numbers");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if(n1 == n2 && (n2 == n3)){
            System.out.println("TRIPLE MATCH");
        } else if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.println("DOUBLE MATCH");
        } else{
            System.out.println("NO MATCH");
        }







    }
}