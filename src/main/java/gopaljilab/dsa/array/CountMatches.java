package gopaljilab.dsa.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);

        int index = map.get(ruleKey);

        for (List<String> itemInItems : items) {
            if (itemInItems.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
