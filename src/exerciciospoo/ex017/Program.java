package exerciciospoo.ex017;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();


        System.out.println("Standard format: " + now.toString());

        DateTimeFormatter fmtDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date BR: " + now.format(fmtDateBR)); //


        DateTimeFormatter fmtDateTimeBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Date end time BR: " + now.format(fmtDateTimeBR));


        DateTimeFormatter fmtCustom = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'às' HH:mm");
        System.out.println("Long format: " + now.format(fmtCustom));
    }
}
