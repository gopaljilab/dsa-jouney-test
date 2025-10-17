import org.DSA.string.ReverseVowels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsTest {
    @Test
    void TestStandardCase(){
        ReverseVowels reverseVowels = new ReverseVowels();
        String string = "IceCreAm";
        String expectedOutput = "AceCreIm";
        String actualOutput = reverseVowels.reverseVowels(string);
        assertEquals(expectedOutput, actualOutput,
                "Reverse Vowels of string for 'IceCreAm' should be 'AceCreIm'");
    }

    @Test
    void TestNullString(){
        ReverseVowels reverseVowels = new ReverseVowels();
        String string = "";
        String expectedOutput = "";
        String actualOutput = reverseVowels.reverseVowels(string);
        assertEquals(expectedOutput, actualOutput,
                "Reverse Vowels of string for '' should be ''");
    }

    @Test
    void TestNoVowelsString(){
        ReverseVowels reverseVowels = new ReverseVowels();
        String string = "fly";
        String expectedOutput = "fly";
        String actualOutput = reverseVowels.reverseVowels(string);
        assertEquals(expectedOutput, actualOutput,
                "Reverse Vowels of string for 'fly' should be 'fly'");
    }

    @Test
    void TestAllVowelsInLowerCase(){
        ReverseVowels solution = new ReverseVowels();
        String string = "leetcode";
        String expected = "leotcede";
        String actual = solution.reverseVowels(string);
        assertEquals(actual, expected,
                "Reverse Vowels of string for 'leetcode' should be 'leotcede'");
    }

    @Test
    void TestAllVowelsInUpperCase(){
        ReverseVowels solution = new ReverseVowels();
        String string = "AErOplAnE";
        String expected = "EArOplEnA";
        String actual = solution.reverseVowels(string);
        assertEquals(actual, expected,
                "Reverse Vowels of string for 'AErOplAnE' should be 'EArOplEnA'");
    }
}
