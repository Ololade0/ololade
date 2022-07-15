package Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    Address address;

    @BeforeEach
    void setUp() {
        address = new Address("Ikeja", "Nigeria", 001, "Sabo yaba", "Lagos");
    }

    @Test
    void cityNameCanBeTested(){
        assertEquals("Ikeja", address.getCityName());
    }

    @Test
    void countryNameCanBeTested(){
        assertEquals("Nigeria", address.getCountryName());
    }

    @Test
    void houseNumberCanBeTested(){
        assertEquals(001, address.getHouseNumber());
    }

    @Test
    void streetCanBeTested(){
        assertEquals("Sabo yaba", address.getStreetName());
    }
    @Test
    void countryStateCanBeTested(){
        assertEquals("Lagos", address.getState());
    }
}