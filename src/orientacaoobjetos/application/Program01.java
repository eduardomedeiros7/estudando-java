package orientacaoobjetos.application;

import orientacaoobjetos.application.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Triangle x = new Triangle();
        Triangle y = new Triangle();


        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();
        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }
        System.out.printf("Triangle X area: %.4f\n",areaX);
        System.out.printf("Triangle Y area: %.4f\n",areaY);
        sc.close();


    }
}
