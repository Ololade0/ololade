package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("ololade", "female", 18, 002);
    }

    @Test
    void studentNameCanBeSet() {

        assertEquals("ololade", student.getStudentName());
    }


    @Test
    void studentAge() {
        assertEquals(18, student.getStudentAge());
    }

    @Test
    void gender() {

        assertEquals("female", student.getGender());
    }

    @Test
    void studentId() {

        assertEquals(002, student.getStudentId());
    }


    @Test
    void addCourse() {
        Course newCourse = new Course("Biology", true, 101);
        student.addNewCourse(newCourse);
        assertEquals("Biology",student.getAllSelectCourse(101));
    }

    @Test
     void selectCourse() {

        assertEquals("Theology", student.getselectCourse("Theology"));
    }

    @Test
     void viewCourse() {
//        assertNull(student.getListOfCourse());
        System.out.println(student.toString());
    }

    @Test
    void withdrawCourse(){
        student.withdrawCourse("Theology");
        assertTrue(student.confirmWithdraw("Theology"));
    }
}
