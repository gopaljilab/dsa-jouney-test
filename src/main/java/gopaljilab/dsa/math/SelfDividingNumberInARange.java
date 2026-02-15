package gopaljilab.dsa.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumberInARange {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isDiv = true;
            while(num > 0){
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    isDiv = false;
                    break;
                }
                num /= 10;
            }
            if (isDiv)
                result.add(i);
        }
        return result;
    }
}
