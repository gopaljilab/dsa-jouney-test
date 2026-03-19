package string;

import gopaljilab.dsa.string.MostFreqVowAndCons;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MostFreqVowAndConsTest {

    @Test
    void testNormalCase() {
        String input = "successes";
        int result = MostFreqVowAndCons.maxFreqSum(input);
        assertEquals(6, result);
        // Explanation:
        // s = 4 times (consonant max)
        // e = 2 times (vowel max)
        // total = 4 + 2 = 6 → Wait! Let's verify carefully
    }

    @Test
    void testOnlyVowels() {
        String input = "aeiouae";
        int result = MostFreqVowAndCons.maxFreqSum(input);
        assertEquals(2, result);
        // 'a' appears 2 times? Actually:
        // a=2, e=2 → max vowel = 2, consonant = 0 → total = 2
    }

    @Test
    void testOnlyConsonants() {
        String input = "bcdfggh";
        int result = MostFreqVowAndCons.maxFreqSum(input);
        assertEquals(2, result);
        // g appears 2 times
    }

    @Test
    void testMixedCase() {
        String input = "aabbccddeeiou";
        int result = MostFreqVowAndCons.maxFreqSum(input);
        assertEquals(4, result);
        // vowels: a=2,e=2,i=1,o=1,u=1 → max=2
        // consonants: b=2,c=2,d=2 → max=2
        // total = 2+2=4
    }

    @Test
    void testEmptyString() {
        String input = "";
        int result = MostFreqVowAndCons.maxFreqSum(input);
        assertEquals(0, result);
    }

    @Test
    void testSingleCharacterVowel() {
        String input = "a";
        int result = MostFreqVowAndCons.maxFreqSum(input);
        assertEquals(1, result);
    }

    @Test
    void testSingleCharacterConsonant() {
        String input = "z";
        int result = MostFreqVowAndCons.maxFreqSum(input);
        assertEquals(1, result);
    }
}