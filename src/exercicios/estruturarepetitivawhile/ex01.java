package exercicios.estruturarepetitivawhile;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password:");
        int userPassword = sc.nextInt();

        int password = 2002;

        while (userPassword!=password){
            System.out.println("Invalid password");
            System.out.println("Try again...");
            userPassword = sc.nextInt();
        }
        System.out.println("Access allowed");

        sc.close();
    }
}
