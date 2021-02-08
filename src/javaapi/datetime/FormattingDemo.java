package javaapi.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDemo {
    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.of(2021, 1, 29, 1, 30);
        LocalDateTime ldt2 = LocalDateTime.of(2021, Month.JANUARY, 29, 2, 45);
        ZonedDateTime ldt3 = ZonedDateTime.now();
        LocalDateTime ldt4 = LocalDateTime.parse("2021-01-29T01:30");

        LocalDate ld1 = LocalDate.of(2021, 1, 29);
        LocalDate ld2 = LocalDate.of(2021, Month.JANUARY, 29);
        LocalDate ld3 = LocalDate.now();
        LocalDate ld4 = LocalDate.parse("2021-01-29");

        LocalTime lt1 = LocalTime.of(1, 30);
        LocalTime lt2 = LocalTime.of(15, 45, 30);
        LocalTime lt3 = LocalTime.parse("15:08");

        System.out.println();
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        System.out.println();
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println();
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter brokenTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter rfc1123DateTime = DateTimeFormatter.RFC_1123_DATE_TIME;

        DateTimeFormatter ofPattern1 = DateTimeFormatter.ofPattern("yyyy|MM|dd, E, HH:mm");
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("y|M|d --- hh");

        System.out.println();
        System.out.println(ldt1.format(dateFormatter));
        System.out.println(ldt2.format(timeFormatter));
        System.out.println(ldt3.format(dateTimeFormatter));
        System.out.println(ldt3.format(rfc1123DateTime));
        System.out.println();
        System.out.println(ld1.format(dateFormatter));
        System.out.println(ld2.format(DateTimeFormatter.ISO_ORDINAL_DATE));
        System.out.println();
        System.out.println(lt1.format(timeFormatter));
        System.out.println(lt2.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(lt3.format(brokenTimeFormatter));
        System.out.println();
        System.out.println(ldt1.format(ofPattern1));
        System.out.println(ldt1.format(ofPattern2));

        ldt4 = LocalDateTime.parse("2021|01|29, Fri, 01:30", ofPattern1);
        ld4 = LocalDate.parse("2021-01-29");
        lt3 = LocalTime.parse("15:08");

        System.out.println(ldt4);
        System.out.println(ld4);
        System.out.println(lt3);

        System.out.println(DateTimeFormatter.ISO_WEEK_DATE.format(LocalDate.now()));


    }
}
