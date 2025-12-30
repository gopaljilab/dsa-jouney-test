package gopaljilab.dsa.math;

public class MirrorDistance {
    public static int mirrorDistance(int n) {
        int rev = 0;
        int number = n;
        while(number>0){
            int digit = number % 10;
            rev = (rev*10) + digit;
            number /= 10;
        }
        return Math.abs(n-rev);
    }
}
