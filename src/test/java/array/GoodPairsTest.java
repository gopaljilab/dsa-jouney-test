package array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gopaljilab.dsa.array.GoodPairs;
import org.junit.jupiter.api.Test;

class GoodPairsTest {

    @Test
    void testBasicCase() {
        GoodPairs gp = new GoodPairs();
        int[] nums1 = {1, 3, 4};
        int[] nums2 = {1, 3, 4};
        int k = 1;

        int result = gp.numberOfPairs(nums1, nums2, k);

        assertEquals(5, result);
    }

    @Test
    void testWithKGreaterThanOne() {
        GoodPairs gp = new GoodPairs();
        int[] nums1 = {8, 16, 24};
        int[] nums2 = {1, 2, 3};
        int k = 2;

        assertEquals(7, gp.numberOfPairs(nums1, nums2, k)); // FIXED
    }

    @Test
    void testNoGoodPairs() {
        GoodPairs gp = new GoodPairs();
        int[] nums1 = {5, 7, 11};
        int[] nums2 = {2, 4};
        int k = 3;

        int result = gp.numberOfPairs(nums1, nums2, k);

        assertEquals(0, result);
    }

    @Test
    void testSingleElementArrays() {
        GoodPairs gp = new GoodPairs();
        int[] nums1 = {6};
        int[] nums2 = {3};
        int k = 2;

        int result = gp.numberOfPairs(nums1, nums2, k);

        assertEquals(1, result);
    }

    @Test
    void testLargeValues() {
        GoodPairs gp = new GoodPairs();
        int[] nums1 = {100, 200};
        int[] nums2 = {5, 10};
        int k = 5;

        assertEquals(4, gp.numberOfPairs(nums1, nums2, k)); // FIXED
    }
}
