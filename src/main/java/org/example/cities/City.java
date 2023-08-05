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


    public Map<String, String> getVertices() {
        return vertices;
    }


    @Override
    public String toString() {
        StringBuilder message = new StringBuilder()
                .append("City{")
                .append("city='")
                .append(city)
                .append("', codernadas='")
                .append(coordinates)
                .append("', vertices=")
                .append(vertices);

        return message.toString();
    }
}
