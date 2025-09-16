package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter 4 integer values:");
        int valueA = sc.nextInt();
        int valueB= sc.nextInt();
        int valueC = sc.nextInt();
        int valueD = sc.nextInt();

        int diff =  (valueA * valueB - valueC * valueD);
        System.out.println("DIFENÇA: " + diff);
        sc.close();



    }
}
