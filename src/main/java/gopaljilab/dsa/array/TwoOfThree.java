package gopaljilab.dsa.array;

import java.util.*;

public class TwoOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        for (int n : set1)
            map.put(n, map.getOrDefault(n, 0) + 1);

        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) set2.add(n);
        for (int n : set2)
            map.put(n, map.getOrDefault(n, 0) + 1);

        Set<Integer> set3 = new HashSet<>();
        for (int n : nums3) set3.add(n);
        for (int n : set3)
            map.put(n, map.getOrDefault(n, 0) + 1);

        for (int key : map.keySet()){
            if (map.get(key) >= 2){
                result.add(key);
            }
        }
        return result;
    }
}
