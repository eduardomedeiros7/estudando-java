package poo.composicao.entities.application;

import poo.composicao.entities.Department;
import poo.composicao.entities.HourContract;
import poo.composicao.entities.Worker;
import poo.composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        sc.useLocale(Locale.US);

        System.out.print("Enter department`name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workName = sc.nextLine();
        System.out.print("Level: ");
        String workLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workName, WorkerLevel.valueOf(workLevel),baseSalary,new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Enter contract #" + i + "data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("value per hour:  ");
            double valuePorHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePorHour,hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));






        



        sc.close();
    }
}
