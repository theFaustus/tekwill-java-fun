package javaapi.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.of(1, 30);
        LocalTime lt2 = LocalTime.of(15, 45, 30);

        System.out.println(lt1);
        System.out.println(lt2);

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.parse("15:09"));

        if (LocalTime.now().isAfter(LocalTime.NOON)) {
            System.out.println("soon we go home");
        } else {
            System.out.println("still more than half of a day to work");
        }

        if (LocalTime.parse("01:11").isAfter(LocalTime.MIDNIGHT)) {
            System.out.println("we still sleep");
        } else {
            System.out.println("still working");
        }

        if (LocalTime.parse("23:11").isAfter(LocalTime.MIDNIGHT)) {
            System.out.println("we still sleep");
        } else {
            System.out.println("still working");
        }

        System.out.println(LocalDate.of(2021, Month.FEBRUARY, 5).atTime(1, 11)
                .isAfter(LocalDate.now().atTime(LocalTime.MIDNIGHT)));
        System.out.println(LocalDate.of(2021, Month.FEBRUARY, 4).atTime(1, 11)
                .isAfter(LocalDate.now().atTime(LocalTime.MIDNIGHT)));

        System.out.println(lt1.getHour());
        System.out.println(lt1.getMinute());
        System.out.println(lt1.getSecond());

        LocalTime endTime = LocalTime.of(1, 30);
        LocalTime startTime = LocalTime.MIDNIGHT;

        while (startTime.isBefore(endTime)) {
            startTime = startTime.plusSeconds(1);
            System.out.println(startTime);
        }

        LocalTime localTime = startTime.withMinute(45);
        LocalTime localTime1 = startTime.withHour(2);
        System.out.println(localTime);
        System.out.println(localTime1);

        System.out.println(lt1.atDate(LocalDate.MAX));


    }
}
