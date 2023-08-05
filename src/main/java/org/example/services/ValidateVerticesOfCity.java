package org.example.services;

import org.example.cities.City;
import org.example.vertex.Vertex;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidateVerticesOfCity {
    protected List<Double> coordinatesVertex = new ArrayList<>();

    public List<Double> getCoordinatesVertex() {
        return coordinatesVertex;
    }

    public void validate(@NotNull List<City> cities, Vertex vertex) {

        cities.forEach(x -> {
            List<String> list = new ArrayList<>();
            list.add(x.getCoordinates());
            coordinatesVertex.add(vertex.selectVertex(
                    parseCoordinates(list).get(0),
                    parseMapToList(x.getVertex())
            ));
        });
    }


    public static @NotNull List<Double[]> parseCoordinates(List<String> coordinate) {
        List<Double[]> coordinates = new ArrayList<>();
        coordinate.forEach(x -> {
            String[] cord = x.replaceAll(" ", "").split(",");
            Double[] doubleCord = new Double[cord.length];
            for (int i = 0; i < cord.length; i++) {
                doubleCord[i] = Double.parseDouble(cord[i]);
            }
            coordinates.add(doubleCord);
        });

        return coordinates;
    }

    private @NotNull List<String> parseMapToList(@NotNull Map<String, String> map) {
        List<String> listOfCoordinates = new ArrayList<>();
        map.forEach((x, i) -> {
            listOfCoordinates.add(i);
        });
        return listOfCoordinates;
    }
}
