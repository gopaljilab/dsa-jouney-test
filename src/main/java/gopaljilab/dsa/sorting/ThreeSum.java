package gopaljilab.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripletSet = new ArrayList<>();
        // sort array
        sort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            // skip duplicate elements
            if (i > 0 && nums[i - 1] == nums[i]) continue;

            // Initialize Pointers
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {                // Two-Pointer Approach:
                int total = nums[i] + nums[j] + nums[k];

                // Adjust Pointers Based on Total:
                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    tripletSet.add(
                            Arrays.asList(nums[i], nums[j], nums[k]));

                    // Handle Duplicate Triplets:
                    do {
                        j++;
                    } while (nums[j] == nums[j - 1] && j < k);
                }
            }
        }
        return tripletSet;
    }

    public void sort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;

        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }

        System.arraycopy(temp, 0, nums, low, temp.length);
    }
}
