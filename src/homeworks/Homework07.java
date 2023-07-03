package homeworks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("==========Task 1==========\n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);
        System.out.println("\n==========Task 1 ENDS=====");
        System.out.println("\n==========Task 2==========\n");
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);
        System.out.println("\n==========Task 2 ENDS=====");
        System.out.println("\n==========Task 3==========\n");
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(23);
        numbers2.add(-34);
        numbers2.add(-56);
        numbers2.add(0);
        numbers2.add(89);
        numbers2.add(100);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("\n==========Task 3 ENDS=====");
        System.out.println("\n==========Task 4==========\n");
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);
        System.out.println("\n==========Task 4 ENDS=====");
        System.out.println("\n==========Task 5==========\n");
        ArrayList<String> characters = new ArrayList<String>();
        characters.add("Spider Man");
        characters.add("Iron Man");
        characters.add("Black Panther");
        characters.add("Deadpool");
        characters.add("Captain America");

        System.out.println(characters);
        if (characters.contains("Wolverine")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("\n==========Task 5 ENDS=====");
        System.out.println("\n==========Task 6==========\n");
        ArrayList<String> characters2 = new ArrayList<String>();
        characters2.add("Hulk");
        characters2.add("Black Widow");
        characters2.add("Captain America");
        characters2.add("Iron Man");

        Collections.sort(characters2);
        System.out.println(characters2);

        if (characters2.contains("Hulk") && characters2.contains("Iron Man")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("\n==========Task 6 ENDS=====");
        System.out.println("\n==========Task 7==========\n");
        ArrayList<String> characters3 = new ArrayList<String>();
        characters3.add("A");
        characters3.add("x");
        characters3.add("$");
        characters3.add("%");
        characters3.add("9");
        characters3.add("*");
        characters3.add("+");
        characters3.add("F");
        characters3.add("G");

        System.out.println(characters3);

        for (String character : characters3) {
            System.out.println(character);
        }
        System.out.println("\n==========Task 7 ENDS=====");
        System.out.println("\n==========Task 8==========\n");
        ArrayList<String> objects = new ArrayList<String>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);

        Collections.sort(objects);
        System.out.println(objects);

        int countStartsWithM = 0;
        int countNoAE = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) {
                countStartsWithM++;
            }
            if (!object.toLowerCase().contains("a") || !object.toLowerCase().contains("e") ) {
                countNoAE++;
            }
        }

        System.out.println(countStartsWithM);
        System.out.println(countNoAE);
        System.out.println("\n==========Task 8 ENDS=====");
        System.out.println("\n==========Task 9==========\n");
        ArrayList<String> kitchenObjects = new ArrayList<String>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");

        System.out.println(kitchenObjects);

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countWithP = 0;
        int countStartsOrEndsWithP = 0;
        for (String object : kitchenObjects) {
            if (Character.isUpperCase(object.charAt(0))) {
                countUpperCase++;
            } else {
                countLowerCase++;
            }
            if (object.toLowerCase().contains("p")) {
                countWithP++;
            }
            if (object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p")) {
                countStartsOrEndsWithP++;
            }
        }

        System.out.println("Elements starts with uppercase = " + countUpperCase);
        System.out.println("Elements starts with lowercase = " + countLowerCase);
        System.out.println("Elements having P or p = " + countWithP);
        System.out.println("Elements starting or ending with P or p = " + countStartsOrEndsWithP);
        System.out.println("\n==========Task 9 ENDS=====");
        System.out.println("\n==========Task 10==========\n");
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(3);
        numbers3.add(5);
        numbers3.add(7);
        numbers3.add(10);
        numbers3.add(0);
        numbers3.add(20);
        numbers3.add(17);
        numbers3.add(10);
        numbers3.add(23);
        numbers3.add(56);
        numbers3.add(78);

        System.out.println(numbers3);

        int divisibleByTen = 0;
        for (int num : numbers3) {
            if (num % 10 == 0) {
                divisibleByTen++;
            }
        }
        System.out.println("Elements that can be divided by 10 = " + divisibleByTen);

        int evenGreaterThanFifteen = 0;
        for (int num : numbers3) {
            if (num > 15 && num % 2 == 0) {
                evenGreaterThanFifteen++;
            }
        }
        System.out.println("Elements that are even and greater than 15 = " + evenGreaterThanFifteen);

        int oddLessThanTwenty = 0;
        for (int num : numbers3) {
            if (num < 20 && num % 2 != 0) {
                oddLessThanTwenty++;
            }
        }
        System.out.println("Elements that are odd and less than 20 = " + oddLessThanTwenty);

        int lessThanFifteenOrGreaterThanFifty = 0;
        for (int num : numbers3) {
            if (num < 15 || num > 50) {
                lessThanFifteenOrGreaterThanFifty++;
            }
        }
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessThanFifteenOrGreaterThanFifty);













    }
}
>>>>>>> f211cd07623c5445678f97d0e2f6de0d3906e188
