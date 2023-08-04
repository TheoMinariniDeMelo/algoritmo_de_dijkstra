package org.example;

import java.util.ArrayList;
import java.util.List;


import org.example.cities.City;
import org.example.vertice.Vertice;
import org.jetbrains.annotations.NotNull;

public class Dijkstra {

    //protected City cidade = new City();
   private final  List<City> cities = new ArrayList<>();
   private final Vertice vertice = new Vertice();
   private City city;
    public List<City> getCity() {
        return cities;
    }
    private void setCities() {
        this.cities.add(city);
    }

    public void setCity(String city, String coordinate, List<String[]> vertices) {
        this.city = new City(city, coordinate, vertice);
        setVertexOfCity(vertices);
        setCities();
    }
    private void setVertexOfCity(@NotNull List<String[]> vertices){
        vertices.forEach(x->{
            this.city.setVertex(x[0], x[1]);
        });
    }
}
