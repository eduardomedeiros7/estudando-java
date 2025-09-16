package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double A, B, C, triangle, circle, trapeze, square, rectangle;
        System.out.println("Enter the values:");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        triangle = A * C / 2.0;
        circle = 3.14159 * C * C;
        trapeze = (A + B) / 2.0 * C;
        square = B * B;
        rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapeze);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);
        sc.close();


    }
}
