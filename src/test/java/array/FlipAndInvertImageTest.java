package array;

import gopaljilab.dsa.array.FlipAndInvertImage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FlipAndInvertImageTest {

    private final FlipAndInvertImage service = new FlipAndInvertImage();

    @Test
    void baseCaseTest() {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] expected = {
                {1,0,0},
                {0,1,0},
                {1,1,1}
        };

        int[][] actual = service.flipAndInvertImage(image);

        assertArrayEquals(expected, actual);
    }

    @Test
    void singleRowTest() {
        int[][] image = {
                {1,0,0,1}
        };

        int[][] expected = {
                {0,1,1,0}
        };

        assertArrayEquals(expected, service.flipAndInvertImage(image));
    }

    @Test
    void singleColumnTest() {
        int[][] image = {
                {1},
                {0},
                {1}
        };

        int[][] expected = {
                {0},
                {1},
                {0}
        };

        assertArrayEquals(expected, service.flipAndInvertImage(image));
    }

    @Test
    void allZerosTest() {
        int[][] image = {
                {0,0},
                {0,0}
        };

        int[][] expected = {
                {1,1},
                {1,1}
        };

        assertArrayEquals(expected, service.flipAndInvertImage(image));
    }

    @Test
    void allOnesTest() {
        int[][] image = {
                {1,1,1},
                {1,1,1}
        };

        int[][] expected = {
                {0,0,0},
                {0,0,0}
        };

        assertArrayEquals(expected, service.flipAndInvertImage(image));
    }

    @Test
    void singleElementTest() {
        int[][] image = {
                {1}
        };

        int[][] expected = {
                {0}
        };

        assertArrayEquals(expected, service.flipAndInvertImage(image));
    }

    @Test
    void rectangularMatrixTest() {
        int[][] image = {
                {1,0,1},
                {0,1,0}
        };

        int[][] expected = {
                {0,1,0},
                {1,0,1}
        };

        assertArrayEquals(expected, service.flipAndInvertImage(image));
    }
}
