package array;

import gopaljilab.dsa.array.MaxProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductTest {
    @Test
    public void BaseCaseTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] nums = {3,4,5,2};
        int expected = 12;
        int actual = maxProduct.maxProduct(nums);
        assertEquals(expected, actual, "Result of nums = {3,4,5,2} should be 12");
    }

    @Test
    public void WhenNumsIsEmptyCaseTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] nums = {};
        int expected = 0;
        int actual = maxProduct.maxProduct(nums);
        assertEquals(expected, actual, "Result of nums = {} should be 0");
    }

    @Test
    public void WhenNumsHaveDuplicateNumbersCaseTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] nums = {1,5,4,5};
        int expected = 16;
        int actual = maxProduct.maxProduct(nums);
        assertEquals(expected, actual, "Result of nums = {1,5,4,5} should be 16");
    }

    @Test
    public void WhenNumsHaveTwoNumbersOnlyCaseTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] nums = {2,5};
        int expected = 4;
        int actual = maxProduct.maxProduct(nums);
        assertEquals(expected, actual, "Result of nums = {2,5} should be 4");
    }
}
