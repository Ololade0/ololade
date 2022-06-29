package HospitalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyTestTest {
    BodyTest bloodTest;

    @BeforeEach
    void setUp() {
        bloodTest = new BodyTest("genotype","B+");
    }
    @Test
    void typeOfBloodThatCanBeTested() {
        assertEquals("genotype", bloodTest.getTypeOfBloodTestName());
    }
    @Test
    void testResultCanBeTested(){
        assertEquals("B+", bloodTest.getTestResult());
    }

}