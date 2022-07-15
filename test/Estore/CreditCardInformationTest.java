package Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardInformationTest {
    CreditCardInformation card;


    @BeforeEach
    void setUp() {
        card = new CreditCardInformation(444, "July", 2022,133, "Ise");
               // "Ise", "Master Card");
    }

    @Test
    void cardCvvCanBeTested() {
        assertEquals(444, card.getCvv());
    }

    @Test
    void cardMonthCanBeTested() {
        assertEquals("July", card.getMonth());
    }

    @Test
    void cardYearCanBeTested() {
        assertEquals(2022, card.getYear());
    }

    @Test
    void cardNumberCanBeTested() {
        assertEquals(133, card.getCardNumber());
    }


    @Test
    void cardNameCanBeTested() {
        assertEquals("Ise", card.getCardName());
    }

//    @Test
//    void cardTypeCanBeTested() {
//        assertSame("Master Card", card.getCardType());
//    }



}