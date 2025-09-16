package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Enter two integers:");
        int valueA = sc.nextInt();
        int valueB = sc.nextInt();
        int sum = valueA + valueB;
        System.out.println("Entrada:");
        System.out.println(valueA);
        System.out.println(valueB);
        System.out.println("Saída: " +  sum);
        sc.close();
    }
}
