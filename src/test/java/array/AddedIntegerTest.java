package array;

import gopaljilab.dsa.array.AddedInteger;

public class AddedIntegerTest {
    public static void main(String[] args) {

        AddedInteger ai = new AddedInteger();

        assert ai.addedInteger(
                new int[]{2, 6, 4},
                new int[]{1, 5, 3}
        ) == 1 : "Failed basic test";

        assert ai.addedInteger(
                new int[]{10, 12, 14},
                new int[]{5, 7, 9}
        ) == 5 : "Failed positive difference";

        assert ai.addedInteger(
                new int[]{-1, 0, 1},
                new int[]{-3, -2, -1}
        ) == 2 : "Failed negative numbers";

        assert ai.addedInteger(
                new int[]{5},
                new int[]{2}
        ) == 3 : "Failed single element";

        assert ai.addedInteger(
                new int[]{100, 200, 300},
                new int[]{90, 190, 290}
        ) == 10 : "Failed large values";

        System.out.println("✅ All AddedInteger test cases passed!");
    }
}
