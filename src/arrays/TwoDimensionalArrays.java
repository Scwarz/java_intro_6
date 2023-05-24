package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"Meerim", "Alina", "Carmela", "Ayat"},
                {"Yahya", "Adam", "Louie"},
                {"Dima", "Lesia", "Pinar"}
        };


        // How to print 2-dimensional array
        System.out.println(Arrays.deepToString(students)); // [[Meerim, Alina, Carmela, Ayat], [Yahya, Adam, Louie], [Dima, Lesia, Pinar]]

        // How to print an inner array
        System.out.println(Arrays.toString(students[0])); // [Meerim, Alina, Carmela, Ayat]
        System.out.println(Arrays.toString(students[1])); // [Yahya, Adam, Louie]
        System.out.println(Arrays.toString(students[2])); // [Dima, Lesia, Pinar]


        // How to print an element from an inner array - Louie
        System.out.println(students[1][2]); // Louie


        // How to print the length of the 2-dimensional array
        System.out.println(students.length); // 3


        // How to print the length of each inner array
        System.out.println(students[0].length); // 4
        System.out.println(students[1].length); // 3
        System.out.println(students[2].length); // 3


        System.out.println("\n-------Looping a 2-dimensional array-----\n");
        // How to loop a 2-dimensional array
        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));
        }

        for(String[] innerArray : students){
            System.out.println(Arrays.toString(innerArray));
        }


        System.out.println("\n-------Looping each element with for each loop-----\n");
        // How to loop a 2-dimensional array for each element
        for(String[] inner : students){
            //Each inner array is here
            for(String name : inner){
                //Each name is here
                System.out.println(name);
            }
        }

        System.out.println("\n-------Looping each element with fori loop-----\n");
        for (int i = 0; i < students.length; i++) {
            //Each inner array is here
            for (int j = 0; j <  students[i].length; j++) {
                System.out.println(students[i][j]);
            }
        }


        // Create a container that will store 5 groups of 3 numbers
        /*
        7 _ _
        _ _ _
        5 _ _
        _ 9 _
        _ _ _
         */

        int[][] numbers = new int[5][3];
        System.out.println(Arrays.deepToString(numbers));

        numbers[3][1] = 9;
        numbers[2][0] = 5;
        numbers[0][0] = 7;

        System.out.println(Arrays.deepToString(numbers));



    }
}
