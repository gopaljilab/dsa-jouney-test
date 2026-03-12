package gopaljilab.dsa.array;

public class RemoveDuplicatesInSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
