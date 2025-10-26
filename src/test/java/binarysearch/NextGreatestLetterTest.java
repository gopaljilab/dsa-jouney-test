package binarysearch;

import gopaljilab.dsa.binarysearch.NextGreatestLetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextGreatestLetterTest {
    @Test
    public void TestBaseCase(){
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] letters = {'c','f','j'};
        char target = 'a';
        char expected = 'c';
        char actual = nextGreatestLetter.nextGreatestLetter(letters,target);
        assertEquals(expected,actual,"letters : {'c','f','j'} and target = 'a' should be 'c'");
    }

    @Test
    public void TestTargetExistInArray(){
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] letters = {'c','f','j'};
        char target = 'f';
        char expected = 'j';
        char actual = nextGreatestLetter.nextGreatestLetter(letters,target);
        assertEquals(expected,actual,"letters : {'c','f','j'} and target = 'f' should be 'j'");
    }

    @Test
    public void TestTargetNotExistInArray(){
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] letters = {'c','f','j'};
        char target = 'd';
        char expected = 'f';
        char actual = nextGreatestLetter.nextGreatestLetter(letters,target);
        assertEquals(expected,actual,"letters : {'c','f','j'} and target = 'd' should be 'f'");
    }

    @Test
    public void TestTargetIsGreaterThanAllElement(){
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        char expected = 'x';
        char actual = nextGreatestLetter.nextGreatestLetter(letters,target);
        assertEquals(expected,actual,"letters : {'x','x','y','y'} and target = 'z' should be 'x'");
    }

    @Test
    public void TestTargetIsBeforeLast(){
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] letters = {'a','b','e','k'};
        char target = 'j';
        char expected = 'k';
        char actual = nextGreatestLetter.nextGreatestLetter(letters,target);
        assertEquals(expected,actual,"letters : {'a','b','e','k'} and target = 'j' should be 'k'");
    }

    @Test
    public void TestWithTheMinimumElement(){
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] letters = {'a','o'};
        char target = 'g';
        char expected = 'o';
        char actual = nextGreatestLetter.nextGreatestLetter(letters,target);
        assertEquals(expected,actual,"letters : {'a','o'} and target = 'j' should be 'o'");
    }

    @Test
    public void TestArrayWithAllAlphabets(){
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char target = 'z';
        char expected = 'a';
        char actual = nextGreatestLetter.nextGreatestLetter(letters,target);
        assertEquals(expected,actual,"letters : {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'} and target = 'z' should be 'a'");
    }

}
