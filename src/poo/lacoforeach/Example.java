package poo.lacoforeach;

public class Example {
    public static void main(String[] args) {

        String[] names = new String[]{"CR7", "Messi", "Ronaldinho"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);


            System.out.println("----------------------------");
            for (String players: names){
                System.out.println(players);

            }

        }
    }
}
