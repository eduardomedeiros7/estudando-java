package poo.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program03 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-10-29");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-29T01:30:26");
        Instant d06 = Instant.parse("2025-10-29T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r2);
        System.out.println("r4 = " + r2);

        System.out.println("d04 day = " + d04.getDayOfMonth());
        System.out.println("d04 month = " + d04.getMonthValue());
        System.out.println("d04 year = " + d04.getYear());


        System.out.println("d05 time = " + d05.getHour());
        System.out.println("d05 Minute = " + d05.getMinute());




    }
}
