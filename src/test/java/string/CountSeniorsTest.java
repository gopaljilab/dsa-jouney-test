package string;

import org.junit.jupiter.api.Test;

import static gopaljilab.dsa.string.CountSeniors.countSeniors;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSeniorsTest {
    @Test
    public void BaseCaseTest(){
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int expected = 2;
        int actual = countSeniors(details);
        assertEquals(expected,actual,"The Expected Result should be 2.");
    }

    @Test
    public void WhenNoSeniorCitizenCaseTest(){
        String[] details = {"1313579440F2036","2921522980M5644"};
        int expected = 0;
        int actual = countSeniors(details);
        assertEquals(expected,actual,"The Expected Result should be 2.");
    }

    @Test
    public void WhenAllAreSeniorCitizenCaseTest(){
        String[] details = {"1313579440F6336","2921522980M7844", "7868190130M7522", "8271590130M8122"};
        int expected = 4;
        int actual = countSeniors(details);
        assertEquals(expected,actual,"The Expected Result should be 2.");
    }

    @Test
    public void WhenOnlyOneSeniorCitizenCaseTest(){
        String[] details = {"1313579440F6336","2921522980M1844", "7868190130M2522", "8271590130M5122"};
        int expected = 1;
        int actual = countSeniors(details);
        assertEquals(expected,actual,"The Expected Result should be 2.");
    }
}
