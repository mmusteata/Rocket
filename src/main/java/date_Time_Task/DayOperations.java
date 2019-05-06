package date_Time_Task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class DayOperations {

//        1.	How many days until Xmas
//        2.	How much time until Xmas (formatted as: x Months y Days z Hours)
//        3.	Current time in London/New York/Tokyo
//        4.	What day of the week was on 18 Oct 1985
//        5.	Append n chars in a for loop and calculate time consumed by appending.
//        (milliseconds or nanoseconds) Convert to seconds and format. Compare Builder with + operation

    private static LocalDate xmasDay = LocalDate.of(2019, 12, 25);

    public static void main(String[] args) {

        dayUntilXmas();
        System.out.println();
        timeUntilXmas();
        System.out.println();
        currentTimeInDifferentZones();
        System.out.println();
        dayOfWeek("1985-10-18");
        System.out.println();
        timeCounter(1000);
    }

    private static void dayOfWeek(String date) {

        DayOfWeek dayOfWeek = LocalDate.parse(date).getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    private static void currentTimeInDifferentZones() {
        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss zzz");

        System.out.println("Time in Chisinau: " + formatter.format(date));

        formatter.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Time in London: " + formatter.format(date));

        formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + formatter.format(date));

        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        System.out.println("Time in Tokyo: " + formatter.format(date));

    }

    private static void timeUntilXmas() {
        Period p = Period.between(LocalDate.now(), xmasDay);
        System.out.println("Remaining " + p.getMonths() + " months, " + p.getDays() + " days, " +
                           ChronoUnit.HOURS.between(LocalTime.now(), LocalDateTime.MAX) + " hours ");
    }

    private static void dayUntilXmas() {
        LocalDate today = LocalDate.now();
        System.out.println("Remaining " + ChronoUnit.DAYS.between(today, xmasDay) + " days until Xmas is come");
    }

    private static long timeForAddString(int a) {
        String str = "";
        long startTimeString = System.nanoTime();
        for (int i = 0; i < a; i++) {
            str += "A";
        }
        long endTimeString = System.nanoTime();
        long diffTimeString = endTimeString - startTimeString;
        return diffTimeString;
    }

    private static long timeForAddStringBuilder(int a) {

        StringBuilder str = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < a; i++) {
            str.append("A");
        }
        long endTimeBuilder = System.nanoTime();
        long diffTimeBuilder = endTimeBuilder - startTimeBuilder;
        return diffTimeBuilder;
    }

    private static void timeCounter(int numberOfCounters) {
        double tString = timeForAddString(numberOfCounters) / 1000000000.00;
        double tSBuilder = timeForAddStringBuilder(numberOfCounters) / 1000000000.00;
        System.out.printf("Time for add String in seconds is: %f", tString);
        System.out.println();
        System.out.printf("Time for add String Builder in seconds is: %f", tSBuilder);
        System.out.println();
        System.out.printf("String Builder is faster than String for %f", (tString / tSBuilder));
    }
}
