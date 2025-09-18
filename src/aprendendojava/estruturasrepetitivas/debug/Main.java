package aprendendojava.estruturasrepetitivas.debug;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double width = sc.nextDouble();
        double length = sc.nextDouble();
        double squareMeter = sc.nextDouble();

        double area = width * length;
        double price = area * squareMeter;

        System.out.printf("AREA = %.2f\n",area);
        System.out.printf("PRICE = %.2f\n", price);
        sc.close();
    }
}
