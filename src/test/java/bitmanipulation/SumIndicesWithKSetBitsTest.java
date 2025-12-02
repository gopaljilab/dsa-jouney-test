package bitmanipulation;

import gopaljilab.dsa.bitmanipulation.SumIndicesWithKSetBits;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumIndicesWithKSetBitsTest {
    @Test
    public void BaseCaseTest(){
        SumIndicesWithKSetBits indicesWithKSetBits = new SumIndicesWithKSetBits();
        List<Integer> nums = new ArrayList<>(Arrays.asList(5,10,1,5,2));
        int k = 1;
        int expected = 13;
        int actual = indicesWithKSetBits.sumIndicesWithKSetBits(nums,k);
        assertEquals(expected, actual, "Result Should be 13 only");
    }

    @Test
    public void WhenNoNumsHaveKSetBitsCaseTest(){
        SumIndicesWithKSetBits indicesWithKSetBits = new SumIndicesWithKSetBits();
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,2,5,7,4));
        int k = 3;
        int expected = 0;
        int actual = indicesWithKSetBits.sumIndicesWithKSetBits(nums,k);
        assertEquals(expected, actual, "Result Should be 0 only");
    }

    @Test
    public void WhenAllIndicesMatchCaseTest(){
        SumIndicesWithKSetBits indicesWithKSetBits = new SumIndicesWithKSetBits();
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,3,6,9));
        int k = 0;
        int expected = 1;
        int actual = indicesWithKSetBits.sumIndicesWithKSetBits(nums,k);
        assertEquals(expected, actual, "Result Should be 1 only");
    }

    @Test
    public void WhenLargeArrayCaseTest(){
        SumIndicesWithKSetBits indicesWithKSetBits = new SumIndicesWithKSetBits();
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 7, 9, 1, 4, 8, 6, 2));
        int k = 2;
        int expected = 15;
        int actual = indicesWithKSetBits.sumIndicesWithKSetBits(nums,k);
        assertEquals(expected, actual, "Result Should be 15 only");
    }

    @Test
    public void WhenLargeKCaseTest(){
        SumIndicesWithKSetBits indicesWithKSetBits = new SumIndicesWithKSetBits();
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
        int k = 3;
        int expected = 80;
        int actual = indicesWithKSetBits.sumIndicesWithKSetBits(nums,k);
        assertEquals(expected, actual, "Result Should be 80 only");
    }

    @Test
    public void WhenArrayHaveSingleElementCaseTest(){
        SumIndicesWithKSetBits indicesWithKSetBits = new SumIndicesWithKSetBits();
        List<Integer> nums = new ArrayList<>(Arrays.asList(7));
        int k = 0;
        int expected = 7;
        int actual = indicesWithKSetBits.sumIndicesWithKSetBits(nums,k);
        assertEquals(expected, actual, "Result Should be 7 only");
    }
}
