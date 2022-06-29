package SchoolSystem;

public class Corse {
  //  public int getCourseId;
    // private final String corseName;
    private String corseName;
    private boolean corseActivation;
    private int corseId;


    public Corse(String corseName, boolean corseActivation, int corseId) {
        this.corseName = corseName;
        this.corseActivation = corseActivation;
        this.corseId = corseId;
    }

    public String getCorseName() {
        return corseName;
    }

    public boolean getCorseActivation() {
        return true;
    }


    public boolean getCorseDeActivation() {
        return false;
    }
    public int getCourseId() {
        return corseId;
    }
}
