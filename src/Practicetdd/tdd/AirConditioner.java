package tdd;

public class AirConditioner {

    public void setOn(boolean switchOn) {
        powerOn = switchOn;

    }
    private boolean powerOn;
    public boolean getPowerOn() {
        return powerOn;
    }

    public void increaseTemperature(boolean temp) {
        on = temp;
    }
    private boolean on;
    public boolean getIncreaseTemperature() {
        return on;

    }

    public void increaseTemperatureBeyond(int fine ) {
        if(fine > 30){
            one = 30;
        }
        if(fine < 16){
            one = 16;
        }


    }
    private int one;

    public int getOnTemperature() {
        return one;
    }



    }


