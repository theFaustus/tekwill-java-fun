package javaapi.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        Period p1 = Period.of(1, 1, 1);
        Period p2 = Period.ofDays(15);

        Period p3 = Period.between(LocalDate.of(1970, Month.JANUARY, 1), LocalDate.now());
        Period p4 = Period.between(LocalDate.now(), LocalDate.of(1970, Month.JANUARY, 1));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(LocalDate.now().minus(p3));
        System.out.println(LocalDate.now().plus(p4));
        System.out.println(LocalDateTime.now().plus(Period.ofYears(15)));
        Period p5 = Period.of(15, 60, 14);
        System.out.println(p5);
        System.out.println(LocalDateTime.now().plus(p5));

        System.out.println(p5.minusDays(30).minusMonths(25).minusYears(10));
        System.out.println(p5.plusDays(30).plusMonths(25).plusYears(10));
        long l = p5.toTotalMonths();
        System.out.println(l);
    }
}
