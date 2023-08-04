package org.example;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    public void selectVertice(double[] citieCord, List<String> value) {
        List<Double[]> coordinates = parseCordenadas(value);
    }

/*    protected int grafo(List<Double[]> coordinates, double[] citieCord) {
        List<Double[]> cordieParam = new ArrayList<>();
        coordinates.forEach(elemento -> {
            double result_x = elemento[0] - citieCord[0];
            double result_y = elemento[1] - citieCord[1];
            cordieParam.add(new Double[]{result_x, result_y});
        });
        cordieParam.stream().takeWhile(x-> x[0]!=0 && x[1]!=0);

    }*/

    protected static List<Double[]> parseCordenadas(List<String> value) {
        List<Double[]> coordinates = new ArrayList<>();
        value.forEach(x -> {
            String[] cord = x.split(",");
            Double[] doubleCord = new Double[cord.length];
            for (int i = 0; i < cord.length; i++) doubleCord[i] = Double.parseDouble(cord[i]);
            coordinates.add(doubleCord);
        });
        return coordinates;
    }
}

