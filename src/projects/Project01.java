package projects;

public class Project01 {
    public static void main(String[] args) {
        /*
            TASK-1
        -Store your name in a String variable called name
        -Print the variable with a proper message
        -EX/ My name is = name
        NOTE: Uppercases, lowercases and spaces are important
         */
        System.out.println("\n***** Task 1 *****\n");
        String name = "Jonathan Ochoa";
        System.out.println("My name is = " + name);

        /*
            TASK-2
        -Create different char variables for each of your name letter and store them in
        separate variables as nameCharacter1, nameCharacter2 and so on.
        -Print variables with proper messages
        -EX/Name letter 1 is = nameCharacter1
            Name letter 2 is = nameCharacter2
         */
        System.out.println("\n***** Task 2 *****\n");
        char nameCharacter1 = 'J'; // Ascii value = 74
        char nameCharacter2 = 'o'; // Ascii value = 110
        char nameCharacter3 = 'n'; // Ascii value = 111

        System.out.println("Name letter 1 is = " + nameCharacter1);
        System.out.println("Name letter 2 is = " + nameCharacter2);
        System.out.println("Name letter 3 is = " + nameCharacter3);

        System.out.println(nameCharacter1 + nameCharacter2 + nameCharacter3); // Output: 295
        System.out.println("" + nameCharacter1 + nameCharacter2 + nameCharacter3); // Output: Jon
        // "" -> "J" -> "Jo" -> "Jon"

        /*
            TASK-3
        -Create different String variables to store info like myFavMovie, myFavSong,
        myFavCity, myFavActivity, myFavSnack.
        -Print variables with proper messages
        -EX/My favorite movie is = myFavMovie
         */
        System.out.println("\n***** Task 3 *****\n");
        String myFavMovie = "Interstellar";
        String myFavSong = "Tron Legacy OST";
        String myFavCity = "Chicago";
        String myFavActivity = "Gaming";
        String myFavSnack = "Popcorn";

        System.out.println("My favorite movie is = " + myFavMovie);
        System.out.println("My favorite song is = " + myFavSong);
        System.out.println("My favorite city is = " + myFavCity);
        System.out.println("My favorite activity is = " + myFavActivity);
        System.out.println("My favorite snack is = " + myFavSnack);

        /*
            TASK-4
        -Create different int variables to store info like myFavNumber,
        numberOfStatesIVisited, numberOfCountriesIVisited.
        -Print variables with proper messages
        -EX/My favorite number is = myFavNumber
         */
        System.out.println("\n***** Task 4 *****\n");
        int myFavNumber = 27;
        int numberOfStatesIVisited = 8;
        int numberOfCountriesIVisited = 2;

        System.out.println("My favorite number is = " + myFavNumber);
        System.out.println("The number of states I've visited is = " + numberOfStatesIVisited);
        System.out.println("The number of countries I've visited is = " + numberOfCountriesIVisited);

        /*
            TASK-5
        -Create a boolean called amIAtSchoolToday
        -Assign true to this variable if you are at campus today
        -Assign false to this variable if you are joining online today
        -Print variable value with a proper message using println() method
        EX/ I am at school today = amIAtSchoolToday
         */
        System.out.println("\n***** Task 5 *****\n");
        boolean amIAtSchoolToday = false;

        System.out.println("I am at school today = " + amIAtSchoolToday);


        /*
            TASK-6
        -Create a boolean called isWeatherNiceToday
        -Assign true to this variable if it is above 60F today
        -Assign false to this variable if it is below or equal to 60F today
        -Print variable value with a proper message using println() method
        -EX/ Weather is nice today = isWeatherNiceToday
         */
        System.out.println("\n***** Task 6 *****\n");
        boolean isWeatherNiceToday = false;

        System.out.println("Weather is nice today = " + isWeatherNiceToday);
    }
}
