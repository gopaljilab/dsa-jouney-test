package math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.math.MaxRotateFunction;
import org.junit.jupiter.api.Test;

class MaxRotateFunctionTest {

    @Test
    void testExampleCase() {
        MaxRotateFunction sol = new MaxRotateFunction();
        int[] nums = {4, 3, 2, 6};
        assertEquals(26, sol.maxRotateFunction(nums));
    }

    @Test
    void testSingleElement() {
        MaxRotateFunction sol = new MaxRotateFunction();
        int[] nums = {10};
        assertEquals(0, sol.maxRotateFunction(nums));
    }

    @Test
    void testAllSameElements() {
        MaxRotateFunction sol = new MaxRotateFunction();
        int[] nums = {5, 5, 5, 5};
        assertEquals(30, sol.maxRotateFunction(nums));
    }

    @Test
    void testIncreasingArray() {
        MaxRotateFunction sol = new MaxRotateFunction();
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(40, sol.maxRotateFunction(nums));
    }

    @Test
    void testNegativeNumbers() {
        MaxRotateFunction sol = new MaxRotateFunction();
        int[] nums = {-1, -2, -3, -4};
        assertEquals(-12, sol.maxRotateFunction(nums));
    }

//    @Test
//    void testMixedNumbers() {
//        MaxRotateFunction sol = new MaxRotateFunction();
//        int[] nums = {4, -1, 2, 10};
//        assertEquals(35, sol.maxRotateFunction(nums));
//    }

    @Test
    void testLargeValues() {
        MaxRotateFunction sol = new MaxRotateFunction();
        int[] nums = {100000, 100000, 100000};
        assertEquals(300000, sol.maxRotateFunction(nums));
    }

    @Test
    void testZeros() {
        MaxRotateFunction sol = new MaxRotateFunction();
        int[] nums = {0, 0, 0, 0};
        assertEquals(0, sol.maxRotateFunction(nums));
    }
}