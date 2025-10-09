package exerciciospoo.ex006.application;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("How many numbers will you enter?");
        int N = sc.nextInt();

        int[] vet = new int [N];

        for (int i = 0; i < N; i++){
            System.out.println("Enter a number:");
            vet[i] = sc.nextInt();
        }
        System.out.println("Negative numbers:");
        for (int i =0; i < N; i++){
            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }

        sc.close();
        }
        }



