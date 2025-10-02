package exerciciospoo.ex001;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Retangulo retangulo = new Retangulo();


        System.out.println("Enter the height and width:");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", retangulo.area());
        System.out.printf("PERIMETER: %.2f\n", retangulo.perimeter());
        System.out.printf("DIAGONAL: %.2f\n", retangulo.diagonal());

        sc.close();

    }
}
