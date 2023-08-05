package org.example.cities;

import org.example.vertex.Vertex;

import java.util.HashMap;
import java.util.Map;

public class City {
    protected String city;
    protected String coordinates;
    public Map<String, String> vertices = new HashMap<>();

    public City(String city, String coordinates, Vertex vertex) {
        CityRecordProperty cityRecordProperty = new CityRecordProperty(city, coordinates, new HashMap<>());

    }

    public void setVertex(String vertices, String codVertices) {
        this.vertices.put(vertices, codVertices);
    }

    public String getCoordinates() {
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
