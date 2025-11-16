package math;

import gopaljilab.dsa.math.ClimbingStairsWays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsWaysTest {
    @Test
    public void WhenOnlyOneStairTest(){
        ClimbingStairsWays stairsWays = new ClimbingStairsWays();
        int stairs = 1;
        int expectedWays = 1;
        int actualWays = stairsWays.climbStairs(stairs);
        assertEquals(expectedWays,actualWays, "The Climbing Stairs Ways for this input should be 1");
    }

    @Test
    public void WhenNoStairTest(){
        ClimbingStairsWays stairsWays = new ClimbingStairsWays();
        int stairs = 0;
        int expectedWays = 0;
        int actualWays = stairsWays.climbStairs(stairs);
        assertEquals(expectedWays,actualWays, "The Climbing Stairs Ways for this input should be 0");
    }

    @Test
    public void WhenTwoStairAreThereTest(){
        ClimbingStairsWays stairsWays = new ClimbingStairsWays();
        int stairs = 2;
        int expectedWays = 2;
        int actualWays = stairsWays.climbStairs(stairs);
        assertEquals(expectedWays,actualWays, "The Climbing Stairs Ways for this input should be 2");
    }

    @Test
    public void WhenMoreThanTwoStairAreThereTest(){
        ClimbingStairsWays stairsWays = new ClimbingStairsWays();
        int stairs = 5;
        int expectedWays = 8;
        int actualWays = stairsWays.climbStairs(stairs);
        assertEquals(expectedWays,actualWays, "The Climbing Stairs Ways for this input should be 8");
    }

    @Test
    public void WhenMaxStairAreThereTest(){
        ClimbingStairsWays stairsWays = new ClimbingStairsWays();
        int stairs = 45;
        int expectedWays = 1836311903;
        int actualWays = stairsWays.climbStairs(stairs);
        assertEquals(expectedWays,actualWays, "The Climbing Stairs Ways for this input should be 1836311903");
    }
}
