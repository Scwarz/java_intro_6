package recursion;

public class TestRecursion {

    public static void main(String[] args) {
        System.out.println(sum1ToNIterative(5)); // 15
        System.out.println(sum1ToNIterative(4)); // 10
        System.out.println(sum1ToNIterative(10)); // 55

        System.out.println(sum1ToNRecursive(4)); // 10
        System.out.println(sum1ToNRecursive(5)); // 15
        System.out.println(sum1ToNRecursive(10)); // 55

        System.out.println(factorialRecursive(3)); // 6
        System.out.println(factorialRecursive(4)); // 24
        System.out.println(factorialRecursive(5)); // 120
    }


    /*
     Create iterative and recursive methods that are used to find the sum of
     the numbers from 1 to n

     n = 5   -> 15
     n = 4   -> 10
     */

    public static int sum1ToNIterative(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int sum1ToNRecursive(int n){
        if(n != 1) return n + sum1ToNRecursive(n-1);
        return 1;
    }

    /*
    Write a recursive method that finds factorial of the given positive numbers
    Factorial: numbers multiples with all the numbers from 1 to itself

    3   -> 1*2*3    -> 6
    5   ->          -> 120
    6               -> 720
     */

    public static int factorialRecursive(int n){
        if(n != 1) return factorialRecursive(n-1) * n;
        return 1;
    }


    /*
    factorialRecursive(3)       -> 1 * 2 * 3
    factorialRecursive(2)       -> 1 * 2
    factorialRecursive(1)       -> 1

     */
}
