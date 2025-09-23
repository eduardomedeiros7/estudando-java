package exercicios.estruturarepetitivafor;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){

            System.out.println("Enter the dividend: ");
            int x = sc.nextInt();
            System.out.println("Enter the divisor");
            int y = sc.nextInt();

            if (y == 0){
                System.out.println("Impossible division");
            }
            else{
                double div = (double)  x / y;
                System.out.printf("%.1f\n", div);
            }
        }
        sc.close();
    }
}
