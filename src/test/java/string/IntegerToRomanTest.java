package string;

import gopaljilab.dsa.string.IntegerToRoman;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

    IntegerToRoman converter = new IntegerToRoman();

    @Test
    void testBasicValues() {
        assertEquals("I", converter.intToRoman(1));
        assertEquals("V", converter.intToRoman(5));
        assertEquals("X", converter.intToRoman(10));
    }

    @Test
    void testSubtractiveCases() {
        assertEquals("IV", converter.intToRoman(4));
        assertEquals("IX", converter.intToRoman(9));
        assertEquals("XL", converter.intToRoman(40));
        assertEquals("XC", converter.intToRoman(90));
        assertEquals("CD", converter.intToRoman(400));
        assertEquals("CM", converter.intToRoman(900));
    }

    @Test
    void testTypicalNumbers() {
        assertEquals("III", converter.intToRoman(3));
        assertEquals("LVIII", converter.intToRoman(58)); // L=50, V=5, III=3
        assertEquals("MCMXCIV", converter.intToRoman(1994));
    }

    @Test
    void testEdgeCases() {
        assertEquals("MMMCMXCIX", converter.intToRoman(3999)); // max limit
    }

    @Test
    void testRandomValues() {
        assertEquals("XXVII", converter.intToRoman(27));
        assertEquals("CXXIII", converter.intToRoman(123));
        assertEquals("DCCLXXXIX", converter.intToRoman(789));
    }
}