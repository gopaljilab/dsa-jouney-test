package array;

import gopaljilab.dsa.array.DistributeCandies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistributeCandiesTest {

    @Test
    public void BaseCaseTest(){
        DistributeCandies distributeCandies =
                new DistributeCandies();
        int[] candiesType = {1,1,2,2,3,3};
        int expected = 3;
        int actual = distributeCandies.distributeCandies(candiesType);
        assertEquals(expected,actual,
                "The result of candiesType = [1,1,2,2,3,3] should be 3");
    }

    @Test
    public void WhenOnlyOneTypeOfCandyThereTest(){
        DistributeCandies distributeCandies =
                new DistributeCandies();
        int[] candiesType = {6,6,6,6};
        int expected = 1;
        int actual = distributeCandies.distributeCandies(candiesType);
        assertEquals(expected,actual,
                "The result of candiesType = [6,6,6,6] should be 1");
    }

    @Test
    public void WhenMultipleTypeOfCandyThereTest(){
        DistributeCandies distributeCandies =
                new DistributeCandies();
        int[] candiesType = {2,4,6,7,8,9,23,45};
        int expected = 4;
        int actual = distributeCandies.distributeCandies(candiesType);
        assertEquals(expected,actual,
                "The result of candiesType = [2,4,6,7,8,9,23,45] should be 4");
    }

    @Test
    public void WhenMultipleTypeOfCandyWithGreaterThanOneFrequencyTest(){
        DistributeCandies distributeCandies =
                new DistributeCandies();
        int[] candiesType = {1,1,2,2,3,3,4,4,6,6,7,7};
        int expected = 6;
        int actual = distributeCandies.distributeCandies(candiesType);
        assertEquals(expected,actual,
                "The result of candiesType = [1,1,2,2,3,3,4,4,6,6,7,7] should be 6");
    }

    @Test
    public void WhenOnlyOneHasGreaterThanOneCandyTypeTest(){
        DistributeCandies distributeCandies =
                new DistributeCandies();
        int[] candiesType = {1,1,2,3};
        int expected = 2;
        int actual = distributeCandies.distributeCandies(candiesType);
        assertEquals(expected,actual,
                "The result of candiesType = [1,1,2,3] should be 2");
    }
}
