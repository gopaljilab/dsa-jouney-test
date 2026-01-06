package array;

import gopaljilab.dsa.array.GroupThePeople;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class GroupThePeopleTest {

    @Test
    void testBasicExample() {
        int[] groupSizes = {3,3,3,3,3,1,3};
        List<List<Integer>> result = GroupThePeople.groupThePeople(groupSizes);

        assertEquals(3, result.size());

        for (List<Integer> group : result) {
            int expectedSize = groupSizes[group.getFirst()];
            assertEquals(expectedSize, group.size());
            for (int idx : group) {
                assertEquals(expectedSize, groupSizes[idx]);
            }
        }
    }

    @Test
    void testAllGroupSizeOne() {
        int[] groupSizes = {1,1,1,1};
        List<List<Integer>> result = GroupThePeople.groupThePeople(groupSizes);

        assertEquals(4, result.size());
        for (List<Integer> group : result) {
            assertEquals(1, group.size());
        }
    }

    @Test
    void testAllSameGroupSize() {
        int[] groupSizes = {2,2,2,2};
        List<List<Integer>> result = GroupThePeople.groupThePeople(groupSizes);

        assertEquals(2, result.size());
        for (List<Integer> group : result) {
            assertEquals(2, group.size());
        }
    }

    @Test
    void testMixedGroupSizes() {
        int[] groupSizes = {2,1,3,3,3,2};
        List<List<Integer>> result = GroupThePeople.groupThePeople(groupSizes);

        for (List<Integer> group : result) {
            int expectedSize = groupSizes[group.get(0)];
            assertEquals(expectedSize, group.size());
        }
    }

    @Test
    void testSingleElement() {
        int[] groupSizes = {1};
        List<List<Integer>> result = GroupThePeople.groupThePeople(groupSizes);

        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(0, result.get(0).get(0));
    }

    @Test
    void testEmptyInput() {
        int[] groupSizes = {};
        List<List<Integer>> result = GroupThePeople.groupThePeople(groupSizes);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}
