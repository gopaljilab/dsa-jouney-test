package array;

import static org.junit.jupiter.api.Assertions.*;

import gopaljilab.dsa.array.RemoveDuplicatesInSortedArray;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class RemoveDuplicatesInSortedArrayTest {

    @Test
    void testNormalCase() {
        int[] nums = {1,1,2};
        int k = RemoveDuplicatesInSortedArray.removeDuplicates(nums);
        assertEquals(2, k);
        assertArrayEquals(new int[]{1,2}, Arrays.copyOf(nums, k));
    }

    @Test
    void testMultipleDuplicates() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = RemoveDuplicatesInSortedArray.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{0,1,2,3,4}, Arrays.copyOf(nums, k));
    }

    @Test
    void testAllSame() {
        int[] nums = {5,5,5,5};
        int k = RemoveDuplicatesInSortedArray.removeDuplicates(nums);
        assertEquals(1, k);
    }

    @Test
    void testSingleElement() {
        int[] nums = {10};
        int k = RemoveDuplicatesInSortedArray.removeDuplicates(nums);
        assertEquals(1, k);
    }
}
