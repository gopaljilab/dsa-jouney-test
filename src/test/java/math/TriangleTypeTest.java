package math;

import gopaljilab.dsa.math.TriangleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTypeTest {
    @Test
    public void EquilateralTriangleTest(){
        TriangleType checkType = new TriangleType();
        int[] nums = {3,3,3};
        String expected = "equilateral";
        String actual = checkType.triangleType(nums);
        assertEquals(expected,actual,
                "The result of nums = {3,3,3} should be equilateral");
    }

    @Test
    public void ScaleneTriangleTest(){
        TriangleType checkType = new TriangleType();
        int[] nums = {3,4,5};
        String expected = "scalene";
        String actual = checkType.triangleType(nums);
        assertEquals(expected,actual,
                "The result of nums = {3,4,5} should be scalene");
    }

    @Test
    public void IsoscelesTriangleTest(){
        TriangleType checkType = new TriangleType();
        int[] nums = {9,4,9};
        String expected = "isosceles";
        String actual = checkType.triangleType(nums);
        assertEquals(expected,actual,
                "The result of nums = {3,4,5} should be isosceles");
    }

    @Test
    public void NoneOfTypesTriangleTest(){
        TriangleType checkType = new TriangleType();
        int[] nums = {5,3,8};
        String expected = "none";
        String actual = checkType.triangleType(nums);
        assertEquals(expected,actual,
                "The result of nums = {5,3,8} should be none");
    }
}
