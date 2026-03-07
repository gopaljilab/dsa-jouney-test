package array;

import static org.junit.jupiter.api.Assertions.*;

import gopaljilab.dsa.array.SetMismatch;
import org.junit.jupiter.api.Test;

class SetMismatchTest {

    @Test
    void testExampleCase() {
        SetMismatch sm = new SetMismatch();
        int[] nums = {1, 2, 2, 4};

        int[] result = sm.findErrorNums(nums);

        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    void testDuplicateAtStart() {
        SetMismatch sm = new SetMismatch();
        int[] nums = {1, 1};

        int[] result = sm.findErrorNums(nums);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testDuplicateInMiddle() {
        SetMismatch sm = new SetMismatch();
        int[] nums = {3, 2, 2};

        int[] result = sm.findErrorNums(nums);

        assertArrayEquals(new int[]{2, 1}, result);
    }

    @Test
    void testDuplicateAtEnd() {
        SetMismatch sm = new SetMismatch();
        int[] nums = {1, 2, 3, 4, 4};

        int[] result = sm.findErrorNums(nums);

        assertArrayEquals(new int[]{4, 5}, result);
    }

    @Test
    void testLargeCase() {
        SetMismatch sm = new SetMismatch();
        int[] nums = {1, 5, 3, 2, 2, 6, 7, 8, 9, 10, 4};

        int[] result = sm.findErrorNums(nums);

        assertArrayEquals(new int[]{2, 11}, result);
    }
}