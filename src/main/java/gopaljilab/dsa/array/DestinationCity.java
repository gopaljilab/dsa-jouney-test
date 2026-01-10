package gopaljilab.dsa.array;

import java.util.*;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> startCities = new HashSet<>();
        for (List<String> path : paths) {
            startCities.add(path.getFirst()); // Add start city
        }

        for (List<String> path : paths) {
            if (!startCities.contains(path.get(1))) { // Check if destination is NOT a start city
                return path.get(1); // Guaranteed to exist
            }
        }
        return paths.getLast().getLast();
    }
}
