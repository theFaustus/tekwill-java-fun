package javaapi.datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.of(2021, 1, 29);
        LocalDate l2 = LocalDate.of(2021, Month.JANUARY, 29);
        LocalDate l3 = LocalDate.now();
        LocalDate l4 = LocalDate.parse("2021-01-29");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

//        l3 = LocalDate.of(2021, 4, 29);

        System.out.println(l3.getDayOfMonth());
        System.out.println(l3.getDayOfWeek());
        System.out.println(l3.getDayOfYear());
        System.out.println(l3.getMonth());
        System.out.println(l3.getMonthValue());
        System.out.println(l3.getYear());

        LocalDate other = l2.plusYears(2).plusDays(4);
        System.out.println(other);
        System.out.println(l3.isBefore(other));
        System.out.println(l3.isAfter(other));
        System.out.println(l3.isEqual(other));

        System.out.println(l4.minusYears(2).minusDays(3).minusMonths(4));


        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.parse("2020-02-01");

        while (!start.isEqual(end)) {
            System.out.println(start);
            start = start.plusDays(1);
        }

        System.out.println();

        System.out.println(l1.withMonth(5));
        System.out.println(l1.withYear(5));
        System.out.println(l1.withDayOfYear(5));
    }
}
