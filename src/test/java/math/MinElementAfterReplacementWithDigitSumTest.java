package math;

import gopaljilab.dsa.math.MinElementAfterReplacementWithDigitSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinElementAfterReplacementWithDigitSumTest {
    MinElementAfterReplacementWithDigitSum digitSum = new MinElementAfterReplacementWithDigitSum();

    @Test
    public void BaseCaseTest(){
        int[] nums = {10,12,13,14};
        int expected = 1;
        int actual = digitSum.minElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void WhenAllElementAreSameCaseTest(){
        int[] nums = {17,17,17,17,17,17};
        int expected = 8;
        int actual = digitSum.minElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void WhenNumsElementAndMinElementSameCaseTest(){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int expected = 1;
        int actual = digitSum.minElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void WhenOneElementOnlyCaseTest(){
        int[] nums = {25};
        int expected = 7;
        int actual = digitSum.minElement(nums);
        assertEquals(expected, actual);
    }
}
