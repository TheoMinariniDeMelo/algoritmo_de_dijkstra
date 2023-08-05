package org.example.vertex;

import org.example.services.MathGeometric;
import org.example.services.Sort;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    public Double selectVertex(Double[] cityCord, List<String> vertexCoordinates) {
        List<Double[]> coordinates = parseCoordinates(vertexCoordinates);

        return fork(coordinates, cityCord);
    }

    private Double fork(@NotNull List<Double[]> coordinates, Double[] cityCord) {
        List<Double> cordieParam = new ArrayList<>();

        coordinates.forEach(coordinate -> cordieParam.add(MathGeometric.euclidean(coordinate, cityCord)));
        return Sort.sortedList(cordieParam);
    }

    private static @NotNull List<Double[]> parseCoordinates(@NotNull List<String> coordinate) {
        List<Double[]> coordinates = new ArrayList<>();
        coordinate.forEach(x -> {
            String[] cord = x.split(",");
            Double[] doubleCord = new Double[cord.length];
            for (int i = 0; i < cord.length; i++) {
                doubleCord[i] = Double.parseDouble(cord[i]);
            }
            coordinates.add(doubleCord);
        });

        return coordinates;
    }
}



