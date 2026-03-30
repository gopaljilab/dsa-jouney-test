package string;

import gopaljilab.dsa.string.PhoneLetterCombination;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneLetterCombinationTest {

    PhoneLetterCombination plc = new PhoneLetterCombination();

    // ✅ Test 1: Basic input
    @Test
    void testBasicInput() {
        List<String> result = plc.letterCombinations("23");

        List<String> expected = Arrays.asList(
                "ad","ae","af",
                "bd","be","bf",
                "cd","ce","cf"
        );

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    // ✅ Test 2: Single digit
    @Test
    void testSingleDigit() {
        List<String> result = plc.letterCombinations("2");

        List<String> expected = Arrays.asList("a", "b", "c");

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    // ✅ Test 3: Empty input
    @Test
    void testEmptyInput() {
        List<String> result = plc.letterCombinations("");

        assertTrue(result.isEmpty());
    }

    // ✅ Test 4: Null input
    @Test
    void testNullInput() {
        List<String> result = plc.letterCombinations(null);

        assertTrue(result.isEmpty());
    }

    // ✅ Test 5: Digit with 4 letters (7 or 9)
    @Test
    void testDigitWithFourLetters() {
        List<String> result = plc.letterCombinations("7");

        List<String> expected = Arrays.asList("p", "q", "r", "s");

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    // ✅ Test 6: Multiple digits
    @Test
    void testMultipleDigits() {
        List<String> result = plc.letterCombinations("79");

        assertEquals(16, result.size()); // 4 * 4
    }

    // ✅ Test 7: Contains 0 or 1 (no mapping)
    @Test
    void testDigitsWithZeroOrOne() {
        List<String> result = plc.letterCombinations("10");

        // Since 0 and 1 map to "", no combinations should form
        assertTrue(result.isEmpty());
    }

    // ✅ Test 8: Order-independent validation
    @Test
    void testOrderIndependence() {
        List<String> result = plc.letterCombinations("23");

        assertTrue(result.contains("ad"));
        assertTrue(result.contains("cf"));
        assertEquals(9, result.size());
    }

    // ✅ Test 9: Larger input
    @Test
    void testLargerInput() {
        List<String> result = plc.letterCombinations("234");

        assertEquals(27, result.size()); // 3 * 3 * 3
    }
}