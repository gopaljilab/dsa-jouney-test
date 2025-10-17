package gopaljilab.dsa.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String firstString = strs[0];
        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // If any string is too short or the character doesn't match,
                // we've found the end of the common prefix
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return firstString.substring(0, i);
                }
            }
        }
        return firstString;
    }
}
