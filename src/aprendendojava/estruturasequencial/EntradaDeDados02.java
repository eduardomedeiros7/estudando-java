package aprendendojava.estruturasequencial;

import java.util.Scanner;

public class EntradaDeDados02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        int valueA = sc.nextInt();
        System.out.println("Valor de (A): " + valueA);
        sc.close();
    }
}
