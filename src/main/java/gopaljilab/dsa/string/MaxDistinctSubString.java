package gopaljilab.dsa.string;

public class MaxDistinctSubString {
    public static int maxDistinct(String s) {
        int count = 0;
        StringBuilder subString = new StringBuilder();
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
            subString.append(s.charAt(i));
        }
        return count+1;
    }
}
