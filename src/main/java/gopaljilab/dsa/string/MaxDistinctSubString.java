package gopaljilab.dsa.string;

public class MaxDistinctSubString {
    public static int maxDistinct(String s) {
        if(s == null || s.isEmpty()) return 0;

        int count = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i - 1)){
                count++;
            }
        }
        return count;
    }
}
