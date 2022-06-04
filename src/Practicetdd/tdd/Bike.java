package tdd;

public class Bike {

    public int mySpeed;
    private boolean acceleration;

    private boolean speed;

    private boolean on;

    public void switchOn(boolean power) {
        on = power;
    }
    public boolean getPowerOn() {
        return on;
    }

    public boolean getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(boolean acceleration) {
        this.acceleration = true;
    }

    public int mySpeed(int speed){
        int mySpeed = 0;
        if (speed <= 20){mySpeed = speed + 1;

        }
        if (speed <= 26) {
            mySpeed = speed + 2;
        }
        if (speed <= 35) {
            mySpeed = speed + 3;
        }
        if(speed <= 48){
            mySpeed = speed + 4;
        }
        if(speed <= 15){
            mySpeed = speed - 1;
        }

        return mySpeed;

    }
}











