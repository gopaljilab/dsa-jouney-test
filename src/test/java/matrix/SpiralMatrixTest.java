package matrix;

import gopaljilab.dsa.matrix.SpiralMatrix;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    SpiralMatrix sm = new SpiralMatrix();

    @Test
    void testSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> expected = Arrays.asList(1,2,3,6,9,8,7,4,5);
        assertEquals(expected, sm.spiralOrder(matrix));
    }

    @Test
    void testRectangularMatrixMoreRows() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}
        };

        List<Integer> expected = Arrays.asList(1,2,3,6,9,12,11,10,7,4,5,8);
        assertEquals(expected, sm.spiralOrder(matrix));
    }

    @Test
    void testRectangularMatrixMoreCols() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        List<Integer> expected = Arrays.asList(1,2,3,4,8,7,6,5);
        assertEquals(expected, sm.spiralOrder(matrix));
    }

    @Test
    void testSingleRow() {
        int[][] matrix = {
                {1, 2, 3, 4}
        };

        List<Integer> expected = Arrays.asList(1,2,3,4);
        assertEquals(expected, sm.spiralOrder(matrix));
    }

    @Test
    void testSingleColumn() {
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4}
        };

        List<Integer> expected = Arrays.asList(1,2,3,4);
        assertEquals(expected, sm.spiralOrder(matrix));
    }

    @Test
    void testSingleElement() {
        int[][] matrix = {
                {1}
        };

        List<Integer> expected = Collections.singletonList(1);
        assertEquals(expected, sm.spiralOrder(matrix));
    }

    @Test
    void testTwoByTwoMatrix() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        List<Integer> expected = Arrays.asList(1,2,4,3);
        assertEquals(expected, sm.spiralOrder(matrix));
    }

    @Test
    void testEmptyInnerLayerCase() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };

        List<Integer> expected = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
        assertEquals(expected, sm.spiralOrder(matrix));
    }
}