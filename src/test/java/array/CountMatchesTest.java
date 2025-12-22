package array;

import gopaljilab.dsa.array.CountMatches;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountMatchesTest {
    @Test
    public void CountColorMatchCaseTest(){
        CountMatches matches = new CountMatches();
        List<List<String>> items = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList("phone", "blue", "pixel"),
                        Arrays.asList("computer", "silver", "lenovo"),
                        Arrays.asList("phone", "gold", "iphone")
                )
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        int expected = 1;
        int actual = matches.countMatches(items,ruleKey,ruleValue);
        assertEquals(expected,actual);
    }

    @Test
    public void CountTypeMatchCaseTest(){
        CountMatches matches = new CountMatches();
        List<List<String>> items = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList("phone", "blue", "pixel"),
                        Arrays.asList("computer", "silver", "phone"),
                        Arrays.asList("phone", "gold", "iphone")
                )
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        int expected = 2;
        int actual = matches.countMatches(items,ruleKey,ruleValue);
        assertEquals(expected,actual);
    }

    @Test
    public void CountNameMatchCaseTest(){
        CountMatches matches = new CountMatches();
        List<List<String>> items = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList("phone", "blue", "pixel"),
                        Arrays.asList("computer", "silver", "phone"),
                        Arrays.asList("phone", "gold", "iphone")
                )
        );
        String ruleKey = "name";
        String ruleValue = "iphone";
        int expected = 1;
        int actual = matches.countMatches(items,ruleKey,ruleValue);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenNoMatchCaseHereTest(){
        CountMatches matches = new CountMatches();
        List<List<String>> items = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList("phone", "blue", "pixel"),
                        Arrays.asList("computer", "silver", "phone"),
                        Arrays.asList("phone", "gold", "iphone")
                )
        );
        String ruleKey = "name";
        String ruleValue = "samsung";
        int expected = 0;
        int actual = matches.countMatches(items,ruleKey,ruleValue);
        assertEquals(expected,actual);
    }


}
