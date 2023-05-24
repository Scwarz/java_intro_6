package mathClass;

public class FindMax {
    public static void main(String[] args) {
        //finding the max of 2 numbers
        int num1 = -10;
        int num2 = -15;

        int max = Math.max(num1, num2);

        System.out.println(max);

        //Finding the max of 4 numbers

        int number1 = -25;
        int number2 = 35;
        int number3 = 5;
        int number4 = 18;

        // max between number1 and number2 = 8
        // max between number3 and number4 = 18

        int max1 = Math.max(number1, number2);
        int max2 = Math.max(number3, number4);
        int finalMax = Math.max(max1, max2);

        System.out.println(finalMax);

        //Finding the max of 3 numbers

        number1 = -30;
        number2 = -40;
        number3 = 0;

        max1 = Math.max(number1, number2);

        System.out.println(Math.max(max1, number3));//0


        //Finding the max of 5 numbers
        int a = 5;
        int b = 10;
        int c = 50;
        int d = 189;
        int e = 12;

        //Math.max( Math.max(a,b), Math.max(c,d)) == the max of the first 4 numbers
        max1 = Math.max(a, b);//(5, 10) -> 10
        max2 = Math.max(c, d);//(50, 189) -> 189
        int max3 = Math.max(max1, max2);//(10, 189) -> 189
        finalMax = Math.max(max3, e);//(189, 12) -> 189

        System.out.println(finalMax);


        System.out.println(Math.max(Math.max( Math.max(a,b), Math.max(c,d)), e));



    }
}
