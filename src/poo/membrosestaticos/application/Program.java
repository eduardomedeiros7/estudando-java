package poo.membrosestaticos.application;

import poo.membrosestaticos.application.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

/* Um método static (como o main) só pode chamar
  diretamente outros membros static da mesma classe.*/
public class Program {
    public static  final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        sc.useLocale(Locale.US);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n ", c);
        System.out.printf("Volume: %.2f\n ", v);
        System.out.printf("PI value: %.2f\n ", Calculator.PI);
        sc.close();
    }




}
