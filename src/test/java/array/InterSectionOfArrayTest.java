package array;

import static org.junit.jupiter.api.Assertions.*;

import gopaljilab.dsa.array.IntersectionOfArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InterSectionOfArrayTest {

    @Test
    void testNormalIntersection() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = IntersectionOfArray.intersection(nums1, nums2);

        assertEquals(1, result.length);
        assertEquals(2, result[0]);
    }

    @Test
    void testNoIntersection() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        int[] result = IntersectionOfArray.intersection(nums1, nums2);

        assertEquals(0, result.length);
    }

    @Test
    void testMultipleCommonElements() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = IntersectionOfArray.intersection(nums1, nums2);

        // Order doesn't matter → sort before asserting
        Arrays.sort(result);

        assertArrayEquals(new int[]{4, 9}, result);
    }

    @Test
    void testOneArrayEmpty() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};

        int[] result = IntersectionOfArray.intersection(nums1, nums2);

        assertEquals(0, result.length);
    }

    @Test
    void testBothArraysEmpty() {
        int[] nums1 = {};
        int[] nums2 = {};

        int[] result = IntersectionOfArray.intersection(nums1, nums2);

        assertEquals(0, result.length);
    }

    @Test
    void testSingleElementIntersection() {
        int[] nums1 = {7};
        int[] nums2 = {7};

        int[] result = IntersectionOfArray.intersection(nums1, nums2);

        assertArrayEquals(new int[]{7}, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums1 = {-1, -2, -3};
        int[] nums2 = {-3, -4, -5};

        int[] result = IntersectionOfArray.intersection(nums1, nums2);

        assertArrayEquals(new int[]{-3}, result);
    }
}