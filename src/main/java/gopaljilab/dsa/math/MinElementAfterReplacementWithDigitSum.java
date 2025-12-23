package gopaljilab.dsa.math;

public class MinElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        int[] sums = new int[nums.length];
        int i = 0;
        for(int num : nums){
            int sum = 0;
            while(num > 0){
                sum = sum + num % 10;
                num = num/10;
            }
            sums[i++] = sum;
        }

        int min = Integer.MAX_VALUE;
        for(int sum : sums){
            if(sum < min){
                min = sum;
            }
        }
        return min;
    }
}
