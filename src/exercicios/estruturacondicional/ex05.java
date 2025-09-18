package exercicios.estruturacondicional;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valueTotal;
        System.out.println("Item code: ");
        int code = sc.nextInt();
        System.out.println("Item quantity: ");
        double quantity = sc.nextDouble();
        if (code == 1){
            valueTotal = quantity * 4.0;
        } else if (code == 2) {
            valueTotal = quantity * 4.5;
        } else if (code == 3) {
            valueTotal = quantity * 5.0;
        } else if (code == 4) {
            valueTotal = quantity * 2.0;
        }else{
            valueTotal = quantity * 1.5;
        }
        System.out.printf("Total: %.2f\n", valueTotal);



        sc.close();
    }
}
