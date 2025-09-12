package aprendendojava.estruturasequencial;


import java.util.Scanner;

public class EntradaDeDados01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String x = sc.next();
        System.out.println("Nome: " + x);


        sc.close();
    }
}

