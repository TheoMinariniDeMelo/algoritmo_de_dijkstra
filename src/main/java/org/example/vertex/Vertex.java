package org.example.vertex;

import org.example.services.MathGeometric;
import org.example.services.Sort;
import org.example.services.ValidateCoordinates;
import org.example.services.ValidateVerticesOfCity;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    public Double selectVertex(Double[] cityCord, List<String> vertexCoordinates) {
        List<Double[]> coordinates = ValidateVerticesOfCity.parseCoordinates(vertexCoordinates);

        return fork(coordinates, cityCord);
    }

    private Double fork(List<Double[]> coordinates, Double[] cityCord) {
        List<Double> cordieParam = new ArrayList<>();

        coordinates.forEach(coordinate -> cordieParam.add(MathGeometric.euclidean(coordinate, cityCord)));
        return Sort.sortedList(cordieParam);
    }


}



