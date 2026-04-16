package phone.entities;

public class Phone {
    private String name;
    private String color;
    private double price;
    private Screen screen;
    private double mAh;
    private String ipRating;

    public Phone(String name, String color, double price, String resolution, int refreshRate, double mAh, String protectGlass) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.mAh = mAh;


        this.screen = new Screen(resolution, refreshRate, protectGlass  );
    }
    public void setIpRating(String ipRating){
        this.ipRating = ipRating;
    }





    @Override
    public String toString() {
        return "Name: " + name +"\n" +
                "Color: " + color +"\n" +
                "Price: " + String.format("%.2f", price) + "\n" +
                "Screen: " + screen +"\n" +
                "Battery: " + mAh + "\n " +
                "Protection: " + (ipRating != null ? ipRating : "No certified protection");
    }
}

