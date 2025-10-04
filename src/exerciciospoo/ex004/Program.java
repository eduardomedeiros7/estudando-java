package exerciciospoo.ex004;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dollarsToBuy = sc.nextDouble();

        double amountInReais = CurrencyConverter.dollarsToReais(dollarPrice, dollarsToBuy);

        System.out.println("----------------------------------------");
        System.out.printf("Amount to be paid in reais = %.2f\n");
        sc.close();



    }
}
