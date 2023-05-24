package data_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class _01_LocalDateTime {
    public static void main(String[] args) {

        System.out.println("\n----------LocalDate-----------\n");
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate); // 2023-05-02 yyyy-MM-dd

        System.out.println(currentDate.getYear()); // 2023
        System.out.println(currentDate.getDayOfYear()); // 122
        System.out.println(currentDate.plusYears(2)); // 2025-05-02
        System.out.println(currentDate.minusDays(5)); // 2025-04-27
        System.out.println(currentDate.plusMonths(1).format(DateTimeFormatter.ofPattern("MMM d, yyyy"))); // Jun 2, 2023

        // MM/dd/yyyy
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))); // 05/02/2023
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("yyyy"))); // 2023


        System.out.println("\n----------LocalTime-----------\n");
        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime); // 18:14:32.855 hh:mm:ss.SSS
        System.out.println(currentTime.plusHours(6).format(DateTimeFormatter.ofPattern("HH:mm:ss a"))); // hh:mm:ss a 12:37:48 AM


        System.out.println("\n----------LocalDateTime-----------\n");
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentDateTime); // 2023-05-02T18:16:11.107 yyyy-MM-ddThh:mm:ss.SSS
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("MMM d, yyyy h:mm a")));// May 2, 2023 6:43 PM


        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(2023, Month.JANUARY, 23), LocalDate.now()));
        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(1993, Month.JANUARY, 1), LocalDate.now()));
        System.out.println(ChronoUnit.YEARS.between(LocalDate.of(1993, Month.JANUARY, 1), LocalDate.now()));
        System.out.println(ChronoUnit.MONTHS.between(LocalDate.of(1993, Month.JANUARY, 1), LocalDate.now()));
    }
}
