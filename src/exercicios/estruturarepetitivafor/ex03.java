package exercicios.estruturarepetitivafor;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Number of averages to be calculated:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double average = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.println(average);
        }
        sc.close();



    }


}

