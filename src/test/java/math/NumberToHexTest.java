package math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.math.NumberToHex;
import org.junit.jupiter.api.Test;

class NumberToHexTest {

    @Test
    void testZero() {
        NumberToHex converter = new NumberToHex();
        assertEquals("0", converter.toHex(0));
    }

    @Test
    void testPositiveNumber() {
        NumberToHex converter = new NumberToHex();
        assertEquals("1a", converter.toHex(26));
    }

    @Test
    void testAnotherPositiveNumber() {
        NumberToHex converter = new NumberToHex();
        assertEquals("ff", converter.toHex(255));
    }

    @Test
    void testLargePositiveNumber() {
        NumberToHex converter = new NumberToHex();
        assertEquals("7fffffff", converter.toHex(Integer.MAX_VALUE));
    }

    @Test
    void testNegativeOne() {
        NumberToHex converter = new NumberToHex();
        assertEquals("ffffffff", converter.toHex(-1));
    }

    @Test
    void testNegativeTwo() {
        NumberToHex converter = new NumberToHex();
        assertEquals("fffffffe", converter.toHex(-2));
    }

    @Test
    void testIntegerMinValue() {
        NumberToHex converter = new NumberToHex();
        assertEquals("80000000", converter.toHex(Integer.MIN_VALUE));
    }

    @Test
    void testRandomNegativeNumber() {
        NumberToHex converter = new NumberToHex();
        assertEquals("fffffc18", converter.toHex(-1000));
    }

    @Test
    void testSixteen() {
        NumberToHex converter = new NumberToHex();
        assertEquals("10", converter.toHex(16));
    }

    @Test
    void testThirtyOne() {
        NumberToHex converter = new NumberToHex();
        assertEquals("1f", converter.toHex(31));
    }
}