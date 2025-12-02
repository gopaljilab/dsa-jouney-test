package array;

import org.junit.jupiter.api.Test;

import static gopaljilab.dsa.array.CreateTargetArray.createTargetArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateTargetArrayTest {
    @Test
    public void BaseCaseTest(){
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        int[] expected ={0,4,1,3,2};
        int[] actual = createTargetArray(nums, index);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void WhenSingleElementCaseTest(){
        int[] nums = {5}, index = {0};
        int[] expected ={5};
        int[] actual = createTargetArray(nums, index);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void WhenNumsElementAlreadyInOrderCaseTest(){
        int[] nums = {0,1,2,3,4}, index = {0,1,2,3,0};
        int[] expected ={4, 0, 1, 2, 3};
        int[] actual = createTargetArray(nums, index);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void WhenNumsHaveDuplicatedValuesCaseTest(){
        int[] nums = {2,2,2}, index = {0,1,1};
        int[] expected ={2,2,2};
        int[] actual = createTargetArray(nums, index);
        assertArrayEquals(expected,actual);
    }

    // Edge Case: index[i] = array.length
    @Test
    public void EdgeCaseTest(){
        int[] nums = {1,2}, index = {0,1};
        int[] expected ={1,2};
        int[] actual = createTargetArray(nums, index);
        assertArrayEquals(expected,actual);
    }
}
