package HospitalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    Doctor doctor;

    @BeforeEach
    void setUp() {
        doctor = new Doctor("Tman", "Female", 32, "gynaecologist", "Masters Degree");
    }

    @Test
    void doctorsNameCanBeTested() {
        assertEquals("Tman", doctor.getName());
    }

    @Test
    void doctorsGenderCanBeTested() {
        assertEquals("Female", doctor.getGender());
    }

    @Test
    void doctorsAgeCanBeTested() {
        assertEquals(32, doctor.getAge());
    }

    @Test
    void doctorsSpecialty() {
        assertEquals("gynaecologist", doctor.getDoctorsSpecialty());
    }

    @Test
    void doctorsQualificationCanBeTested() {
        assertEquals("Masters Degree", doctor.getDoctorsQualification());

    }

}