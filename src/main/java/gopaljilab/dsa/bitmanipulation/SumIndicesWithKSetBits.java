package gopaljilab.dsa.bitmanipulation;

import java.util.List;

public class SumIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            int count = Integer.bitCount(i); // count bits of index i

            if (count == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
