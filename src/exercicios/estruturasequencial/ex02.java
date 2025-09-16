package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double R, A, pi = 3.14159;

        System.out.println("Value of the radius of a circle:");
        R = sc.nextDouble();
        A = pi * R * R;

        System.out.printf("Área = %.4f\n ", A);
        sc.close();



    }
}
