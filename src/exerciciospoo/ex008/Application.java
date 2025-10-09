package exerciciospoo.ex008;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int count = 0;

        System.out.println("Enter a value for N");
        int N = sc.nextInt();

        int[] vet = new int[N];

        for (int i = 0; i < N; i++){
            System.out.println("Digite um núemro");
            vet[i] = sc.nextInt();
        }

        System.out.println("Number of pairs:");
        for (int i = 0; i<N; i++){
            if (vet[i] % 2 == 0){
                count += +1;
                System.out.print(vet[i]+"  ");
            }
        }
        System.out.println();
        System.out.println("Number of paris: " + count);


        sc.close();

    }
}
