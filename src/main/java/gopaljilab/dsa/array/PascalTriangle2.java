package gopaljilab.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1); //row 0

        for (int i = 1; i <= rowIndex; i++) {
            //update from right to left
            for (int j = result.size()-1; j > 0; j--) {
                result.set(j,result.get(j)+result.get(j-1));
            }
            result.add(1);// last element
        }
        return result;
    }
}
