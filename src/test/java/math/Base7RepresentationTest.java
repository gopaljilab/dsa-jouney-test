package math;

import gopaljilab.dsa.math.Base7Representation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Base7RepresentationTest {
    final Base7Representation base7Representation = new Base7Representation();

    @Test
    public void BaseCaseTest(){
        int num = 100;
        String actual = base7Representation.convertToBase7(num);
        String expected = "202";
        assertEquals(expected,actual);
    }

    @Test
    public void WhenNumIsZeroCaseTest(){
        int num = 0;
        String actual = base7Representation.convertToBase7(num);
        String expected = "0";
        assertEquals(expected,actual);
    }

    @Test
    public void WhenNumIsNegativeCaseTest(){
        int num = -7;
        String actual = base7Representation.convertToBase7(num);
        String expected = "-10";
        assertEquals(expected,actual);
    }

    @Test
    public void WhenNumIsMaximumCaseTest(){
        int num = Integer.MAX_VALUE;
        String actual = base7Representation.convertToBase7(num);
        String expected = "104134211161";
        assertEquals(expected,actual);
    }

    @Test
    public void WhenNumIsMinimumCaseTest(){
        int num = Integer.MIN_VALUE;
        String actual = base7Representation.convertToBase7(num);
        String expected = "-104134211162";
        assertEquals(expected,actual);
    }

}
