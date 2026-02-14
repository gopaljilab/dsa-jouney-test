package gopaljilab.dsa.array;

public class GoodPairs {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        if (k == 0) return 0;

        int countGood = 0;

        for (int value : nums1) {
            for (int i : nums2) {
                if (i == 0) continue;
                if (value % (i * k) == 0) {
                    countGood++;
                }
            }
        }
        return countGood;
    }
}
