package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    protected Map<String, String> cities = new HashMap<>();
    public List<Integer> vertices = new ArrayList<>();

    public Map<String, String> getCities() {
        return cities;
    }

    public void setCities(Map<String, String> cities) {
        this.cities = cities;
    }

    public List<Integer> getVertices() {
        return vertices;
    }

    public void setVertices(Integer vertices) {
        this.vertices.add(vertices);
    }

    @Override
    public String toString() {
        return "City{" +
                "cities=" + cities +
                ", vertices=" + vertices +
                '}';
    }
}
