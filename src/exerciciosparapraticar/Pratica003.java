package exerciciosparapraticar;

import java.util.Locale;
import java.util.Scanner;

public class Pratica003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Enter a value");
        int value = sc.nextInt();

        int profit = value * 2/ 100; // Exemplo de perda de precisão!!!
        System.out.println("Profit: " + profit);
        sc.close();
    }
}
