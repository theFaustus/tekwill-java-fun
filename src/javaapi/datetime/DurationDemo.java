package javaapi.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
    public static void main(String[] args) {
        Duration p1 = Duration.of(4, ChronoUnit.MINUTES);
        Duration p2 = Duration.ofDays(15);

        Duration p3 = Duration.between(LocalTime.of(15, 0), LocalTime.now());
        Duration p4 = Duration.between(LocalTime.now(), LocalTime.of(17, 35));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(LocalTime.now().minus(p3));
        System.out.println(LocalTime.now().plus(p4));
        System.out.println(LocalDateTime.now().plus(Duration.ofHours(15)));
        Duration p5 = Duration.ofSeconds(150);
        System.out.println(p5);
        System.out.println(LocalDateTime.now().plus(p5));

        System.out.println(p5.minusDays(30).minusHours(25).minusMillis(10));
        System.out.println(p5.plusDays(30).plusHours(10).plusNanos(10000));
        long l = p5.toDays();
        System.out.println(l);
    }
}
