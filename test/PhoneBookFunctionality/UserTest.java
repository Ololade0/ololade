package PhoneBookFunctionality;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {
    User user;
    Contact contact1;
    Contact contact2;
    Contact contact3;


    @BeforeEach
    void setUp() {
        user = new User("Ololade", "Demilade");
         contact1 = new Contact("Ololade", "2345");
         contact2 = new Contact("Tosin", "345");
        contact3 = new Contact("Ola", "355");
    }

    @Test
    void testThatUserHasUserName(){
        assertEquals("Ololade", user.getUserName());
       // assertTrue(user.checkPassword());
    }

    @Test
    void testThatUserHasPassWord(){

        assertEquals("Demilade", user.getUserPassword());
    }

    @Test
    void testThatUserCanAddContactToPhoneBook(){
       user.addNewContact(contact1);
       assertNotNull(user.getPhoneBook());

    }

    @Test
    void testThatUserCanDeleteContactFromPhoneBook(){
        user.addNewContact(contact1);
        user.addNewContact(contact2);
        user.addNewContact(contact3);

        user.deleteContact(contact3);

        assertEquals(2,user.getPhoneBook().getSize());
    }

    @Test
    void testThatUserCanGetContactFromPhoneBook(){
        user.addNewContact(contact1);
        user.addNewContact(contact2);
        user.addNewContact(contact3);

       assertEquals("345", user.getPhoneBook().searchContact("Tosin").getPhoneNumber());
       assertEquals("Ola", user.getPhoneBook().searchContact("355").getName());

    }

    @Test
    void userCanSearchContact(){
        user.addNewContact(contact1);
        user.addNewContact(contact2);
        user.addNewContact(contact3);
        assertEquals("355",  user.searchContact("Ola").getPhoneNumber());
    }

    @Test
    void testThatUserCanEditContact(){
        user.addNewContact(contact1);
        user.addNewContact(contact2);
        user.addNewContact(contact3);
       Contact contact = new Contact("Ola", "335");
        user.searchContact("Ola").setEmailAddress("ola@");
        contact2.setAddress("sabo");

        assertEquals("ola@", user.getPhoneBook().getContact(2).getEmailAddress());
        assertEquals("sabo", user.getPhoneBook().getContact(1).getAddress());
    }

    @Test
    void testThatUserCanGetAllContact(){
        user.addNewContact(contact1);
        user.addNewContact(contact2);
        user.addNewContact(contact3);
        assertNotNull(user.getAllContacts());


    }

}