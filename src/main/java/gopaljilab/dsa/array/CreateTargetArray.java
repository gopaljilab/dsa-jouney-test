package gopaljilab.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]); // shift automatically and add to it's correct place
        }

        System.out.println(list);
        int[] target = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i); // convert the list into array
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        System.out.println("Input : nums = " + Arrays.toString(nums) +
                ", index = " + Arrays.toString(index));
        int[] target = createTargetArray(nums, index);
        System.out.println("Output : " + Arrays.toString(target));
    }
}
