package shinobimanager.entities;

import shinobimanager.enums.RankNinja;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Ninja {

    private String name;
    private RankNinja rank;
    private Village village;

    private List<Mission> missions = new ArrayList<>();


    public Ninja(String name, RankNinja rank, Village village){
        this.name = name;
        this.rank = rank;
        this.village = village;
    }

    public  void addMission(Mission mission){
        missions.add(mission);
    }

    public double totalIncome(){
        double sum = rank.getBasePayment();

        for (Mission m : missions){
            sum += m.getReward();
        }
        return sum;
    }
    public String getName() { return name; }
    public RankNinja getRank() { return rank; }
    public void setRank(RankNinja rank) { this.rank = rank; }
    public Village getVillage() { return village; }

}
