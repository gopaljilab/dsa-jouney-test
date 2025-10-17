package array;

import gopaljilab.dsa.array.MaxFrequencyElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxFrequencyElementsTest {



    @Test
    public void TestBaseCase(){
        MaxFrequencyElements maxFrequencyElements=
                new MaxFrequencyElements();
        int[] nums = {1,2,2,3,1,4};
        int expectedResult = 4;
        int actualResult =
                maxFrequencyElements.maxFrequencyElements(nums);
        assertEquals(expectedResult, actualResult,
                "MaxFrequencyElements of [1,2,2,3,1,4] should be 4");
    }

    @Test
    public void TestAllElementsHaveSameFrequencyCase(){
        MaxFrequencyElements maxFrequencyElements=
                new MaxFrequencyElements();
        int[] nums = {1,2,3,4,5};
        int expectedResult = 5;
        int actualResult =
                maxFrequencyElements.maxFrequencyElements(nums);
        assertEquals(expectedResult, actualResult,
                "MaxFrequencyElements of [1,2,3,4,5] should be 5");
    }

    @Test
    public void TestNoElementsCase(){
        MaxFrequencyElements maxFrequencyElements=
                new MaxFrequencyElements();
        int[] nums = {};
        int expectedResult = 0;
        int actualResult =
                maxFrequencyElements.maxFrequencyElements(nums);
        assertEquals(expectedResult, actualResult,
                "MaxFrequencyElements of [] should be 0");
    }

    @Test
    public void TestOneElementCase(){
        MaxFrequencyElements maxFrequencyElements=
                new MaxFrequencyElements();
        int[] nums = {5};
        int expectedResult = 1;
        int actualResult =
                maxFrequencyElements.maxFrequencyElements(nums);
        assertEquals(expectedResult, actualResult,
                "MaxFrequencyElements of [5] should be 1");
    }

    @Test
    public void TestAllElementsAreSameCase(){
        MaxFrequencyElements maxFrequencyElements=
                new MaxFrequencyElements();
        int[] nums = {1,1,1,1};
        int expectedResult = 4;
        int actualResult =
                maxFrequencyElements.maxFrequencyElements(nums);
        assertEquals(expectedResult, actualResult,
                "MaxFrequencyElements of [1,1,1,1] should be 4");
    }
}
