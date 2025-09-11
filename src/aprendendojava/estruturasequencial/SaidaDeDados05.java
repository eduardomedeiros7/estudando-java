package aprendendojava.estruturasequencial;

public class SaidaDeDados05 {
    public static void main(String[] args) {

        int valueA = 50;
        int valueB = 50;
        int sum = valueA + valueB;

        System.out.println("A soma de " + valueA + " + " + valueB + " = " + sum);
        // para concatenar vários elementos em um mesmo comando de escrita


        System.out.printf("A soma de %d + %d = %d", valueA,valueB,sum);
        // Para concatenar no printf
    }
}
