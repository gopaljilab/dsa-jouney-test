package gopaljilab.dsa.string;

public class ArrayStringsAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1Concat = new StringBuilder();
        StringBuilder word2Concat = new StringBuilder();
        for(String word : word1){
            word1Concat.append(word);
        }

        for(String word : word2){
            word2Concat.append(word);
        }

        return word1Concat.toString().contentEquals(word2Concat);
    }
}
