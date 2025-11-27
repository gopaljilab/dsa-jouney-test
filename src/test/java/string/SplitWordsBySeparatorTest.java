package string;

import gopaljilab.dsa.string.SplitWordsBySeparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitWordsBySeparatorTest {
    @Test
    public void BaseCaseTest(){
        SplitWordsBySeparator obj = new SplitWordsBySeparator();
        List<String> words = new ArrayList<>(Arrays.asList("one.two.three","four.five","six"));
        char separator = '.';
        List<String> expected = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        List<String> actual = obj.splitWordsBySeparator(words, separator);
        assertEquals(expected, actual);
    }

    @Test
    public void TestForOtherSeparatorCaseTest(){
        SplitWordsBySeparator obj = new SplitWordsBySeparator();
        List<String> words = new ArrayList<>(Arrays.asList("$easy$","$problem$"));
        char separator = '$';
        List<String> expected = new ArrayList<>(Arrays.asList("easy","problem"));
        List<String> actual = obj.splitWordsBySeparator(words, separator);
        assertEquals(expected, actual);
    }

    @Test
    public void WhenWordsHaveOnlySeparatorCaseTest(){
        SplitWordsBySeparator obj = new SplitWordsBySeparator();
        List<String> words = new ArrayList<>(List.of("|||"));
        char separator = '|';
        List<String> expected = new ArrayList<>(List.of());
        List<String> actual = obj.splitWordsBySeparator(words, separator);
        assertEquals(expected, actual);
    }

    @Test
    public void WhenWordsIsEmptyCaseTest(){
        SplitWordsBySeparator obj = new SplitWordsBySeparator();
        List<String> words = new ArrayList<>(List.of());
        char separator = '!';
        List<String> expected = new ArrayList<>(List.of());
        List<String> actual = obj.splitWordsBySeparator(words, separator);
        assertEquals(expected, actual);
    }
}
