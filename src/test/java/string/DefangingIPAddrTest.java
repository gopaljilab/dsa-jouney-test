package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.string.DefangingIPAddr;
import org.junit.jupiter.api.Test;

class DefangingIPAddrTest {

    @Test
    void testValidIPv4Address() {
        String input = "192.168.0.1";
        String expected = "192[.]168[.]0[.]1";
        assertEquals(expected, DefangingIPAddr.defangIPAddr(input));
    }

    @Test
    void testAnotherIPv4Address() {
        String input = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        assertEquals(expected, DefangingIPAddr.defangIPAddr(input));
    }

    @Test
    void testAddressWithoutDots() {
        String input = "localhost";
        String expected = "localhost";
        assertEquals(expected, DefangingIPAddr.defangIPAddr(input));
    }

    @Test
    void testOnlyDots() {
        String input = "...";
        String expected = "[.][.][.]";
        assertEquals(expected, DefangingIPAddr.defangIPAddr(input));
    }

    @Test
    void testSingleDot() {
        String input = ".";
        String expected = "[.]";
        assertEquals(expected, DefangingIPAddr.defangIPAddr(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, DefangingIPAddr.defangIPAddr(input));
    }
}
