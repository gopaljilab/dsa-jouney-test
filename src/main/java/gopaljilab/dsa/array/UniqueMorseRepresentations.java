package gopaljilab.dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueMorseRepresentations {
    public static int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1){
            return 1;
        }

        Map<Character, String> morseMap = getCharacterStringMap();

        StringBuffer[] transformWords = new StringBuffer[words.length];

        for (int i = 0; i < words.length; i++) {
            transformWords[i] = new StringBuffer();

            for (int j = 0; j < words[i].length(); j++) {
                String morse = morseMap.get(words[i].charAt(j));
                if (morse != null) {
                    transformWords[i].append(morse);
                }
            }
        }

        Arrays.sort(transformWords, StringBuffer::compareTo);

        int uniqueTransformWords = 1;

        for(int i =1; i<transformWords.length; i++){
            if(transformWords[i].compareTo(transformWords[i - 1]) != 0)
                uniqueTransformWords++;
        }

        return uniqueTransformWords;
    }

    private static Map<Character, String> getCharacterStringMap() {
        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('a', ".-");
        morseMap.put('b', "-...");
        morseMap.put('c', "-.-.");
        morseMap.put('d', "-..");
        morseMap.put('e', ".");
        morseMap.put('f', "..-.");
        morseMap.put('g', "--.");
        morseMap.put('h', "....");
        morseMap.put('i', "..");
        morseMap.put('j', ".---");
        morseMap.put('k', "-.-");
        morseMap.put('l', ".-..");
        morseMap.put('m', "--");
        morseMap.put('n', "-.");
        morseMap.put('o', "---");
        morseMap.put('p', ".--.");
        morseMap.put('q', "--.-");
        morseMap.put('r', ".-.");
        morseMap.put('s', "...");
        morseMap.put('t', "-");
        morseMap.put('u', "..-");
        morseMap.put('v', "...-");
        morseMap.put('w', ".--");
        morseMap.put('x', "-..-");
        morseMap.put('y', "-.--");
        morseMap.put('z', "--..");
        return morseMap;
    }}
