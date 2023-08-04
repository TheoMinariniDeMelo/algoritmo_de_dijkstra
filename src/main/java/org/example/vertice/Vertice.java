package org.example.vertice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vertice {
    public void selectVertice(double[] citieCord, List<String> verticeCoordinates) {
        List<Double[]> coordinates = parseCoordinates(verticeCoordinates);
    }

    protected List<Double[]> grafo(List<Double[]> coordinates, double[] citieCord) {
        List<Double[]> cordieParam = new ArrayList<>();
        coordinates.forEach(coordinate -> {
            double result_x = coordinate[0] - citieCord[0];
            double result_y = coordinate[1] - citieCord[1];
            cordieParam.add(new Double[]{result_x, result_y});
        });
        return cordieParam.stream().filter(x->x[0] != 0 && x[1]!=0).collect(Collectors.toList());
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

