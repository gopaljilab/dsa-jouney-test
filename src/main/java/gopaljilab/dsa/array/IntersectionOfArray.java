package gopaljilab.dsa.array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add nums1 elements to set
        for (int num : nums1) {
            set.add(num);
        }

        // Check nums2 elements
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert Set<Integer> → int[]
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }
}