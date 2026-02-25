package sorting;

import gopaljilab.dsa.sorting.FindRelativeRanks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class FindRelativeRanksTest {
    final FindRelativeRanks findRelativeRanks = new FindRelativeRanks();

    @Test
    public void BaseCaseTest(){
        int[] scores = {5,4,3,2,1};
        String[] result = findRelativeRanks.findRelativeRanks(scores);
        String[] expected = {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void RandomOrderTest(){
        int[] scores = {10, 3, 8, 9, 4};
        String[] expected = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(expected, findRelativeRanks.findRelativeRanks(scores));
    }

    @Test
    public void SingleElementTest(){
        int[] scores = {100};
        String[] expected = {"Gold Medal"};
        assertArrayEquals(expected, findRelativeRanks.findRelativeRanks(scores));
    }

    @Test
    public void TwoElementsTest(){
        int[] scores = {20, 10};
        String[] expected = {"Gold Medal", "Silver Medal"};
        assertArrayEquals(expected, findRelativeRanks.findRelativeRanks(scores));
    }

    @Test
    public void AlreadySortedAscendingTest(){
        int[] scores = {1,2,3,4,5};
        String[] expected = {"5","4","Bronze Medal","Silver Medal","Gold Medal"};
        assertArrayEquals(expected, findRelativeRanks.findRelativeRanks(scores));
    }

    @Test
    public void LargeValuesTest(){
        int[] scores = {1000000, 500000, 100};
        String[] expected = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        assertArrayEquals(expected, findRelativeRanks.findRelativeRanks(scores));
    }



}
