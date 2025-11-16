package string;

import gopaljilab.dsa.string.CountConsistentStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountConsistentStringsTest {
    @Test
    public void BaseCaseTest(){
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int expected = 2;
        int actual = consistentStrings.countConsistentStrings(allowed, words);
        assertEquals(expected,actual,"Total no of consistent strings in the array words should be 2");
    }

    @Test
    public void WhenAllStringsAreConsistentTest(){
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        int expected = 7;
        int actual = consistentStrings.countConsistentStrings(allowed, words);
        assertEquals(expected,actual,"Total no of consistent strings in the array words should be 7");
    }

    @Test
    public void WhenSomeStringsAreConsistentTest(){
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        int expected = 4;
        int actual = consistentStrings.countConsistentStrings(allowed, words);
        assertEquals(expected,actual,"Total no of consistent strings in the array words should be 4");
    }

    @Test
    public void WhenAllowedStringHaveOnlyOneCharTest(){
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        String allowed = "c";
        String[] words = {"ac","b","c","ab","ac","bc","abc"};
        int expected = 1;
        int actual = consistentStrings.countConsistentStrings(allowed, words);
        assertEquals(expected,actual,"Total no of consistent strings in the array words should be 2");
    }

    @Test
    public void WhenNoAllowedCharacterMatchedTest(){
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        String allowed = "f";
        String[] words = {"acd","bd","aaabc","baa","badab","ddd", "dee"};
        int expected = 0;
        int actual = consistentStrings.countConsistentStrings(allowed, words);
        assertEquals(expected,actual,"Total no of consistent strings in the array words should be 0");
    }
}
