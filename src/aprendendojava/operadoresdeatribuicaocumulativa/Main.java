package aprendendojava.operadoresdeatribuicaocumulativa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int minutes = sc.nextInt();

        double account = 50.0;
        if (minutes > 100){
            account += (minutes - 100) * 2.0;
        }
        System.out.printf("Account value US$ " + account);
        sc.close();

    }
}
