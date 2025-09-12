package aprendendojava.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Enter a value:");
        double valueA = sc.nextDouble();

        System.out.println("Valor de (A): " + valueA);
        sc.close();
    }
}
