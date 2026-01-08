package gopaljilab.dsa.array;

public class CountPartitionWithEvenSum {
    public static int countPartitions(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length-1; i++) {
            // for left sub array
            int leftSum = 0;
            for (int j = 0; j < i+1; j++) {
                leftSum += nums[j];
            }
            //for right sub array
            int rightSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (Math.abs(leftSum-rightSum)%2==0){
                count++;
            }
        }
        return count;
    }
}
