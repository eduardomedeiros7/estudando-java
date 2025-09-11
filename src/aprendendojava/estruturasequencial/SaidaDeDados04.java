package aprendendojava.estruturasequencial;

import java.util.Locale;

public class SaidaDeDados04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);  //Separador de deciamis US
        double x = 10.234;
        System.out.println(x);
        System.out.printf("Com quebra de linha no final: %.2f%n",x);
        System.out.printf("Com quebra de linha no final: %.4f%n",x); // 4 casas decimais


    }
}
