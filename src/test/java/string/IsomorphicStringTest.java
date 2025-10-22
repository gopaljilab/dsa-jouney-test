package string;

import gopaljilab.dsa.string.IsomorphicString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsomorphicStringTest {
    @Test
    public void testBaseCase(){
        IsomorphicString isomorphicString = new IsomorphicString();
        String string1 = "egg";
        String string2 = "add";
        boolean expected = true;
        boolean actual = isomorphicString.isIsomorphic(string1, string2);
        assertEquals(expected, actual, "the result of string1 = \"egg\", string2 = \"add\" should be true");
    }

    @Test
    public void testLengthsOfStringsAreDifferent(){
        IsomorphicString isomorphicString = new IsomorphicString();
        String string1 = "leetcode";
        String string2 = "journey";
        boolean expected = false;
        boolean actual = isomorphicString.isIsomorphic(string1, string2);
        assertEquals(expected, actual, "the result of string1 = \"leetcode\", string2 = \"journey\" should be true");
    }

    @Test
    public void testBothStringsAreEmpty(){
        IsomorphicString isomorphicString = new IsomorphicString();
        String string1 = "";
        String string2 = "";
        boolean expected = true;
        boolean actual = isomorphicString.isIsomorphic(string1, string2);
        assertEquals(expected, actual, "the result of string1 = \"\", string2 = \"\" should be false");
    }

    @Test
    public void testOneOfStringIsEmpty(){
        IsomorphicString isomorphicString = new IsomorphicString();
        String string1 = "jinking";
        String string2 = "";
        boolean expected = false;
        boolean actual = isomorphicString.isIsomorphic(string1, string2);
        assertEquals(expected, actual, "the result of string1 = \"jinking\", string2 = \"\" should be false");
    }

    @Test
    public void tesCharOfStringIsAlreadyMapped(){
        IsomorphicString isomorphicString = new IsomorphicString();
        String string1 = "foo";
        String string2 = "bar";
        boolean expected = false;
        boolean actual = isomorphicString.isIsomorphic(string1, string2);
        assertEquals(expected, actual, "the result of string1 = \"foo\", string2 = \"bar\" should be false");
    }


}
