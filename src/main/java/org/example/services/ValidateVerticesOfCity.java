package org.example.services;

import org.example.cities.City;
import org.example.vertex.Vertex;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidateVerticesOfCity {
    protected List<Double> coordinatesVertex = new ArrayList<>();

    public List<Double> getCoordinatesVertex(){
        return coordinatesVertex;
    }
    public void validate(@NotNull List<City> cities, Vertex vertex) {
        cities.forEach(x -> {

            coordinatesVertex.add(vertex.selectVertex(
                    parseCoordinates(x.getCoordinates()),
                    parseMapToList(x.getVertex())

            ));
        });
    }

    private Double @NotNull [] parseCoordinates(String coordinates) {
        Double[] coordinatesSplitDouble = new Double[2];
        System.out.println(coordinates);
        int idx = 0;
        for (String element : coordinates.split(",")
        ) {
            coordinatesSplitDouble[idx] = Double.parseDouble(element);
            idx++;
        }
        return coordinatesSplitDouble;
    }

    private @NotNull List<String> parseMapToList(Map<String, String> map) {
        List<String> listOfCoordinates = new ArrayList<>();
        map.forEach((x, i) -> {
            listOfCoordinates.add(i);
        });
        return listOfCoordinates;
    }
}
