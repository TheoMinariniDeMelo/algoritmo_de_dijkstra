package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.cities.City;
import org.example.vertice.Vertice;

public class Dijkstra {

    //protected City cidade = new City();
   private final List<City> cities = new ArrayList<>();
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
        setVerticeOfCity(vertices);
        setCities();
    }
    private void setVerticeOfCity(List<String[]> vertices){
        vertices.forEach(x->{
            this.city.setVertice(x[0], x[1]);
        });
    }
}
