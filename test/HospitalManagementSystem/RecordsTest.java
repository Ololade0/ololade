package HospitalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordsTest {
    Records record;

    @BeforeEach
    void setUp() {
        record = new Records("General hospital record");
    }

    @Test
    void recordNameCanBeTested() {
        assertEquals("General hospital record", record.getName());
    }

    @Test
    void noOfTestThatCanBeTested(){
        BodyTest test1 = new BodyTest("Typhoid test", "++");
        BodyTest test2 = new BodyTest("Malaria test", "++");
        BodyTest test3 = new BodyTest("Hvs test", "yeast++");
        BodyTest test4 = new BodyTest("Brain test", "blood inside the brain");
        record.addNewTest(test1);
        assertNotNull(record.getAllTest());

    }

    @Test
    void noOfDoctorsThatCanBeTested(){
        Doctor doctor1 = new Doctor("Jumoke", "Female", 25,"Optician","Consultant");
        Doctor doctor2 = new Doctor("iris", "male", 29,"Surgeon","Msc");
        record.addNewDoctor(doctor2);
        assertNotNull(record.getAllDoctors());
    }

    @Test
    void noOfHospitalCanBeTested(){
        Hospital hospital1 = new Hospital("Semicolon hospital", "Sabo yaba");
        Hospital hospital2 = new Hospital("Bariga hospital", "Bariga");
        Hospital hospital3 = new Hospital("Yaba hospital", " yaba");
        record.addNewHospital(hospital3);
        assertNotNull(record.getAllHospital());
    }
}