package exerciciospoo.ex05.application;

import exerciciospoo.ex05.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Account account;


        System.out.print("Enter account number:");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder:");
        String holder = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
         char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Enter initial deposit value:");
             double initialDeposit = sc.nextDouble();
            account = new Account(number,holder,initialDeposit);
        }
        else{
             account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println("Enter a withdraw value:");
        depositValue = sc.nextDouble();
        account.withdraw(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }

}
