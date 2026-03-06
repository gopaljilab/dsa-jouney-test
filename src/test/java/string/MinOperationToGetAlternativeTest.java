package string;

import static org.junit.jupiter.api.Assertions.*;

import gopaljilab.dsa.string.MinOperationToGetAlternative;
import org.junit.jupiter.api.Test;

class MinOperationToGetAlternativeTest {

    MinOperationToGetAlternative solution = new MinOperationToGetAlternative();

    @Test
    void testAlreadyAlternating01() {
        String s = "0101";

        int result = solution.minOperations(s);

        assertEquals(0, result);
    }

    @Test
    void testAlreadyAlternating10() {
        String s = "1010";

        int result = solution.minOperations(s);

        assertEquals(0, result);
    }

    @Test
    void testAllZeros() {
        String s = "0000";

        int result = solution.minOperations(s);

        assertEquals(1, result);
    }

    @Test
    void testAllOnes() {
        String s = "1111";

        int result = solution.minOperations(s);

        assertEquals(1, result);
    }

    @Test
    void testMixedCase() {
        String s = "0011";

        int result = solution.minOperations(s);

        assertEquals(2, result);
    }

    @Test
    void testSingleCharacter() {
        String s = "0";

        int result = solution.minOperations(s);

        assertEquals(0, result);
    }

    @Test
    void testEmptyString() {
        String s = "";

        int result = solution.minOperations(s);

        assertEquals(0, result);
    }

    @Test
    void testAnotherCase() {
        String s = "0100";

        int result = solution.minOperations(s);

        assertEquals(1, result);
    }
}