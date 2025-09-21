package aprendendojava.estruturasrepetitivas.para;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
        sc.close();
    }
}
