package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentGradeTest {
    @Test
    public void studentGradeCanBeCreatedTest(){
        StudentGrade loladeGrade = new StudentGrade("Lolade",34.5);
        assertEquals("Lolade",loladeGrade.getName());
    }

    @Test
    public void studentAverageCanBeAddedTest(){
        StudentGrade jummyGrade = new StudentGrade("Jummy",12.5);
        jummyGrade.setAverage(23.5);
        assertEquals(23.5, jummyGrade.getAverage());
    }

    @Test
    public void studentGradeLesserThanZeroCannotBeAddedTest(){
        StudentGrade jummyGrade = new StudentGrade("Jummy",-34);
        jummyGrade.setAverage(-34);
        assertEquals(0, jummyGrade.getAverage());
    }
    @Test
    public void studentGradeGreaterThanHundredCannotBeAddedTest(){
        StudentGrade jummyGrade = new StudentGrade("Jummy",12.678);
        jummyGrade.setAverage(123.5);
        assertEquals(12.678, jummyGrade.getAverage());
    }
}
