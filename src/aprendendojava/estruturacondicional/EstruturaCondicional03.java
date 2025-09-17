package aprendendojava.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("How many hours?");
        int time = sc.nextInt();

        // ENCADEAMNETO DE ESTRUTURAS CONDICIONAIS
        if (time < 12) {
            System.out.println("Good morning!");
        }else{
            if (time < 18){
                System.out.println("Good afternoon!");
            }else{
                System.out.println("Goodnight!");
            }
        }
        sc.close();

    }
}
