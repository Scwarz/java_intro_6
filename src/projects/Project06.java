package projects;

import java.util.Arrays;

public class Project06 {

    /*
    TASK-1 - findGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find
    the greatest and smallest elements from the array and print them.
    Complete task using sort() method.
     */
    public static void findGreatestAndSmallestWithSort(int[] arr) {
        if (arr.length == 0) System.out.println("Array is empty!");
        else {
            Arrays.sort(arr);
            System.out.println("Smallest = " + arr[0]);
            System.out.println("Greatest = " + arr[arr.length - 1]);
        }
    }

    /*
    TASK-2 findGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find
    the greatest and smallest elements from the array and print them. DO NOT
    sort the array and complete task without sorting.
     */
    public static void findGreatestAndSmallest(int[] arr) {
        if (arr.length == 0 ) System.out.println("Array is empty!");
        else {
            int smallest = Integer.MAX_VALUE, greatest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) smallest = arr[i];
                else if (arr[i] > greatest) greatest = arr[i];
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        }
    }

    /*
    TASK-3 - findSecondGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. Complete task using sort() method.
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] arr) { // 10, 5, 6, 7, 8, 5, 15, 15
        Arrays.sort(arr);
        if (arr.length == 0) System.out.println("Array is empty!");
        else if (arr.length == 1) System.out.println("There are no second smallest and greatest numbers!");
        else if (arr.length == 2) {
            if (arr[0] == arr[1]) System.out.println("There are no second smallest and greatest numbers!");
            else {
                System.out.println("Second smallest = " + arr[1]); // 1, 2
                System.out.println("Second greatest = " + arr[0]); // 1, 2
            }
        } else {
            int secondSmallest = arr[0];
            int secondGreatest = arr[arr.length - 1];
            boolean allEqual = true;

            for (int num : arr) {
                if (num > secondSmallest) {
                    secondSmallest = num;
                    allEqual = false;
                    break;
                }
            }

            if (allEqual) {
                System.out.println("There isn't a second smallest and second greatest!");
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (arr[i] < secondGreatest) {
                        secondGreatest = arr[i];
                        break;
                    }
                }

                System.out.println("Second smallest = " + secondSmallest);
                System.out.println("Second greatest = " + secondGreatest);
            }
        }
    }

    /*
    TASK-4 - findSecondGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. DO NOT sort the array and complete task without sorting.
     */
    public static void findSecondGreatestAndSmallest(int[] arr) { // 10, 5, 6, 7, 8, 5, 15, 15
        if (arr.length == 0) System.out.println("Array is empty!");
        else if (arr.length == 1) System.out.println("There isn't a second smallest and second greatest!");
        else if (arr.length == 2) {
            if (arr[0] == arr[1]) System.out.println("There isn't a second smallest and second greatest!");
            else {
                System.out.println("Second smallest = " + Math.max(arr[0], arr[1]));
                System.out.println("Second greatest = " + Math.min(arr[0], arr[1]));
            }
        } else {
            int firstSmall = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
            int firstGreat = Integer.MIN_VALUE, secondGreat = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num < firstSmall) { // when we find a new num smaller than the firstNum...
                    secondSmall = firstSmall; // secondSmall becomes firstSmall
                    firstSmall = num; // then updated firstSmall to the new found small number
                } else if(num < secondSmall && num != firstSmall) {
                    secondSmall = num;
                }
                // loop 1 -
                // secondSmall = -21000000
                // firstSmall = 10

                // loop 2 -
                // secondSmall = 10
                // firstSmall = 5

                // loop 3 -
                // secondSmall = 6
                // firstSmall = 5

                if (num > firstGreat) {
                    secondGreat = firstGreat;
                    firstGreat = num;
                } else if(num > secondGreat && num != firstGreat) {
                    secondGreat = num;
                }
            }

            if (secondSmall == Integer.MAX_VALUE) System.out.println("There isn't a second small!");
            else System.out.println("Second smallest = " + secondSmall);

            if (secondGreat == Integer.MIN_VALUE) System.out.println("There isn't a second great!");
            else System.out.println("Second greatest = " + secondGreat);
        }
    }

    /*
    TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and
    print them.
    NOTE: It is case-sensitive!
     */
    public static void findDuplicatedElementsInAnArray(String[] arr) {
        // first loop is to compare the i element with the other elements in the array
        for (int i = 0; i < arr.length - 1; i++) {
            String str = arr[i];
            // second loop is the comparator loop, changing the elements to compare with i'th element
            for (int j = i + 1; j < arr.length; j++) {
                String str2 = arr[j];
                if (str.equals(str2)) {
                    System.out.println(str);
                    break;
                }
            }
        }
    }

    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.
     */
    public static void findMostRepeatedElementInAnArray(String[] arr) {
        int counter = 0, mostCount = 0, index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (index != Integer.MIN_VALUE && arr[index].equals(arr[i])) continue;
            String str = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                String str2 = arr[j];
                if (str.equals(str2)) {
                    counter++;
                }
            }

            if (counter > mostCount) {
                mostCount = counter;
                index = i;
            }
            counter = 0;
        }
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr1And2 = {10, 7, 7, 10, -3, 10, -3};
        int[] arr3And4 = {10, 5, 6, 7, 8, 5, 15, 15};
        String[] arr5 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        String[] arr6 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        findMostRepeatedElementInAnArray(arr6);
    }
}
