package array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import gopaljilab.dsa.array.CountPartitionWithEvenSum;
import org.junit.jupiter.api.Test;

public class CountPartitionWithEvenSumTest {

    @Test
    public void testCases() {
        assertEquals(4, CountPartitionWithEvenSum.countPartitions(new int[]{10,10,3,7,6}));
        assertEquals(3, CountPartitionWithEvenSum.countPartitions(new int[]{2,4,6,8}));
        assertEquals(3, CountPartitionWithEvenSum.countPartitions(new int[]{1,3,5,7}));
        assertEquals(3, CountPartitionWithEvenSum.countPartitions(new int[]{1,2,3,4}));
        assertEquals(0, CountPartitionWithEvenSum.countPartitions(new int[]{5}));
        assertEquals(1, CountPartitionWithEvenSum.countPartitions(new int[]{1,1}));
        assertEquals(3, CountPartitionWithEvenSum.countPartitions(new int[]{0,0,0,0}));
        assertEquals(3, CountPartitionWithEvenSum.countPartitions(new int[]{-2,4,-6,8}));
    }
}
