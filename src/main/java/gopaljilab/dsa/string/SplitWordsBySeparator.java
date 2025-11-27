package gopaljilab.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class SplitWordsBySeparator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int start = 0, end;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == separator) {
                    end = j;
                    if (start != end) {
                        result.add(word.substring(start, end));
                    }
                    start = end + 1;
                }
                if (j == word.length() - 1) {
                    String last = word.substring(start);
                    if (!last.isEmpty()) {
                        result.add(last);
                    }
                }
            }
        }
        return result;
    }
}
