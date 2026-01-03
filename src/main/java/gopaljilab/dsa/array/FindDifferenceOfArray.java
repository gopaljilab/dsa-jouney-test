package gopaljilab.dsa.array;

import java.util.*;

public class FindDifferenceOfArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<List<Integer>> differences = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> differenceList1 = new ArrayList<>();
        List<Integer> differenceList2 = new ArrayList<>();
        for (Integer num : set1){
            if(!(set2.contains(num))){
                differenceList1.add(num);
            }
        }

        for (Integer num : set2){
            if(!(set1.contains(num))){
                differenceList2.add(num);
            }
        }

        differences.add(differenceList1);
        differences.add(differenceList2);
        return differences;
    }
}
