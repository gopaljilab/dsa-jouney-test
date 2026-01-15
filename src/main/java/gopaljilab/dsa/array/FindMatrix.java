package gopaljilab.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindMatrix {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> distinct = new ArrayList<>();
        HashMap<Integer, Integer> mapNumbers = new HashMap<>();

        distinct.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!distinct.contains(nums[i])){
                distinct.add(nums[i]);
            }
        }
        return matrix;
    }
}
