package Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingInformationTest {
    BillingInformation information;

    @BeforeEach
    void setUp() {
        information = new BillingInformation("Jummy", "090","Emily");
    }
    @Test
    void receiverNameCanBeTested(){
        assertEquals("Jummy", information.getName());
    }
    @Test
    void receiverPhoneNumberCanBeTested(){
        assertEquals("090", information.getPhoneNumber());
    }

    @Test
    void receiverAddressCanBeTested(){
        assertEquals("Emily", information.getDeliveryAddress());
    }

//    @Test
//    void creditCardInformationCanBeTested(){
//        assertSame("MasterCard", );
//
//
//
//    }

       // assertNot
}