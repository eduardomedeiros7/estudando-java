package exerciciospoo.ex014;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Just today`s date: " + today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date end time " + now);

        Instant currentMoment = Instant.now();
        System.out.println("CurrentMoment (UCT): " + currentMoment);

    }
}
