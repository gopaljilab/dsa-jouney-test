package gopaljilab.dsa.array;

import java.util.Arrays;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        /*int maxProd = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            int prodOfTwo = 0;
            for(int j=1; j<nums.length; j++){
                if (i==j)
                    continue;
                prodOfTwo = (nums[i]-1)*(nums[j]-1);
                if(prodOfTwo > maxProd)
                    maxProd = prodOfTwo;
            }
        }
        return maxProd;*/
        if (nums.length == 0){ return 0; }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }
}
