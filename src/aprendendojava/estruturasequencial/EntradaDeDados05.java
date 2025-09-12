package aprendendojava.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou: " + y);
        System.out.println("Você digitou: " + z);
    }
}
