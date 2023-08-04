package org.example.vertice;

import org.example.services.GeometricPitagoric;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Vertice extends GeometricPitagoric {
    public Double selectVertice(double[] citieCord, List<String> verticeCoordinates) {
        List<Double[]> coordinates = parseCoordinates(verticeCoordinates);
        return fork(coordinates, citieCord);
    }

    protected Double fork(List<Double[]> coordinates, double[] citieCord) {
        List<Double[]> cordieParam = new ArrayList<>();
        coordinates.forEach(coordinate -> {
            double result_x = coordinate[0] - citieCord[0];
            double result_y = coordinate[1] - citieCord[1];
            cordieParam.add(new Double[]{result_x, result_y});
        });
        this.setHipotenuse(cordieParam.stream()
                .sorted(Comparator.comparing(x -> x[0]))
                .toList());
        return this.hipotenuse.stream().sorted().toList().get(0);
    }

    protected static List<Double[]> parseCoordinates(List<String> coordinate) {
        List<Double[]> coordinates = new ArrayList<>();
        coordinate.forEach(x -> {
            String[] cord = x.split(",");
            Double[] doubleCord = new Double[cord.length];

            for (int i = 0; i < cord.length; i++) {
                doubleCord[i] = Double.parseDouble(cord[i]);
            };
            coordinates.add(doubleCord);
        });

        return coordinates;
    }
}

