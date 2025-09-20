package exercicios.estruturarepetitivawhile;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your product preference?");
        System.out.println("[1]Alcohol [2]GASOLINE [3]DIESEL [4] END");
        int userCheck = sc.nextInt();
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        while (userCheck != 4){
            if (userCheck == 1){
                alcohol += 1;
            }
            else if (userCheck == 2){
              gasoline += 1;
            }
            else if (userCheck == 3){
                diesel += 1;
            }
            System.out.println("What is your product preference?");
            System.out.println("[1]Alcohol [2]GASOLINE [3]DIESEL [4] END");
            userCheck = sc.nextInt();
        }
        System.out.println("Thank you very match");
        System.out.println("ALCOHOL: " + alcohol);
        System.out.println("GASOLINE: " + gasoline);
        System.out.println("DIESEL: " + diesel);
        sc.close();

    }
}
