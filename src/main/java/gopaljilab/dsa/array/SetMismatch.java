package gopaljilab.dsa.array;

import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] error = new int[2];

        // Find duplicate
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                error[0] = nums[i];
                break;
            }
        }

        int duplicate = error[0];
        int missing = -1;

        //Find missing
        for(int i = 1; i <= nums.length; i++){
            if(i != duplicate &&
                    Arrays.binarySearch(nums, i) < 0){
                missing = i;
                break;
            }
        }

        //Add missing to the list
        error[1] = missing;
        return error;
    }
}
