package shinobimanager.entities;

public class Mission {
    private String title;
    private Double reward;

    public Mission(String title, Double reward){
        this.title = title;
        this.reward = reward;
    }

    public String getTitle() {
        return title;
    }

    public Double getReward() {
        return reward;
    }
}
