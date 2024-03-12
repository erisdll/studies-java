package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate date01 = LocalDate.now();
        LocalDateTime datetime01 = LocalDateTime.now();
        Instant instant01 = Instant.now();
        LocalDate date02 = LocalDate.parse("2024-07-20");
        LocalDateTime datetime02 = LocalDateTime.parse("2024-07-20T01:02:03");
        Instant instant02 = Instant.parse("2024-07-20T01:02:03Z");
        Instant instant03 = Instant.parse("2024-07-20T01:02:03-03:00");

        LocalDate date03 = LocalDate.parse("20/07/2022");

        System.out.println(date01);
        System.out.println(datetime01);
        System.out.println(instant01);
        System.out.println(date02);
        System.out.println(datetime02);
        System.out.println(instant02);
        System.out.println(instant03);
        System.out.println(date03);
    }
}
