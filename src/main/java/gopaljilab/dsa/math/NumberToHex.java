package gopaljilab.dsa.math;

public class NumberToHex {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] map = "0123456789abcdef".toCharArray();
        StringBuilder res = new StringBuilder();

        long n = num;

        // Handle negative numbers
        if (n < 0) {
            n = n + (1L << 32);  // convert to unsigned 32-bit
        }

        while (n > 0) {
            int digit = (int)(n % 16);
            res.append(map[digit]);
            n = n / 16;
        }

        return res.reverse().toString();
    }
}
