package gopaljilab.dsa.math;

public class Base7Representation {
    public String convertToBase7(int num) {
        if(num == 0) return "0";

        StringBuilder result = new StringBuilder();

        long n = Math.abs((long) num);
        while(n != 0){
            long rightMostDigit = n % 7;
            result.append(rightMostDigit);
            n /= 7;
        }

        if (num < 0) result.append("-");

        return result.reverse().toString();
    }
}
