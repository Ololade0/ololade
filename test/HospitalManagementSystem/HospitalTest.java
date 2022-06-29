package HospitalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTest {
    Hospital hospital;

    @BeforeEach
    void setUp() {
        hospital = new Hospital("General hospital", "Sabo yaba");
        BodyTest test2 = new BodyTest("pregnancyTest","positive");
        hospital.addNewTest(test2);
    }

    @Test
    void hospitalNameCanBeCreated(){
        assertEquals("General hospital", hospital.getHospitalName());
    }

    @Test
    void hospitalLocationCanBeTested(){
        assertEquals("Sabo yaba", hospital.getHospitalLocation());
    }
    @Test
    void  noOfDoctorsCanBeTested(){
        Doctor doctor1 = new Doctor("Tman","Male",32,"gynacologist","Masters degree");
        Doctor doctor2 = new Doctor("Ololade", "Female",28, "Surgeon","Bsc");
       Doctor doctor3 = new Doctor("Precious lily","Female",24,"Skin therapist","Bsc");
        hospital.addNewDoctors(doctor1);
        hospital.addNewDoctors(doctor2);
        hospital.addNewDoctors(doctor3);
        assertNotNull(hospital.getMyDoctors());

    }

   @Test
    void noOfTestCanBeTested(){
        BodyTest test1 = new BodyTest("genotype","B+");
        BodyTest test2 = new BodyTest("pregnancyTest","positive");
        hospital.addNewTest(test1);
        hospital.addNewTest(test2);
        assertNotNull(hospital.getAllNoOfTest());
   }
   @Test
    void confirmAllAddedNewTest(){
        assertTrue(hospital.getAddedNewTest("pregnancyTest"));
   }
    }
