package exerciciosparapraticar;

import java.util.Locale;
import java.util.Scanner;

public class Pratica002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double commission;

        System.out.println("Enter the total sales amount:");
        double totalSales = sc.nextDouble();
        if (totalSales <= 5000.0){
            commission = totalSales * 0.02;
        }
        else if (totalSales > 5000.0 && totalSales <= 10000.0){
            commission = totalSales * 0.05;

        }
        else{
            commission = totalSales * 0.10;
        }
        System.out.printf(" Commission: %.2f " ,commission);


        sc.close();
    }
}
