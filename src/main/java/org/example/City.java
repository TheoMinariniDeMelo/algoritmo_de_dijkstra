package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    protected String city;
    protected String codernadas;
    public Map<String, String> vertices = new HashMap<>();

    public City(String city, String codernadas, String vertices, String codVertices) {
        this.city = city;
        this.codernadas = codernadas;
        this.vertices.put(vertices, codernadas);
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
        return "City{" +
                "city='" + city + '\'' +
                ", codernadas='" + codernadas + '\'' +
                ", vertices=" + vertices +
                '}';
    }


}
