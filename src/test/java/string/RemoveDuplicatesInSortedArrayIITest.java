package string;

import static org.junit.jupiter.api.Assertions.*;

import gopaljilab.dsa.array.RemoveDuplicatesInSortedArrayII;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesInSortedArrayIITest {

    @Test
    void testExample1() {
        int[] nums = {1,1,1,2,2,3};

        int k = RemoveDuplicatesInSortedArrayII.removeDuplicates(nums);

        assertEquals(5, k);
        assertArrayEquals(new int[]{1,1,2,2,3},
                java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void testExample2() {
        int[] nums = {0,0,1,1,1,1,2,3,3};

        int k = RemoveDuplicatesInSortedArrayII.removeDuplicates(nums);

        assertEquals(7, k);
        assertArrayEquals(new int[]{0,0,1,1,2,3,3},
                java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void testNoDuplicates() {
        int[] nums = {1,2,3,4};

        int k = RemoveDuplicatesInSortedArrayII.removeDuplicates(nums);

        assertEquals(4, k);
        assertArrayEquals(new int[]{1,2,3,4},
                java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void testAllSame() {
        int[] nums = {5,5,5,5,5};

        int k = RemoveDuplicatesInSortedArrayII.removeDuplicates(nums);

        assertEquals(2, k);
        assertArrayEquals(new int[]{5,5},
                java.util.Arrays.copyOf(nums, k));
    }
}