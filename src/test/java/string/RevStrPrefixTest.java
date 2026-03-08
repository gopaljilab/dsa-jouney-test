package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.string.RevStrPrefix;
import org.junit.jupiter.api.Test;

public class RevStrPrefixTest {

    RevStrPrefix obj = new RevStrPrefix();

    @Test
    void testNormalCase() {
        String result = obj.reversePrefix("abcdef", 3);
        assertEquals("cbadef", result);
    }

    @Test
    void testKEqualsOne() {
        String result = obj.reversePrefix("hello", 1);
        assertEquals("hello", result);
    }

    @Test
    void testFullReverse() {
        String result = obj.reversePrefix("abcd", 4);
        assertEquals("dcba", result);
    }

    @Test
    void testSingleCharacter() {
        String result = obj.reversePrefix("a", 1);
        assertEquals("a", result);
    }

    @Test
    void testTwoCharacters() {
        String result = obj.reversePrefix("ab", 2);
        assertEquals("ba", result);
    }

    @Test
    void testMiddlePrefix() {
        String result = obj.reversePrefix("programming", 5);
        assertEquals("gorp ramming".replace(" ", ""), result);
    }
}