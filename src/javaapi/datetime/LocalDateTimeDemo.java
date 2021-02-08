package javaapi.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime l1 = LocalDateTime.of(2021, 1, 29, 1, 30);
        LocalDateTime l2 = LocalDateTime.of(2021, Month.JANUARY, 29, 2, 45);
        LocalDateTime l3 = LocalDateTime.now();
        LocalDateTime l4 = LocalDateTime.parse("2021-01-29T01:30");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

//        l3 = LocalDateTime.of(2021, 4, 29);

        System.out.println(l3.getDayOfMonth());
        System.out.println(l3.getDayOfWeek());
        System.out.println(l3.getDayOfYear());
        System.out.println(l3.getMonth());
        System.out.println(l3.getMonthValue());
        System.out.println(l3.getYear());

        System.out.println(l3.getHour());
        System.out.println(l3.getMinute());
        System.out.println(l3.getSecond());

        LocalDateTime other = l2.plusYears(2).plusDays(4);
        System.out.println(other);
        System.out.println(l3.isBefore(other));
        System.out.println(l3.isAfter(other));
        System.out.println(l3.isEqual(other));

        System.out.println(l4.minusYears(2).minusDays(3).minusMonths(4));


        LocalDateTime start = LocalDateTime.of(2020, 1, 1, 16, 30);
        LocalDateTime end = LocalDateTime.parse("2020-02-01T16:30");


        while (!start.isEqual(end)) {
            System.out.println(start);
            start = start.plusDays(1);
        }

        System.out.println();

        System.out.println(l1.withMonth(5));
        System.out.println(l1.withYear(5));
        System.out.println(l1.withDayOfYear(5));


        System.out.println(start.toLocalDate());
        System.out.println(start.toLocalTime());
    }
}
