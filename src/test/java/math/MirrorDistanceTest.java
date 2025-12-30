package math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.math.MirrorDistance;
import org.junit.jupiter.api.Test;

public class MirrorDistanceTest {

    @Test
    void testSimpleNumber() {
        assertEquals(9, MirrorDistance.mirrorDistance(12));
    }

    @Test
    void testPalindrome() {
        assertEquals(0, MirrorDistance.mirrorDistance(121));
    }

    @Test
    void testTrailingZero() {
        assertEquals(99, MirrorDistance.mirrorDistance(120));
    }

    @Test
    void testSingleDigit() {
        assertEquals(0, MirrorDistance.mirrorDistance(7));
    }

    @Test
    void testLargeNumber() {
        assertEquals(530865, MirrorDistance.mirrorDistance(987654));
    }

    @Test
    void testZero() {
        assertEquals(0, MirrorDistance.mirrorDistance(0));
    }

    @Test
    void testRepeatingDigits() {
        assertEquals(999, MirrorDistance.mirrorDistance(1110));
    }
}
