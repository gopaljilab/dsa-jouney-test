package gopaljilab.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class MostFreqVowAndCons {

    public static int maxFreqSum(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        

        int vowSum = 0;
        int consSum = 0;

        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowSum = Math.max(vowSum, freq);
            } else {
                consSum = Math.max(consSum, freq);
            }
        }

        return vowSum + consSum;
    }

    public static void main(String[] args) {
        String s = "successes";
        System.out.println("Count : " + maxFreqSum(s));
    }
}