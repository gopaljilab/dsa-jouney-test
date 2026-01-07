package gopaljilab.dsa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        // First row
        triangle.add(Collections.singletonList(1));

        if (numRows == 1) return triangle;

        // Second row
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        triangle.add(secondRow);

        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                int value = prevRow.get(j-1)+prevRow.get(j);
                row.add(value);
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 6;
        System.out.println("Output : " + generate(numRows));
    }
}
