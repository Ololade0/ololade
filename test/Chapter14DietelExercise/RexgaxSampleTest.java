package Chapter14DietelExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RexgaxSampleTest {
    @Test
    void testThatIsValidPhoneNumber() {
        String phoneNumber = "+2348022234465";
        assertTrue(RexgaxSample.isValidPhoneNumber(phoneNumber));

    }

    @Test
    void testPhoneNumberWithCharactersGreaterThan_15_AreInvalid() {
        String phoneNumber = "+234-90344344678";
        assertFalse(RexgaxSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithCharactersLessThan_15_AreInvalid() {
        String phoneNumber = "+234-90344344";
        assertFalse(RexgaxSample.isValidPhoneNumber(phoneNumber));

    }

    @Test
    void testPhoneNumberWithOtherCountryPrefixAreInvalid() {
        String phoneNumber = "+233-90344344";
        assertFalse(RexgaxSample.isValidPhoneNumber(phoneNumber));
    }
    @Test
    void testPhoneNumberWithZeroAfterDashIsInvalid() {
        String phoneNumber = "+233-09034434444";
        assertFalse(RexgaxSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithOutPrefixIsInvalid() {
        String phoneNumber = "090344344555";
        assertFalse(RexgaxSample.isValidPhoneNumber(phoneNumber));
    }


}
