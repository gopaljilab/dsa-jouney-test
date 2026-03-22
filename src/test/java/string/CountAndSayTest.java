package string;

import gopaljilab.dsa.string.CountAndSay;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountAndSayTest {

    CountAndSay obj = new CountAndSay();

    @Test
    void testCase1() {
        assertEquals("1", obj.countAndSay(1));
    }

    @Test
    void testCase2() {
        assertEquals("11", obj.countAndSay(2));
    }

    @Test
    void testCase3() {
        assertEquals("21", obj.countAndSay(3));
    }

    @Test
    void testCase4() {
        assertEquals("1211", obj.countAndSay(4));
    }

    @Test
    void testCase5() {
        assertEquals("111221", obj.countAndSay(5));
    }

    @Test
    void testCase6() {
        assertEquals("312211", obj.countAndSay(6));
    }


    @Test
    void testEdgeCaseZero() {
        // Optional: depends on how you want to handle invalid input
        assertThrows(Exception.class, () -> obj.countAndSay(0));
    }

    @Test
    void testLargerInput() {
        assertEquals("13112221", obj.countAndSay(7));
    }
}