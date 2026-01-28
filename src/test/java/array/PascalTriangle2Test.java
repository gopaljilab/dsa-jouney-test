package array;

import gopaljilab.dsa.array.PascalTriangle2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalTriangle2Test {
    static final PascalTriangle2 pascalTriangle2 = new PascalTriangle2();

    @Test
    public void BaseCaseTest(){
        int rowIndex = 3;
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,3,3,1));
        List<Integer> result = pascalTriangle2.getRow(rowIndex);
        assertEquals(expected,result);
    }

    @Test
    public void FirstRowCaseTest(){
        int rowIndex = 0;
        List<Integer> expected = new ArrayList<>(List.of(1));
        List<Integer> result = pascalTriangle2.getRow(rowIndex);
        assertEquals(expected,result);
    }

    @Test
    public void SecondRowCaseTest(){
        int rowIndex = 1;
        List<Integer> expected = new ArrayList<>(List.of(1,1));
        List<Integer> result = pascalTriangle2.getRow(rowIndex);
        assertEquals(expected,result);
    }

    @Test
    public void MaxRowCaseTest(){
        int rowIndex = 33;
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 33, 528, 5456, 40920, 237336, 1107568, 4272048, 13884156, 38567100, 92561040, 193536720, 354817320, 573166440, 818809200, 1037158320, 1166803110, 1166803110, 1037158320, 818809200, 573166440, 354817320, 193536720, 92561040, 38567100, 13884156, 4272048, 1107568, 237336, 40920, 5456, 528, 33, 1));
        List<Integer> result = pascalTriangle2.getRow(rowIndex);
        assertEquals(expected,result);
    }

    @Test
    public void MiddleElementTest(){
        int rowIndex = 6;
        List<Integer> result = pascalTriangle2.getRow(rowIndex);

        // Row 6 → [1, 6, 15, 20, 15, 6, 1]
        assertEquals(20, result.get(3));
    }

    @Test
    public void SymmetryPropertyTest(){
        int rowIndex = 10;
        List<Integer> result = pascalTriangle2.getRow(rowIndex);

        for(int i = 0; i < result.size(); i++){
            assertEquals(result.get(i), result.get(result.size() - 1 - i));
        }
    }

    @Test
    public void FirstAndLastElementShouldBeOne(){
        int rowIndex = 15;
        List<Integer> result = pascalTriangle2.getRow(rowIndex);

        assertEquals(1, result.getFirst());
        assertEquals(1, result.getLast());
    }

}
