package gopaljilab.dsa.string;

import java.util.HashSet;
import java.util.Set;

public class CheckSentencePangramOrNot {
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
