package string;

import gopaljilab.dsa.string.NewJewelsInStones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewJewelsInStonesTest {
    @Test
    public void BaseCaseTest(){
        NewJewelsInStones inStones = new NewJewelsInStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int actual = inStones.numJewelsInStones(jewels,stones);
        int expected = 3;
        assertEquals(expected,actual,"the result of jewels = \"aA\" and stones = \"aAAbbbb\" should be 3");
    }

    @Test
    public void AllJewelsInUpperCaseTest(){
        NewJewelsInStones inStones = new NewJewelsInStones();
        String jewels = "TUW";
        String stones = "OiiTWwwBBTU";
        int actual = inStones.numJewelsInStones(jewels,stones);
        int expected = 4;
        assertEquals(expected,actual,"the result of jewels = \"TUW\" and stones = \"OiiTWwwBBTU\" should be 4");
    }

    @Test
    public void AllJewelsInLowerCaseTest(){
        NewJewelsInStones inStones = new NewJewelsInStones();
        String jewels = "agyb";
        String stones = "OWUskkiWOOhjxcskaUWIKA";
        int actual = inStones.numJewelsInStones(jewels,stones);
        int expected = 1;
        assertEquals(expected,actual,"the result of jewels = \"agyb\" and stones = \"OWUskkiWOOhjxcskaUWIKA\" should be 1");
    }

    @Test
    public void CaseSensitiveCaseTest(){
        NewJewelsInStones inStones = new NewJewelsInStones();
        String jewels = "z";
        String stones = "ZZ";
        int actual = inStones.numJewelsInStones(jewels,stones);
        int expected = 0;
        assertEquals(expected,actual,"the result of jewels = \"z\" and stones = \"ZZ\" should be 0");
    }

    @Test
    public void NoJewelsInStonesCaseTest(){
        NewJewelsInStones inStones = new NewJewelsInStones();
        String jewels = "djUV";
        String stones = "PslERNmno";
        int actual = inStones.numJewelsInStones(jewels,stones);
        int expected = 0;
        assertEquals(expected,actual,"the result of jewels = \"agyb\" and stones = \"OWUskkiWOOhjxcskaUWIKA\" should be 0");
    }

    @Test
    public void AllJewelsInStonesCaseTest(){
        NewJewelsInStones inStones = new NewJewelsInStones();
        String jewels = "AOzz";
        String stones = "OALzPPZOAP";
        int actual = inStones.numJewelsInStones(jewels,stones);
        int expected = 5;
        assertEquals(expected,actual,"the result of jewels = \"agyb\" and stones = \"OWUskkiWOOhjxcskaUWIKA\" should be 5");
    }
}
