package string;

import static org.junit.jupiter.api.Assertions.*;

import gopaljilab.dsa.string.DetectCapital;
import org.junit.jupiter.api.Test;

class DetectCapitalTest {

    DetectCapital detectCapital = new DetectCapital();

    @Test
    void testAllUpperCase() {
        boolean result = detectCapital.detectCapitalUse("USA");
        assertTrue(result);
    }

    @Test
    void testAllLowerCase() {
        boolean result = detectCapital.detectCapitalUse("leetcode");
        assertTrue(result);
    }

    @Test
    void testFirstLetterUpperCase() {
        boolean result = detectCapital.detectCapitalUse("Google");
        assertTrue(result);
    }

    @Test
    void testInvalidCapitalization() {
        boolean result = detectCapital.detectCapitalUse("FlaG");
        assertFalse(result);
    }

    @Test
    void testSingleLowerCaseLetter() {
        boolean result = detectCapital.detectCapitalUse("a");
        assertTrue(result);
    }

    @Test
    void testSingleUpperCaseLetter() {
        boolean result = detectCapital.detectCapitalUse("A");
        assertTrue(result);
    }

    @Test
    void testTwoLettersInvalid() {
        boolean result = detectCapital.detectCapitalUse("aA");
        assertFalse(result);
    }

    @Test
    void testTwoLettersValid() {
        boolean result = detectCapital.detectCapitalUse("Aa");
        assertTrue(result);
    }
}