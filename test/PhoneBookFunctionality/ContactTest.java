package PhoneBookFunctionality;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact("Shola", "08109093828");
    }

    @Test
    void ContactNameCanBeTested() {
        assertEquals("Shola", contact.getName());

    }

    @Test
    void ContactTelephoneCanBeTested() {
        assertEquals("08109093828", contact.getPhoneNumber());


    }

    @Test
    void addressCanBeTested(){
        assertEquals("semicolon street", contact.getAddress());
    }

    @Test
    void emailAddressCanBeTested(){
        assertEquals("Shola@gmail.com", contact.getEmailAddress());
        System.out.println("" + contact.getName());
    }




}