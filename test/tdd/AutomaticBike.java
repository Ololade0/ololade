package tdd;

import org.junit.jupiter.api.Test;

public class AutomaticBike{
    @Test
    public void automaticBikeTest(){
        AutomaticBike ololadeAutomaticBike = new AutomaticBike();
        ololadeAutomaticBike.setOn(true);
        assertEquals(true, ololadeAutomaticBike.getPowerOn());


    }

    private void setOn(boolean b) {
    }


}
}