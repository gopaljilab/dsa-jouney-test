package gopaljilab.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombination {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if(digits == null || digits.isEmpty()) return result;

        String[] map = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), map, result);

        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current,
                           String[] map, List<String> result){

        if(index == digits.length()){
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for(char c : letters.toCharArray()){
            current.append(c);
            backtrack(digits, index + 1, current, map, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}




/** public List<String> letterCombinations(String digits) {
    List<String> set = new ArrayList<>(Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));
    List<String> result = new ArrayList<>();

    if(digits.isEmpty()) return result;

    result.add(""); // start with empty combination

    for(int i = 0; i < digits.length(); i++){
        int index = digits.charAt(i) - '0';
        List<String> temp = new ArrayList<>();

        for(String prev : result){
            for(int j = 0; j < set.get(index).length(); j++){
                temp.add(prev + set.get(index).charAt(j));
            }
        }

        result = temp;
    }

    return result;
}**/
