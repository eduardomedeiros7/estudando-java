package shinobimanager.enums;

public enum RankNinja {
    GENIN(50.0),
    CHUNIN(150.0),
    JONIN(500.0);


    private final double basePayment;

    RankNinja(double basePayment){
        this.basePayment = basePayment;
    }

    public double getBasePayment(){
        return basePayment;
    }
}
