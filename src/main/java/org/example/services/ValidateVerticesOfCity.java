package org.example.services;

import org.example.cities.City;
import org.example.vertice.Vertice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ValidateVerticesOfCity {
    public void validate(List<City> cities, Vertice vertice) {
        cities.forEach(x -> {
            vertice.selectVertex(
                    parseCoordinates(x.getCodernadas()),
                    parseMapToList(x.getVertices())
            );
        });
    }

    private Double[] parseCoordinates(String coordinates) {
        Double[] coordinatesSplitDouble = new Double[2];
        int idx = 0;
        for (String element : coordinates.split(",")
        ) {
            coordinatesSplitDouble[idx] = Double.parseDouble(element);
            idx++;
        }
        return coordinatesSplitDouble;
    }

    private List<String> parseMapToList(Map<String, String> map) {
        List<String> listOfCoordinates = new ArrayList<>();
        map.forEach((x, i) -> {
            listOfCoordinates.add(i);
        });
        return listOfCoordinates;
    }
}
