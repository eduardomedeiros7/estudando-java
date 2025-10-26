package exerciciospoo.ex015;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Program {
    public static void main(String[] args) {

        LocalDate myBirthday = LocalDate.of(1936, Month.JULY, 30);
        System.out.println("My birthday: " + myBirthday);

        LocalDateTime eventStart = LocalDateTime.of(2025, Month.DECEMBER,10,9,30,0);
        System.out.println("Event start: " + eventStart);
    }
}
