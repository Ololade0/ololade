package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school;

    @BeforeEach
    void setUp() {

        school = new School("semicolon", "sabo yaba");
    }

    @Test
    void schoolNameCanBeEstablished() {

        assertEquals("semicolon", school.getSchoolName());
    }

    @Test
    void schoolLocation() {
        assertEquals("sabo yaba", school.getSchoolLocation());
    }

    @Test
    void admitStudent() {
        Student student1 = new Student("ololade", "female", 18, 002);
        Student student2 = new Student("Tman", "Male", 30, 003);
        school.admitStudent(student1);
        school.admitStudent(student2);
        assertNotNull(school.getmyStudent());
    }

    @Test
    void getAllStudent() {
        assertNotNull(school.getmyStudent());

    }
    @Test
    void createCourse() {
        Course course1 = new Course("physics", true, 18);
        Course course2 = new Course("biology", true, 19);

        school.createCourse(course1);
        school.createCourse(course2);
        assertNotNull(school.getMyCourse());
    }


    @Test
    void deleteStudent() {
        school.deleteStudent(003);
        assertTrue(school.findStudent(003));

    }
    @Test
    void deleteCourse(){
        school.deleteCourse("Theology");
        assertTrue(school.findCourse("Theology"));
    }

    @Test
    void getACourse() {
        Course course1 = new Course("physics", true, 18);
        Course course2 = new Course("biology", true, 19);
        school.createCourse(course1);
        school.createCourse(course2);
        assertEquals("biology", school.findCourse(""));
    }

    @Test
    void getAllCourse(){
        assertNotNull(school.getMyCourse());
    }
}


