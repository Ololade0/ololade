package Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("Ololade", 28, "Ololade@gmail", "Sabo yaba", "Welcome", "090");
    }
    @Test
    void userNameCanBeCreated(){
        assertEquals("Ololade", user.getName());
    }

    @Test
    void userAgeCanBeCreated(){
        assertEquals(28, user.getAge());
    }

    @Test
    void userEmailAddressCanBeCreated(){
        assertEquals("Ololade@gmail", user.getEmailAddress());
    }


    @Test
    void userHomeAddressCanBeCreated(){
        assertEquals("Sabo yaba", user.getHomeAddress());
    }

    @Test
    void userPasswordAddressCanBeCreated(){
        assertEquals("Welcome", user.getPassword());
    }

    @Test
    void userPhoneNumberAddressCanBeCreated(){
        assertEquals("090", user.getPhoneNumber());
    }





}