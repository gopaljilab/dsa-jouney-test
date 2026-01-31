package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.string.ShuffleString;
import org.junit.jupiter.api.Test;

class ShuffleStringTest {

    @Test
    void testBasicShuffle() {
        ShuffleString shuffle = new ShuffleString();
        String s = "code";
        int[] indices = {3, 1, 2, 0};

        String result = shuffle.restoreString(s, indices);

        assertEquals("eodc", result);
    }

    @Test
    void testSingleCharacter() {
        ShuffleString shuffle = new ShuffleString();
        String s = "a";
        int[] indices = {0};

        String result = shuffle.restoreString(s, indices);

        assertEquals("a", result);
    }

    @Test
    void testAlreadyShuffled() {
        ShuffleString shuffle = new ShuffleString();
        String s = "abc";
        int[] indices = {0, 1, 2};

        String result = shuffle.restoreString(s, indices);

        assertEquals("abc", result);
    }

    @Test
    void testReverseShuffle() {
        ShuffleString shuffle = new ShuffleString();
        String s = "abcd";
        int[] indices = {3, 2, 1, 0};

        String result = shuffle.restoreString(s, indices);

        assertEquals("dcba", result);
    }

    @Test
    void testRepeatedCharacters() {
        ShuffleString shuffle = new ShuffleString();
        String s = "aabb";
        int[] indices = {1, 0, 3, 2};

        String result = shuffle.restoreString(s, indices);

        assertEquals("aabb", result);
    }
}
