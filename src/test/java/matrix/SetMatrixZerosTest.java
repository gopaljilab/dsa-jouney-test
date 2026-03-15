package matrix;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import gopaljilab.dsa.matrix.SetMatrixZeros;
import org.junit.jupiter.api.Test;

public class SetMatrixZerosTest {

    @Test
    void testExampleCase() {
        SetMatrixZeros obj = new SetMatrixZeros();

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };

        obj.setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }

    @Test
    void testMultipleZeros() {
        SetMatrixZeros obj = new SetMatrixZeros();

        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 0, 8}
        };

        int[][] expected = {
                {0, 0, 0},
                {0, 0, 5},
                {0, 0, 0}
        };

        obj.setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }

    @Test
    void testNoZero() {
        SetMatrixZeros obj = new SetMatrixZeros();

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int[][] expected = {
                {1, 2},
                {3, 4}
        };

        obj.setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }

    @Test
    void testSingleElementZero() {
        SetMatrixZeros obj = new SetMatrixZeros();

        int[][] matrix = {
                {0}
        };

        int[][] expected = {
                {0}
        };

        obj.setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }

    @Test
    void testSingleElementNonZero() {
        SetMatrixZeros obj = new SetMatrixZeros();

        int[][] matrix = {
                {5}
        };

        int[][] expected = {
                {5}
        };

        obj.setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }
}