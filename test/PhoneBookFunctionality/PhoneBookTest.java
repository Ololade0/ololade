package PhoneBookFunctionality;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook;
    Contact contact1;
    Contact contact2;
    Contact contact3;
    Contact contact4;
    Contact contact5;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
        contact1 = new Contact("Ola", "09131807593");
        contact2 = new Contact("Olol", "091007593");
        contact3 = new Contact("Jummy", "091007593");
        contact4 = new Contact("Jummy", "091007593");
        contact5 = new Contact("Jummy", "091007593");
    }

    @Test
    void PhoneBookIsEmpty() {
        assertTrue(phoneBook.isEmpty());
    }

    @Test
    void phoneBookIsNotEmpty() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        assertFalse(phoneBook.isEmpty());
    }

    @Test
    void phoneBookSizeCanBeTested() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        assertEquals(5, phoneBook.getSize());
    }


    @Test
    void deleteContactCanBeTested() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        phoneBook.deleteContact(contact2);
        assertEquals(4, phoneBook.getSize());


    }

    @Test
    void getContactCanBeTested() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        assertNotNull(phoneBook.getContact(2));

    }

    @Test
    void getAllContactCanBeTested() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        assertNotNull(phoneBook.getAllContact());

    }

    @Test
    void EditContactCanBeTested() {
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
       Contact contact = phoneBook.getContact(3);
        contact.setName("Ire");
        assertEquals("Ire", contact.getName());


    }

    @Test
    void searchContactCanBeTested(){
        phoneBook.addNewContact(contact1);
        phoneBook.addNewContact(contact2);
        phoneBook.addNewContact(contact3);
        phoneBook.addNewContact(contact4);
        phoneBook.addNewContact(contact5);
        assertEquals("09131807593",  phoneBook.searchContact("Ola").getPhoneNumber());
        assertEquals("Ola", phoneBook.searchContact("09131807593").getName());

    }



}



