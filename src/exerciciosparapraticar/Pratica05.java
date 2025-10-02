package exerciciosparapraticar;

import java.util.Locale;
import java.util.Scanner;

public class Pratica05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double tax = 0.0;
        double finalSalary = 0.0;
        System.out.println("Gross salary:");
        double grossSalary = sc.nextDouble();

        if (grossSalary <=0.0){
            System.out.println("Invalid salary");
        }
        else if (grossSalary <= 2000.00){
            tax = 0.0;
        }
        else if (grossSalary > 2000.00 && grossSalary <= 3500.00){
            tax = grossSalary * 0.10;
        }
        else{
            tax = grossSalary * 0.20;
        }
        finalSalary = grossSalary - tax;
        System.out.printf("Final salary: %.2f " ,finalSalary);
        sc.close();


    }
}
