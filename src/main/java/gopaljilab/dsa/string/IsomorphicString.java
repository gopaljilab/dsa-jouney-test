package gopaljilab.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String string1, String string2){
        if (string1.length() != string2.length()) {
            return false;
        }

        Map<Character, Character> mapString1toString2 = new HashMap<>();

        for (int i = 0; i < string1.length(); i++) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);

            if (mapString1toString2.containsKey(char1)) {
                // If char1 already mapped, check if it maps to the same char2
                if (mapString1toString2.get(char1) != char2) {
                    return false;
                }
            } else {
                // If char1 not mapped yet, ensure char2 isn't already used
                if (mapString1toString2.containsValue(char2)) {
                    return false;
                }
                mapString1toString2.put(char1, char2);
            }
        }
        return true;
    }
}
