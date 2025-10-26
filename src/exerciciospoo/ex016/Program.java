package exerciciospoo.ex016;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        try {
            LocalDate dateISO = LocalDate.parse("2025-10-26");
            LocalDateTime dateTimeISO = LocalDateTime.parse("2025-10-26T20:00:00");
            System.out.println("Date ISO: " + dateISO);
            System.out.println("ISO date end time: " + dateTimeISO);

            String textDateBR = "31/12/2025";
            DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateBR = LocalDate.parse(textDateBR,formatterBR);
            System.out.println("Date BR: " + dateBR);

            String textDateHoraBR = "31/12/2025 23:59";
            DateTimeFormatter formatterTimeBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime dateTimeBR = LocalDateTime.parse(textDateHoraBR, formatterTimeBR);
            System.out.println("date end time: " + dateTimeBR);
        } catch (DateTimeException e){
            System.out.println("Error converting text to date/time:" + e.getMessage());
        }
    }
}
