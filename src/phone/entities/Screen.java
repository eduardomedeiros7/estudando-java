package phone.entities;

public class Screen {
    private String resolution;
    private int hz;
    private String protectGlass;





    public Screen(String resolution, int hz, String protectGlass){
        this.resolution = resolution;
        this.hz = hz;
        this.protectGlass = protectGlass;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }



    @Override
    public String toString() {
        return "Resolution: " + resolution + "\n"+
                "hz: " + hz + "\n" +
                "Prtect-Glass: " + protectGlass + "\n";
    }
}

