package aprendendojava.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("How many hours?");
        int time = sc.nextInt();
        // ESTRUTURA CONDICIONAL COMPOSTA!
        if (time < 12) {
            System.out.println("Good morning!");
        }else{
            System.out.println("Good afternoon");
        }
        sc.close();
    }
}
