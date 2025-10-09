package exerciciospoo.ex007;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Registration for how many people?");
        int N = sc.nextInt();
        sc.nextLine();

        String[] names = new String[N];
        int[] ages = new int[N];
        double[] heights = new double[N];
        double sumHeight = 0.0;

        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");
            System.out.println("Name:");
            names[i] = sc.nextLine();
            System.out.println("Age:");
            ages[i] = sc.nextInt();
            System.out.println("Height:");
            heights[i] = sc.nextDouble();
            sc.nextLine();

        }

        for (int i = 0; i < N; i++) {
            sumHeight = sumHeight + heights[i];
        }
        double averageHeight = sumHeight / N;

            System.out.printf("Média de altura: %.2f%n ", averageHeight);

            int cont = 0;
            for (int i =0; i <N; i++){
                if (ages[i] < 16){
                    cont += +1;
                }
            }
        double percent = (cont * 100.0) / N;
        System.out.printf("People under 16 years of age %.1f%%%n", percent);

        for(int i = 0; i<N; i++){
            if (ages[i] < 16){
                System.out.println(names[i]);
            }
        }

        sc.close();
        }
    }


