package org.example.cities;

import org.example.vertice.Vertice;

import java.util.HashMap;
import java.util.Map;

public class City {
    protected String city;
    protected String codernadas;
    public Map<String, String> vertices = new HashMap<>();

    public City(String city, String codernadas, Vertice vertice) {
        this.city = city;
        this.codernadas = codernadas;
    }
    public void setVertice(String vertices, String codVertices) {
        this.vertices.put(vertices, codVertices);
    }

    public String getCity() {
        return city;
    }

    public String getCodernadas() {
        return codernadas;
    }


    public Map<String, String> getVertices() {
        return vertices;
    }


    @Override
    public String toString() {
        StringBuilder strings = new StringBuilder()
                .append("City{")
                .append("city='")
                .append(city)
                .append("', codernadas='")
                .append(codernadas)
                .append("', vertices=")
                .append(vertices);

        return strings.toString();

    }
}
