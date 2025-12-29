package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.string.PrefixCount;
import org.junit.jupiter.api.Test;

class PrefixCountTest {

    @Test
    void testBasicPrefixMatch() {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        int expected = 2;

        PrefixCount pc = new PrefixCount();
        assertEquals(expected, pc.prefixCount(words, pref));
    }

    @Test
    void testAllWordsMatchPrefix() {
        String[] words = {"apple", "app", "application"};
        String pref = "app";
        int expected = 3;

        PrefixCount pc = new PrefixCount();
        assertEquals(expected, pc.prefixCount(words, pref));
    }

    @Test
    void testNoWordMatchesPrefix() {
        String[] words = {"dog", "cat", "mouse"};
        String pref = "ele";
        int expected = 0;

        PrefixCount pc = new PrefixCount();
        assertEquals(expected, pc.prefixCount(words, pref));
    }

    @Test
    void testEmptyPrefix() {
        String[] words = {"java", "javascript", "spring"};
        String pref = "";
        int expected = 3; // every string starts with ""

        PrefixCount pc = new PrefixCount();
        assertEquals(expected, pc.prefixCount(words, pref));
    }

    @Test
    void testEmptyWordsArray() {
        String[] words = {};
        String pref = "a";
        int expected = 0;

        PrefixCount pc = new PrefixCount();
        assertEquals(expected, pc.prefixCount(words, pref));
    }

    @Test
    void testPrefixLongerThanWord() {
        String[] words = {"hi", "hello"};
        String pref = "helloWorld";
        int expected = 0;

        PrefixCount pc = new PrefixCount();
        assertEquals(expected, pc.prefixCount(words, pref));
    }

    @Test
    void testCaseSensitivity() {
        String[] words = {"Apple", "application", "App"};
        String pref = "App";
        int expected = 2; // "Apple", "App"

        PrefixCount pc = new PrefixCount();
        assertEquals(expected, pc.prefixCount(words, pref));
    }
}
