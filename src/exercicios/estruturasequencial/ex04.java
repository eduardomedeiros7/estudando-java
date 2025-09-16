package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Employee number:");
        int numberEmployee = sc.nextInt();
        System.out.println("Number of working hours:");
        int wh = sc.nextInt();
        System.out.println("Hourly rate:");
        double hourlyRat = sc.nextDouble();

        double salary = wh * hourlyRat;
        System.out.println("Number: " + numberEmployee);
        System.out.println("Salary: U$ " + salary);


        sc.close();
    }
}
