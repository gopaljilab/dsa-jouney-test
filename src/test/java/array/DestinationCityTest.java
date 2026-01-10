package array;

import gopaljilab.dsa.array.DestinationCity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DestinationCityTest {
    static final DestinationCity destinationCheck = new DestinationCity();

    @Test
    void baseCaseTest() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        String result = destinationCheck.destCity(paths);

        assertEquals("Sao Paulo", result);
    }

    @Test
    void twoCitiesOnlyTest() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("A", "B"));

        String result = destinationCheck.destCity(paths);

        assertEquals("B", result);
    }

    @Test
    void unorderedInputTest() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("B", "C"));
        paths.add(Arrays.asList("A", "B"));

        String result = destinationCheck.destCity(paths);

        assertEquals("C", result);
    }

    @Test
    void differentCityNamesTest() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("Mumbai", "Delhi"));
        paths.add(Arrays.asList("Delhi", "Bangalore"));
        paths.add(Arrays.asList("Bangalore", "Chennai"));

        String result = destinationCheck.destCity(paths);

        assertEquals("Chennai", result);
    }

    @Test
    void singlePathTest() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("X", "Y"));

        String result = destinationCheck.destCity(paths);

        assertEquals("Y", result);
    }
}
