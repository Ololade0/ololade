package SchoolManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        course = new Course("Theology",true,101);

    }

    @Test

    void courseNameIsSet(){
        assertEquals("Theology",course.getCourseName());
    }

    @Test

    void courseCanBeActivated(){
        assertTrue(course.getCourseStatus());
    }


    @Test
    void setCourseId(){
        assertEquals(101, course.getCourseId());
    }



}