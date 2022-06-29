package HospitalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("Lily");
    }

    @Test
    void UserNameCanBeCreated(){
        assertEquals("Lily", user.getName());
    }

    @Test
    void addNewUser(){
        Records record1 = new Records("Precious record");
        Records record2 = new Records("lilys record");
        user.addNewRecord(record1);
        user.addNewRecord(record2);
        assertNotNull(user.getAllRecord());

    }
}