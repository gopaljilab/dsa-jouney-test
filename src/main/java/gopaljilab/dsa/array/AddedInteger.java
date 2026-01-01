package gopaljilab.dsa.array;

import java.util.Arrays;
public class AddedInteger {
    public int addedInteger(int[] nums1, int[] nums2){
        int x;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        x = nums1[0] - nums2[0];
        return x;
    }
}
