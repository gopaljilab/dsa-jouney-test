package gopaljilab.dsa.matrix;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        // Top row
        for (int i = 0; i < n; i++) {
            result.add(matrix[0][i]);
        }

        // Right column (excluding first and last rows)
        for (int i = 1; i < m - 1; i++) {
            result.add(matrix[i][n - 1]);
        }

        // Bottom row (if more than one row)
        if (m > 1) {
            for (int i = n - 1; i >= 0; i--) {
                result.add(matrix[m - 1][i]);
            }
        }

        // Left column (excluding first and last rows, if more than one column)
        if (n > 1) {
            for (int i = m - 2; i >= 1; i--) {
                result.add(matrix[i][0]);
            }
        }

        // 🔹 Middle submatrix (if more than 2 rows and 2 columns)
        if (m > 2 && n > 2) {
            int[][] inner = new int[m - 2][n - 2];
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    inner[i - 1][j - 1] = matrix[i][j];
                }
            }
            // Recursively add inner spiral
            result.addAll(spiralOrder(inner));
        }

        return result;
    }
}