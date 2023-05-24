package arrays;

import java.util.Arrays;

public class Exercise02_CountStrings {
    public static void main(String[] args) {
        // 1. Declare a String array called as countries and assign size of 3
        String[] countries = new String[3];

        // 2. Assign "Spain" to index of 1
        countries[1] = "Spain";

        // 3. print the value at index of 1 and 2
        System.out.println(countries[1]); // Spain
        System.out.println(countries[2]); // null

        // 4. Assign "Belgium" at index of 0 and "Italy" at index of 2
        countries[0] = "Belgium";
        countries[2] = "Italy";

        // 5. Print the array [Belgium, Spain, Italy]
        System.out.println(Arrays.toString(countries));

        // 6. Sort this array and print it once again
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        // 7. Print each element with fori loop
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        // 8. Print each element with for each loop
        for (String country : countries) {
            System.out.println(country);
        }


        // 9. Count how many country has 5 characters -> 2
        int count5 = 0;

        for (String country : countries) {
            if(country.length() == 5) count5++;
        }

        System.out.println(count5); // 2


        count5 = 0;

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].length() == 5) count5++;
        }

        System.out.println(count5); // 2


        // 10. Count how many countries has letter I or i in their name -> 3
        int countI = 0;

        for (String country : countries) {
            if (country.toLowerCase().contains("i")) {
                countI++;
            }
        }

        System.out.println(countI); // 3
    }
}
