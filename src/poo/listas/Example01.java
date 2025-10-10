package poo.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("CR7");
        list.add("Ronaldo");
        list.add("Ronaldinho");
        list.add("Eduardo");
        list.add(2,"Marco");

        System.out.println(list.size());
        for (String player: list){
            System.out.println(player);
        }
        System.out.println("---------------------");
        list.remove(1);
        list.remove("Ronaldo");
        list.removeIf(x -> x.charAt(0) == 'R');
        for (String player : list){
            System.out.println(player);
        }
        System.out.println("----------------------");
        System.out.println("index of Bob: " + list.indexOf("Marco"));
        System.out.println("index of Bob: " + list.indexOf("Messi"));
        System.out.println("------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0)== 'E').collect(Collectors.toList());

        for (String players: result){
            System.out.println(players);
        }

        System.out.println("------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}
