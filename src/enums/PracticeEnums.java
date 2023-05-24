package enums;

import java.time.Month;

public class PracticeEnums {
    public static void main(String[] args) {
        System.out.println(DaysOfTheWeek.SUNDAY);
        System.out.println(DaysOfTheWeek.FRIDAY);


        for(DaysOfTheWeek day: DaysOfTheWeek.values()){
            System.out.println(day);
        }


        System.out.println(Month.JANUARY); // JANUARY

        for(Month m : Month.values()){
            System.out.println(m);
        }


        System.out.println(Constants.TShirtSize.MEDIUM); // MEDIUM
        System.out.println(Constants.Direction.WEST); // WEST

        for (Constants.Gender value : Constants.Gender.values()) {
            System.out.println(value);
        }

    }
}
