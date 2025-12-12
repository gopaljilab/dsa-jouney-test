package array;
import gopaljilab.dsa.array.TwoOfThree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoOutOfThreeTest {
    TwoOfThree twoOfThree = new TwoOfThree();
    @Test
    public void baseCaseTest(){
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        List<Integer> expected = new ArrayList<>(List.of(2,3));
        List<Integer> actual = twoOfThree.twoOutOfThree(nums1,nums2,nums3);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenSameNumberAppearMultipleTimesCaseTest(){
        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};
        List<Integer> expected = new ArrayList<>(List.of());
        List<Integer> actual = twoOfThree.twoOutOfThree(nums1,nums2,nums3);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenOneArrayIsEmptyCaseTest(){
        int[] nums1 = {};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};
        List<Integer> expected = new ArrayList<>(List.of());
        List<Integer> actual = twoOfThree.twoOutOfThree(nums1,nums2,nums3);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenAllNumsHaveDifferentNumbersCaseTest(){
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        int[] nums3 = {7};
        List<Integer> expected = new ArrayList<>(List.of());
        List<Integer> actual = twoOfThree.twoOutOfThree(nums1,nums2,nums3);
        assertEquals(expected,actual);
    }
}
