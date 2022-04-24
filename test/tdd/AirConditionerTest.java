package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirConditionerTest {
    @Test
    public void AirConditionerTest() {
        AirConditioner ololadeAirConditioner = new AirConditioner();

        ololadeAirConditioner.setOn(true);
        assertEquals(true, ololadeAirConditioner.getPowerOn());
    }

    @Test
    public void  AirConditionerIsOffTest() {
        AirConditioner ololadeAirConditioner = new AirConditioner();

        ololadeAirConditioner.setOn(false);
        assertEquals(false, ololadeAirConditioner.getPowerOn());
    }

    @Test
    public void airConditionerIncreaseTemperature(){
        AirConditioner lolaAirconditioner = new AirConditioner();
        lolaAirconditioner.increaseTemperature(true);
        assertEquals(true, lolaAirconditioner.getIncreaseTemperature());

    }

    @Test
    public void airConditionerDecreaseTemperature(){
        AirConditioner lolaAirconditioner = new AirConditioner();
        lolaAirconditioner.increaseTemperature(false);
        assertEquals(false, lolaAirconditioner.getIncreaseTemperature());

    }
    @Test
    public void airConditionIncreaseTemperatureBeyond30() {
        AirConditioner demiAirConditioner = new AirConditioner();
        demiAirConditioner.increaseTemperatureBeyond(48);
        assertEquals( 30, demiAirConditioner.getOnTemperature());
    }

    @Test
    public void airConditionDecreaseTemperatureBeyond30() {
        AirConditioner demiAirConditioner = new AirConditioner();
        demiAirConditioner.increaseTemperatureBeyond(15);
        assertEquals( 16, demiAirConditioner.getOnTemperature());
    }


}

