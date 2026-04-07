package shinobimanager.application;

import shinobimanager.entities.Mission;
import shinobimanager.entities.Ninja;
import shinobimanager.entities.Village;
import shinobimanager.enums.RankNinja;

public class Program{
    static void main() {


        Village leaf = new Village("Villa Oculta da Folha");

        Ninja naruto = new Ninja("Naruto", RankNinja.GENIN, leaf);

        Mission m1 = new Mission("Resgatar o gato", 20.0);
        Mission m2 = new Mission("Escoltar o construtor Tazu", 150.0);
        Mission m3 = new Mission("Limpar o Rio Naka", 15.0);

        naruto.addMission(m1);
        naruto.addMission(m2);
        naruto.addMission(m3);

        System.out.println("--- RELATÓRIO DO HOKAGE---");
        System.out.println("Ninja: " + naruto.getName());
        System.out.println("Vila: " + naruto.getVillage().getName());
        System.out.println("Rank Atual: " + naruto.getRank());


        System.out.printf("Renda total acumulada: R$ %.2f\n", naruto.totalIncome());


    }


}
