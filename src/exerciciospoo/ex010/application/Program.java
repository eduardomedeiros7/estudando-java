package exerciciospoo.ex010.application;

import exerciciospoo.ex010.application.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int N = sc.nextInt();

        for (int i = 0; i <N; i++){
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.println("Id:");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase:");
        int idSalary =  sc.nextInt();
        Integer pos = position(list, idSalary);
        if (pos == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.println("Enter the percentage:");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("list of employees: ");
        for (Employee employee : list){
            System.out.println(employee);
        }



        sc.close();
    }
    // FUNÇÃO AUXILIAR
    public static Integer position(List<Employee>list, int id){
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;

    }
}
