package exerciciospoo.ex018.entities.application;

import exerciciospoo.ex018.entities.Employee;
import exerciciospoo.ex018.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Enter the number of employees:");
        int N = sc.nextInt();

        for (int i=1; i <=N; i++){
            System.out.println("Employee #" + i + "data:");
            System.out.print("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else{
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : list){
            System.out.println(emp.getName() + " -  $ " + String.format("%.2f", emp.payment()));

        }


        sc.close();


    }
}
