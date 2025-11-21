package array;

import gopaljilab.dsa.array.FinalPriceAfterDiscount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FinalPriceAfterDiscountTest {
    @Test
    public void BaseCaseTest(){
        FinalPriceAfterDiscount afterDiscount = new FinalPriceAfterDiscount();
        int[] prices = {8,4,6,2,3};
        int[] expected = {4,2,4,2,3};
        int[] actual = afterDiscount.finalPrices(prices);
        assertArrayEquals(expected,actual,"The result Should be [4,2,4,2,3]");
    }

    @Test
    public void NotReceivedAnyDiscountCaseTest(){
        FinalPriceAfterDiscount afterDiscount = new FinalPriceAfterDiscount();
        int[] prices = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};
        int[] actual = afterDiscount.finalPrices(prices);
        assertArrayEquals(expected,actual,"The result Should be [1,2,3,4,5]");
    }

    @Test
    public void WhenAllReceivedDiscountsCaseTest(){
        FinalPriceAfterDiscount afterDiscount = new FinalPriceAfterDiscount();
        int[] prices = {9,6,5,4,3,2};
        int[] expected = {3,1,1,1,1,2};
        int[] actual = afterDiscount.finalPrices(prices);
        assertArrayEquals(expected,actual,"The result Should be [3,1,1,1,1,2]");
    }

    @Test
    public void WhenAllPricesAreEqualCaseTest(){
        FinalPriceAfterDiscount afterDiscount = new FinalPriceAfterDiscount();
        int[] prices = {9,9,9,9,9};
        int[] expected = {0,0,0,0,9};
        int[] actual = afterDiscount.finalPrices(prices);
        assertArrayEquals(expected,actual,"The result Should be [0,0,0,0,4]");
    }

    @Test
    public void WhenHaveSinglePriceOnlyTest() {
        FinalPriceAfterDiscount afterDiscount = new FinalPriceAfterDiscount();
        int[] prices = {7};
        int[] expected = {7};
        int[] actual = afterDiscount.finalPrices(prices);
        assertArrayEquals(expected, actual, "The result Should be [7]");
    }

    @Test
    public void WhenPricesContainsZeroCaseTest(){
        FinalPriceAfterDiscount afterDiscount = new FinalPriceAfterDiscount();
        int[] prices = {5,0,3};
        int[] expected = {5,0,3};
        int[] actual = afterDiscount.finalPrices(prices);
        assertArrayEquals(expected,actual,"The result Should be [5,0,3]");
    }

    @Test
    public void WhenDiscountFromImmediateNextCaseTest(){
        FinalPriceAfterDiscount afterDiscount = new FinalPriceAfterDiscount();
        int[] prices = {7,5,3};
        int[] expected = {2,2,3};
        int[] actual = afterDiscount.finalPrices(prices);
        assertArrayEquals(expected,actual,"The result Should be [2,2,3]");
    }
}
