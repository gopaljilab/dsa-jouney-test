package string;

import gopaljilab.dsa.string.FirstPalindromeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstPalindromeStringTest {
    FirstPalindromeString palindromeString = new FirstPalindromeString();

    @Test
    public void baseCaseTest(){
        String[] words = {"notapalindrome","racecar"};
        String expected = "racecar";
        String actual = palindromeString.firstPalindrome(words);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenNoPalindromeFoundCaseTest(){
        String[] words = {"def","ghi"};
        String expected = "";
        String actual = palindromeString.firstPalindrome(words);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenTwoOrMorePalindromeFoundCaseTest(){
        String[] words = {"abc","car","ada","racecar","cool"};
        String expected = "ada";
        String actual = palindromeString.firstPalindrome(words);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenTwoSamePalindromeFoundCaseTest(){
        String[] words = {"abc","race","ada","ada","lol"};
        String expected = "ada";
        String actual = palindromeString.firstPalindrome(words);
        assertEquals(expected,actual);
    }

    @Test
    public void WhenPalindromeFoundAtLastCaseTest(){
        String[] words = {"abc","race","adt","ad","bob"};
        String expected = "bob";
        String actual = palindromeString.firstPalindrome(words);
        assertEquals(expected,actual);
    }

}
