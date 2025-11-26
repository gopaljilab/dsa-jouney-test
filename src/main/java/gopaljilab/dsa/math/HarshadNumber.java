package gopaljilab.dsa.math;

public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digitSum = 0;
        int num = x;
        for(int i=0; num>0; i++){
            digitSum += num%10;
            num /= 10;
        }
        if(x%digitSum==0) return digitSum;
        return -1;
    }
}
