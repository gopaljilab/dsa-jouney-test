package array;

import gopaljilab.dsa.array.FindMatrix;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMatrixTest {

    private final FindMatrix findMatrix = new FindMatrix();

    @Test
    void baseCaseTest() {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};

        List<List<Integer>> result = findMatrix.findMatrix(nums);

        assertEquals(3, result.size());   // max frequency of 1 is 3

        assertTrue(result.get(0).containsAll(List.of(1,2,3,4)));
        assertTrue(result.get(1).containsAll(List.of(1,3)));
        assertTrue(result.get(2).contains(1));
    }

    @Test
    void whenAllElementsAreSame() {
        int[] nums = {5,5,5,5};

        List<List<Integer>> result = findMatrix.findMatrix(nums);

        assertEquals(4, result.size());

        for (List<Integer> row : result) {
            assertEquals(1, row.size());
            assertEquals(5, row.get(0));
        }
    }

    @Test
    void whenAllElementsAreDistinct() {
        int[] nums = {1,2,3,4};

        List<List<Integer>> result = findMatrix.findMatrix(nums);

        assertEquals(1, result.size());
        assertTrue(result.get(0).containsAll(List.of(1,2,3,4)));
    }

    @Test
    void singleElementTest() {
        int[] nums = {10};

        List<List<Integer>> result = findMatrix.findMatrix(nums);

        assertEquals(1, result.size());
        assertEquals(List.of(10), result.get(0));
    }

    @Test
    void emptyArrayTest() {
        int[] nums = {};

        List<List<Integer>> result = findMatrix.findMatrix(nums);

        assertTrue(result.isEmpty());
    }

    @Test
    void mixedNumbersTest() {
        int[] nums = {2,2,1,1,3};

        List<List<Integer>> result = findMatrix.findMatrix(nums);

        assertEquals(2, result.size());

        assertTrue(result.get(0).containsAll(List.of(1,2,3)));
        assertTrue(result.get(1).containsAll(List.of(1,2)));
    }
}
