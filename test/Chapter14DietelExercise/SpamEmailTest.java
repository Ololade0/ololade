package Chapter14DietelExercise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class SpamEmailTest {
    private String mail;

    @BeforeEach
    void setUp() {
        mail = """
                Hi Eden, 
                """;
    }

    @AfterEach
    void tearDown() {
    }
}