package string;

import gopaljilab.dsa.sorting.ThreeSum;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumTest {

    @Test
    void testThreeSumBasicCase() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = solution.threeSum(nums);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testThreeSumNoTriplets() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {1, 2, -2, -1};

        List<List<Integer>> result = solution.threeSum(nums);

        assertTrue(result.isEmpty());
    }

    @Test
    void testThreeSumAllZeros() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {0, 0, 0, 0};

        List<List<Integer>> result = solution.threeSum(nums);

        List<List<Integer>> expected = List.of(
                Arrays.asList(0, 0, 0)
        );

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testThreeSumEmptyArray() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {};

        List<List<Integer>> result = solution.threeSum(nums);

        assertTrue(result.isEmpty());
    }

    @Test
    void testThreeSumSingleElement() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {1};

        List<List<Integer>> result = solution.threeSum(nums);

        assertTrue(result.isEmpty());
    }
}