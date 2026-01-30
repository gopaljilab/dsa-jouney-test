package array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import gopaljilab.dsa.array.RotateImage;
import org.junit.jupiter.api.Test;

class RotateImageTest {

    @Test
    void testRotate3x3Matrix() {
        RotateImage rotateImage = new RotateImage();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        rotateImage.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void testRotate4x4Matrix() {
        RotateImage rotateImage = new RotateImage();

        int[][] matrix = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] expected = {
                {13,  9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };

        rotateImage.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void testRotateSingleElementMatrix() {
        RotateImage rotateImage = new RotateImage();

        int[][] matrix = {{1}};
        int[][] expected = {{1}};

        rotateImage.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }
}
