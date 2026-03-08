package gopaljilab.dsa.string;

public class RevStrPrefix {
    public String reversePrefix(String s, int k) {
        String prefix = s.substring(0,k);
        StringBuilder result = new StringBuilder();
        result.append(prefix).reverse();
        for (int i = k; i < s.length(); i++) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
