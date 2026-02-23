package gopaljilab.dsa.sorting;

public class FindRelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int n = score.length;
        // Create a 2D array to store {score, original_index}
        int[][] scoreWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            scoreWithIndex[i][0] = score[i];
            scoreWithIndex[i][1] = i;
        }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(scoreWithIndex[j][0] < scoreWithIndex[j+1][0]){
                    int[] temp = scoreWithIndex[j];
                    scoreWithIndex[j] = scoreWithIndex[j+1];
                    scoreWithIndex[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int originalIndex = scoreWithIndex[i][1];
            if (i == 0) result[originalIndex] = "Gold Medal";
            else if (i == 1) result[originalIndex] = "Silver Medal";
            else if (i == 2) result[originalIndex] = "Bronze Medal";
            else result[originalIndex] = String.valueOf(i + 1);
        }
        return result;
    }
}
