package string;

import gopaljilab.dsa.string.ZigZagConv;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZigZagConvTest {

    @Test
    void testExample1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testExample2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testSingleRow() {
        String s = "HELLO";
        int numRows = 1;
        String expected = "HELLO";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testTwoRows() {
        String s = "ABCDEFG";
        int numRows = 2;
        String expected = "ACEGBDF";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testShortString() {
        String s = "AB";
        int numRows = 3;
        String expected = "AB";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testEmptyString() {
        String s = "";
        int numRows = 3;
        String expected = "";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testSingleCharacter() {
        String s = "A";
        int numRows = 5;
        String expected = "A";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testAllSameCharacters() {
        String s = "AAAAAA";
        int numRows = 3;
        String expected = "AAAAAA";

        assertEquals(expected, ZigZagConv.convert(s, numRows));
    }

    @Test
    void testLargeInput() {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numRows = 5;
        String expected = ZigZagConv.convert(s, numRows); // just checking no crash

        assertNotNull(expected);
        assertEquals(s.length(), expected.length());
    }
}