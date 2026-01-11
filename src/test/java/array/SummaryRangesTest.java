package array;

import gopaljilab.dsa.array.SummaryRanges;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummaryRangesTest {

    private final SummaryRanges summaryRanges = new SummaryRanges();

    @Test
    void testEmptyArray() {
        int[] nums = {};
        List<String> expected = List.of();

        List<String> actual = summaryRanges.summaryRanges(nums);

        assertEquals(expected, actual);
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        List<String> expected = List.of("5");

        List<String> actual = summaryRanges.summaryRanges(nums);

        assertEquals(expected, actual);
    }

    @Test
    void testAllConsecutiveElements() {
        int[] nums = {1, 2, 3, 4, 5};
        List<String> expected = List.of("1->5");

        List<String> actual = summaryRanges.summaryRanges(nums);

        assertEquals(expected, actual);
    }

    @Test
    void testNoConsecutiveElements() {
        int[] nums = {1, 3, 5, 7};
        List<String> expected = List.of("1", "3", "5", "7");

        List<String> actual = summaryRanges.summaryRanges(nums);

        assertEquals(expected, actual);
    }

    @Test
    void testMixedRanges() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> expected = List.of("0->2", "4->5", "7");

        List<String> actual = summaryRanges.summaryRanges(nums);

        assertEquals(expected, actual);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-3, -2, -1, 1, 2};
        List<String> expected = List.of("-3->-1", "1->2");

        List<String> actual = summaryRanges.summaryRanges(nums);

        assertEquals(expected, actual);
    }

    @Test
    void testLargeNumbers() {
        int[] nums = {1000, 1001, 1002, 5000};
        List<String> expected = List.of("1000->1002", "5000");

        List<String> actual = summaryRanges.summaryRanges(nums);

        assertEquals(expected, actual);
    }
}
