package array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import gopaljilab.dsa.array.RotateArray;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    @Test
    void testBasicRotation() {
        int[] nums = {1,2,3,4,5,6,7};
        int[] expected = {5,6,7,1,2,3,4};

        assertArrayEquals(expected, RotateArray.rotate(nums, 3));
    }

    @Test
    void testRotationByOne() {
        int[] nums = {1,2,3,4};
        int[] expected = {4,1,2,3};

        assertArrayEquals(expected, RotateArray.rotate(nums, 1));
    }

    @Test
    void testRotationByZero() {
        int[] nums = {1,2,3};
        int[] expected = {1,2,3};

        assertArrayEquals(expected, RotateArray.rotate(nums, 0));
    }

    @Test
    void testRotationEqualToLength() {
        int[] nums = {10,20,30,40};
        int[] expected = {10,20,30,40};

        assertArrayEquals(expected, RotateArray.rotate(nums, 4));
    }

    @Test
    void testRotationGreaterThanLength() {
        int[] nums = {1,2,3,4,5};
        int[] expected = {4,5,1,2,3};

        assertArrayEquals(expected, RotateArray.rotate(nums, 7));
    }

    @Test
    void testSingleElementArray() {
        int[] nums = {99};
        int[] expected = {99};

        assertArrayEquals(expected, RotateArray.rotate(nums, 5));
    }
}
