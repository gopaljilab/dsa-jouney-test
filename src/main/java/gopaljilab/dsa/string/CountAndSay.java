package gopaljilab.dsa.string;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        result.append("1");
        if (n==1) return result.toString();
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }

        for (int i = 2; i <= n; i++) {
            StringBuilder newString = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {

                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    newString.append(count);
                    newString.append(result.charAt(j - 1));
                    count = 1;
                }
            }
            // Add last group
            newString.append(count);
            newString.append(result.charAt(result.length()-1));
            result = newString;
        }
        return result.toString();
    }
}
