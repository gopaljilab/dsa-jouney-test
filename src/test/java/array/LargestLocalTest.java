package array;

import gopaljilab.dsa.array.LargestLocal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LargestLocalTest {
    LargestLocal largestLocal = new LargestLocal();
    @Test
    public void BaseCaseTest(){
        int[][] grid = {{9,9,8,1},
                        {5,6,2,6},
                        {8,2,6,4},
                        {6,2,2,2}};
        int[][] expected = {{9,9},{8,6}};
        int[][] actual = largestLocal.largestLocal(grid);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void OnlyOneIsBiggerCaseTest(){
        int[][] grid = {{1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,2,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1}};
        int[][] expected = {{2,2,2},{2,2,2},{2,2,2}};
        int[][] actual = largestLocal.largestLocal(grid);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MinimumSizeGridTest(){
        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] expected = {{9}};
        assertArrayEquals(expected, largestLocal.largestLocal(grid));
    }

    @Test
    public void NegativeValuesTest(){
        int[][] grid = {
                {-1,-2,-3},
                {-4,-5,-6},
                {-7,-8,-9}
        };

        int[][] expected = {{-1}};
        assertArrayEquals(expected, largestLocal.largestLocal(grid));
    }


}
