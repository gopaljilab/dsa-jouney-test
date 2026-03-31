package string;

import gopaljilab.dsa.string.MaxDistinctSubString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxDistinctSubStringTest {

    // ✅ Corrected
    @Test
    void testNormalString() {
        assertEquals(4, MaxDistinctSubString.maxDistinct("abac"));
    }

    @Test
    void testAllSame() {
        assertEquals(1, MaxDistinctSubString.maxDistinct("aaaa"));
    }

    @Test
    void testAllDistinct() {
        assertEquals(4, MaxDistinctSubString.maxDistinct("abcd"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, MaxDistinctSubString.maxDistinct("a"));
    }

    @Test
    void testTwoSameCharacters() {
        assertEquals(1, MaxDistinctSubString.maxDistinct("aa"));
    }

    @Test
    void testTwoDifferentCharacters() {
        assertEquals(2, MaxDistinctSubString.maxDistinct("ab"));
    }

    @Test
    void testMixedPattern() {
        assertEquals(4, MaxDistinctSubString.maxDistinct("aabbaabb"));
    }

    // ✅ FIXED: empty string now returns 0
    @Test
    void testEmptyString() {
        assertEquals(0, MaxDistinctSubString.maxDistinct(""));
    }

    // ✅ FIXED: null also returns 0 (no exception)
    @Test
    void testNullInput() {
        assertEquals(0, MaxDistinctSubString.maxDistinct(null));
    }
}