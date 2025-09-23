package exercicios.estruturarepetitivafor;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        int fac = 1;

        for (int i = 2; i <= N; i++){
            fac *= i;
    }
        System.out.println("Factorial of " + N + " is " + fac);
        sc.close();

    }
}
