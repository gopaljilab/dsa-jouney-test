package string;

import gopaljilab.dsa.string.FirstOccInAString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstOccInAStringTest {
    @Test
    public void TestEmptyNeedle(){
        FirstOccInAString solution = new FirstOccInAString();
        String haystack = "";
        String needle = "";
        int expected = 0;
        int actual = solution.strStr(haystack, needle);
        assertEquals(expected, actual, "The Result of this should be 0");
    }

    @Test
    public void TestNeedleLongerThanHaystack(){
        FirstOccInAString solution = new FirstOccInAString();
        String haystack = "abc";
        String needle = "abcd";
        int expected = -1;
        int actual = solution.strStr(haystack, needle);
        assertEquals(expected, actual, "The Result of this should be -1 (no possible match)");
    }

    @Test
    public void TestFullMatch(){
        FirstOccInAString solution = new FirstOccInAString();
        String haystack = "hello";
        String needle = "hello";
        int expected = 0;
        int actual = solution.strStr(haystack, needle);
        assertEquals(expected, actual, "The Result of this should be 0 (entire haystack matches needle)");
    }

    @Test
    public void TestNeedleAtTheStart(){
        FirstOccInAString solution = new FirstOccInAString();
        String haystack = "apple";
        String needle = "app";
        int expected = 0;
        int actual = solution.strStr(haystack, needle);
        assertEquals(expected, actual, "The Result of this should be 0 (needle starts at index 0)");
    }

    @Test
    public void TestNeedleAtTheEnd(){
        FirstOccInAString solution = new FirstOccInAString();
        String haystack = "banana";
        String needle = "ana";
        int expected = 3;
        int actual = solution.strStr(haystack, needle);
        assertEquals(expected, actual,
                "The Result of this should be 3 " +
                        "(needle starts at index 3: \"ana\" in \"banana\" " +
                        "is at positions 3-5)");
    }

    @Test
    public void TestNoMatchInLongerHaystack(){
        FirstOccInAString solution = new FirstOccInAString();
        String haystack = "abc123";
        String needle = "1234";
        int expected = -1;
        int actual = solution.strStr(haystack, needle);
        assertEquals(expected, actual,
                "The Result of this should be -1 " +
                        "(last 3 characters of haystack are 123, " +
                        "but needle is 1234)");
    }

}
