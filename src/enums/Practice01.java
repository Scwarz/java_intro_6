package enums;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a program prints "it is work day" if the day is a week day
        And it print "it is OFF today" if the day is weekend day

        SUNDAY, SATURDAY        -> it is OFF today
        MONDAY-FRIDAY           -> it is work day
         */


        DaysOfTheWeek dayByUser = DaysOfTheWeek.SUNDAY;

        switch (dayByUser){
            case SATURDAY:
            case SUNDAY:
                System.out.println("it is OFF today");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("it is work day");
                break;
            default:
                throw new RuntimeException("No such enum value!!!");
        }


    }
}
