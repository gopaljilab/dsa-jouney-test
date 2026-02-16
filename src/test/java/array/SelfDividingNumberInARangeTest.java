package array;

import gopaljilab.dsa.math.SelfDividingNumberInARange;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelfDividingNumberInARangeTest {
    final SelfDividingNumberInARange selfDividing = new SelfDividingNumberInARange();

    @Test
    public void testBaseCase(){
        int left = 1;
        int right = 22;
        List<Integer> result = selfDividing.
                selfDividingNumbers(left,right);
        List<Integer> expected = new ArrayList<>(Arrays.
                asList(1,2,3,4,5,6,7,8,9,11,12,15,22));
        assertEquals(expected,result);
    }

    @Test
    public void testWhenRangeIsGreaterThan10(){
        int left = 47;
        int right = 85;
        List<Integer> result = selfDividing.
                selfDividingNumbers(left,right);
        List<Integer> expected = new ArrayList<>(Arrays.
                asList(48,55,66,77));
        assertEquals(expected,result);
    }

    @Test
    public void testWhenRangeIsGreaterThan100(){
        int left = 47;
        int right = 151;
        List<Integer> result = selfDividing.
                selfDividingNumbers(left,right);
        List<Integer> expected = new ArrayList<>(Arrays.
                asList(48, 55, 66, 77, 88, 99, 111, 112, 115, 122, 124, 126, 128, 132, 135, 144));
        assertEquals(expected,result);
    }

    @Test
    public void testWhenRangeIsGreaterThan1000() {
        int left = 977;
        int right = 1311;

        List<Integer> result = selfDividing
                .selfDividingNumbers(left, right);

        List<Integer> expected = Arrays.asList(
                999,
                1111, 1112, 1113, 1115, 1116,
                1122, 1124, 1128,
                1131,
                1144,
                1155,
                1164, 1176, 1184, 1197,
                1212, 1222, 1224,
                1236, 1244, 1248,
                1266,
                1288, 1296,
                1311
        );

        assertEquals(expected, result);
    }
}
