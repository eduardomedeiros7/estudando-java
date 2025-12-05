package exerciciosparapraticar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pratica000 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Secret Santa drawing");
        System.out.println("number of participants:");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> participants = new ArrayList<>();

        for (int i = 0; i <n; i++ ){
            System.out.println("name: ");
            participants.add(scanner.nextLine());
        }

        Collections.shuffle(participants);

        System.out.println("--- Draw Result ---");

        for (int i = 0; i < participants.size(); i++){
            String giver = participants.get(i);
            String receiver;

            if (i == participants.size() -1){
                receiver = participants.get(0);
            }else{
                receiver = participants.get( i + 1);
            }
            System.out.println(giver + " gives a gift to -> " + receiver);
        }
        scanner.close();



    }
}
