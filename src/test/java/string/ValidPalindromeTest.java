package string;

import gopaljilab.dsa.string.ValidPalindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {

    ValidPalindrome vp = new ValidPalindrome();

    @Test
    void testEmptyString() {
        assertTrue(vp.isPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(vp.isPalindrome("a"));
    }

    @Test
    void testSimplePalindrome() {
        assertTrue(vp.isPalindrome("madam"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(vp.isPalindrome("hello"));
    }

    @Test
    void testWithSpacesAndPunctuation() {
        assertTrue(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testCaseInsensitive() {
        assertTrue(vp.isPalindrome("RaceCar"));
    }

    @Test
    void testNumbersAndLetters() {
        assertTrue(vp.isPalindrome("1a2 2a1"));
    }

    @Test
    void testOnlySpecialCharacters() {
        assertTrue(vp.isPalindrome("!!!"));
    }

    @Test
    void testMixedInvalidPalindrome() {
        assertFalse(vp.isPalindrome("race a car"));
    }

    @Test
    void testLongPalindrome() {
        assertTrue(vp.isPalindrome("Was it a car or a cat I saw"));
    }
}