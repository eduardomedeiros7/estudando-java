package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter the code for item 1:");
        int item1 = sc.nextInt();
        System.out.println("Number of items:");
        int numberItems1 = sc.nextInt();
        System.out.println("Enter the code for item 2:");
        int item2 = sc.nextInt();
        System.out.println("Number of items:");
        int numberItems2 = sc.nextInt();
        System.out.println("Unit value of item 1:");
        double valueUnit1 = sc.nextDouble();
        System.out.println("Unit value of item 2:");
        double valueUnit2 = sc.nextDouble();
        double totalValue = valueUnit1 * numberItems1 + valueUnit2 * numberItems2;
        System.out.printf("Total value: %.2f", totalValue);
        sc.close();
    }
}
