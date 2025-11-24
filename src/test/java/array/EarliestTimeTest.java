package array;

import gopaljilab.dsa.array.EarliestTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EarliestTimeTest {
    @Test
    public void BaseCaseTest(){
        EarliestTime earliestTime = new EarliestTime();
        int[][] tasks = {{1,6},{2,3}};
        int expected = 5;
        int actual = earliestTime.earliestTime(tasks);
        assertEquals(expected,actual, "Result of [[1,6],[2,3]] should be 5.");
    }

    @Test
    public void WhenAllHaveSameTimeCaseTest(){
        EarliestTime earliestTime = new EarliestTime();
        int[][] tasks = {{100,100},{100,100},{100,100}};
        int expected = 200;
        int actual = earliestTime.earliestTime(tasks);
        assertEquals(expected,actual, "Result of [[100,100],[100,100],[100,100]] should be 200.");
    }

    @Test
    public void WhenNoHaveTimeCaseTest(){
        EarliestTime earliestTime = new EarliestTime();
        int[][] tasks = {{}};
        int expected = 0;
        int actual = earliestTime.earliestTime(tasks);
        assertEquals(expected,actual, "Result of [[]] should be 0.");
    }

    @Test
    public void WhenSingleTaskCaseTest(){
        EarliestTime earliestTime = new EarliestTime();
        int[][] tasks = {{1,4}};
        int expected = 5;
        int actual = earliestTime.earliestTime(tasks);
        assertEquals(expected,actual, "Result of [[1,4]] should be 5.");
    }

    @Test
    public void WhenTwoHaveSameTimeCaseTest(){
        EarliestTime earliestTime = new EarliestTime();
        int[][] tasks = {{1,3},{3,2},{2,2},{4,5}};
        int expected = 4;
        int actual = earliestTime.earliestTime(tasks);
        assertEquals(expected,actual, "Result of [[1,3],[3,2],[2,2],[4,5]] should be 4.");
    }
}
