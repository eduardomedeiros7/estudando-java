package aprendendojava.estruturasequencial;

public class SaidaDeDados03 {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.12346;

        System.out.println(y);
        System.out.println("Sem contole de casas decimais: " + x);
        System.out.printf("Contolando casas decimais: %.2f",x); //Formatado

    }
}
