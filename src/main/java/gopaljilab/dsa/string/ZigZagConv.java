package gopaljilab.dsa.string;

public class ZigZagConv {

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for(int i = 0; i < numRows; i++){
            for (int j = i; j < s.length(); j += cycle) {

                result.append(s.charAt(j));

                int diag = j + cycle - 2 * i;

                // ✅ FIX: ensure diag != j (avoid duplicate/invalid cases)
                if (i != 0 && i != numRows - 1 && diag < s.length() && diag != j){
                    result.append(s.charAt(diag));
                }
            }
        }

        return result.toString();
    }
}