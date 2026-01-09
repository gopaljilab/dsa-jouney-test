package array;

import static org.junit.jupiter.api.Assertions.*;

import gopaljilab.dsa.array.PascalTriangle;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PascalTriangleTest {

    @Test
    void testNumRowsZero() {
        List<List<Integer>> result = PascalTriangle.generate(0);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    void testNumRowsOne() {
        List<List<Integer>> result = PascalTriangle.generate(1);
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        assertEquals(expected, result);
    }

    @Test
    void testNumRowsTwo() {
        List<List<Integer>> result = PascalTriangle.generate(2);
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    void testNumRowsFive() {
        List<List<Integer>> result = PascalTriangle.generate(5);
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    void testNumRowsTen_LastRow() {
        List<List<Integer>> result = PascalTriangle.generate(10);
        List<Integer> lastRow = result.get(9);
        List<Integer> expectedLastRow = Arrays.asList(1, 9, 36, 84, 126, 126, 84, 36, 9, 1);
        assertEquals(expectedLastRow, lastRow);
    }
}
