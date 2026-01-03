package array;

import gopaljilab.dsa.array.FindDifferenceOfArray;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDifferenceOfArrayTest {
    final private FindDifferenceOfArray differenceOfArray = new FindDifferenceOfArray();

    @Test
    public void BaseCaseTest(){
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1,3));
        expected.add(List.of(4,6));

        List<List<Integer>> actual = differenceOfArray.findDifference(nums1,nums2);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenNoDifferenceCaseTest(){
        int[] nums1 = {5,9,0,1};
        int[] nums2 = {5,9,0,1};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of());
        expected.add(List.of());

        List<List<Integer>> actual = differenceOfArray.findDifference(nums1,nums2);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenAllElementDifferentCaseTest(){
        int[] nums1 = {10,25,64,24};
        int[] nums2 = {20,8,59,39};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(0, new ArrayList<>(List.of(64, 24, 25, 10)));
        expected.add(1,new ArrayList<>(List.of(20, 39, 8, 59)));

        List<List<Integer>> actual = differenceOfArray.findDifference(nums1,nums2);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenBothArrayAreEmptyCaseTest(){
        int[] nums1 = {};
        int[] nums2 = {};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of());
        expected.add(List.of());

        List<List<Integer>> actual = differenceOfArray.findDifference(nums1,nums2);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenFirstArrayEmptyTest(){
        int[] nums1 = {};
        int[] nums2 = {1,2,3};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of());
        expected.add(List.of(1,2,3));

        List<List<Integer>> actual = differenceOfArray.findDifference(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void WhenArraysContainDuplicatesTest(){
        int[] nums1 = {1,2,2,3,3};
        int[] nums2 = {2,4,4};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1,3));
        expected.add(List.of(4));

        List<List<Integer>> actual = differenceOfArray.findDifference(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void LargerInputTest(){
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {2,4,6,8};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1,3,5,7,9));
        expected.add(List.of());

        List<List<Integer>> actual = differenceOfArray.findDifference(nums1, nums2);
        assertEquals(expected, actual);
    }


}
