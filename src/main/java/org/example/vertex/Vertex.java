package org.example.vertex;

import org.example.services.GeometricPitagoric;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Vertex extends GeometricPitagoric {
    public Double selectVertex(Double[] cityCord, List<String> vertexCoordinates) {
        List<Double[]> coordinates = parseCoordinates(vertexCoordinates);
        return fork(coordinates, cityCord);
    }

    private Double fork(List<Double[]> coordinates, Double[] cityCord) {
        List<Double[]> cordieParam = new ArrayList<>();
        coordinates.forEach(coordinate -> {
            double result_x = coordinate[0] - cityCord[0];
            double result_y = coordinate[1] - cityCord[1];
            cordieParam.add(new Double[]{result_x, result_y});
        });
        this.setHypotenuse(cordieParam.stream()
                .sorted(Comparator.comparing(x -> x[0]))
                .toList());
        return this.hipotenuse.stream().sorted().toList().get(0);
    }

    private static @NotNull List<Double[]> parseCoordinates(List<String> coordinate) {
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

