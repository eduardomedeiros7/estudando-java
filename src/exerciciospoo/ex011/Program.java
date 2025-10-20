package exerciciospoo.ex011;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];


        for (int i = 0; i< mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                mat[i][j] = scanner.nextInt();

            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < mat.length; i++ ){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j]< 0){
                    count ++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        scanner.close();
    }
}
