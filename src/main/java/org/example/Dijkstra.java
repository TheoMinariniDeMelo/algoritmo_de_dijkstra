package org.example;

import java.util.ArrayList;
import java.util.List;


import org.example.cities.City;
import org.example.vertex.Vertex;
import org.jetbrains.annotations.NotNull;

public class Dijkstra {
   private final @NotNull List<City> cities = new ArrayList<>();
   private final @NotNull Vertex vertex = new Vertex();
   private City city;

    private void setCities() {
        this.cities.add(city);
    }

    public void setCity(String city, String coordinate, List<String[]> vertices) {
        this.city = new City(city, coordinate, vertex);
        setVertexOfCity(vertices);
        setCities();
    }
    private void setVertexOfCity(List<String[]> vertices){
        vertices.forEach(x->{
            this.city.setVertex(x[0], x[1]);
        });
    }
}
