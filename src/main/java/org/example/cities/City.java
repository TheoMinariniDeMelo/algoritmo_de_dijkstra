package org.example.cities;

import org.example.vertex.Vertex;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class City {
    protected @NotNull String city;
    protected @NotNull String coordinates;
    public Map<String, String> vertices = new HashMap<>();

    public City(@NotNull String city, @NotNull String coordinates, Vertex vertex) {
        this.city = city;
        this.coordinates = coordinates;
    }

    public void setVertex(String vertices, String codVertices) {
        this.vertices.put(vertices, codVertices);
    }

    public @NotNull String getCoordinates() {
        return coordinates;
    }


    public Map<String, String> getVertex() {
        return vertices;
    }


    @Override
    public String toString() {
        return "City{"
                + "city='"
                + city
                + "', codernadas='"
                + coordinates
                + "', vertices="
                + vertices;
    }
}
