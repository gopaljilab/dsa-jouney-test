package string;

import gopaljilab.dsa.string.ArrayStringsAreEqual;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStringsAreEqualTest {

    @Test
    public void testBasicEqualStrings() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        assertTrue(ArrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testEmptyArrays() {
        String[] word1 = {};
        String[] word2 = {};
        assertTrue(ArrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testOneEmptyOneNonEmpty() {
        String[] word1 = {"abc"};
        String[] word2 = {};
        assertFalse(ArrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testWithSpaces() {
        String[] word1 = {"a ", "b"};
        String[] word2 = {"a", " b"};
        assertTrue(ArrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testDifferentCase() {
        String[] word1 = {"Hello"};
        String[] word2 = {"hello"};
        assertFalse(ArrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testLargeInput() {
        String[] word1 = new String[1000];
        String[] word2 = new String[1000];
        for (int i = 0; i < 1000; i++) {
            word1[i] = "abc";
            word2[i] = "abc";
        }
        assertTrue(ArrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testUnequalLengthButSamePrefix() {
        String[] word1 = {"abc"};
        String[] word2 = {"ab"};
        assertFalse(ArrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }
}
