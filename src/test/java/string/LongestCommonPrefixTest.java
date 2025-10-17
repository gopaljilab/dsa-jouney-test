import org.DSA.string.LongestCommonPrefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    @Test
    void testStandardCase() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "The common prefix for {\"flower\", \"flow\", \"flight\"} should be \"fl\"");
    }

    @Test
    void testNoCommonPrefix() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"dog", "racecar", "car"};
        String expected = "";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "There is no common prefix, so the result should be \"\"");
    }

    @Test
    void testEmptyArray() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {};
        String expected = "";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "An empty array should return an empty string");
    }

    @Test
    void testNullArray() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = null;
        String expected = "";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "A null array should return an empty string");
    }

    @Test
    void testSingleString() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"a"};
        String expected = "a";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "An array with a single string should return that string");
    }

    @Test
    void testAllStringsAreIdentical() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"test", "test", "test"};
        String expected = "test";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "If all strings are identical, the result is the string itself");
    }

    @Test
    void testCommonPrefixIsShortestString() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"abc", "abcd", "abcde"};
        String expected = "abc";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "The common prefix is the shortest string");
    }

    @Test
    void testLongStringsWithCommonPrefix() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"international", "interstellar", "interchange"};
        String expected = "inter";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "Should find the common prefix among longer strings");
    }

    @Test
    void testEmptyStringsInArray() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"", "a", "b"};
        String expected = "";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "If an empty string exists, the common prefix must be empty");
    }
}
