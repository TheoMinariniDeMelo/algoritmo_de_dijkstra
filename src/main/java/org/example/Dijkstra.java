package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.example.cities.City;
import org.example.vertice.Vertice;

public class Dijkstra {

    //protected City cidade = new City();
   protected List<City> cities = new ArrayList<>();
   protected Vertice vertice = new Vertice();
   protected City city;
    public List<City> getCity() {
        return cities;
    }
    public void setCities() {
        this.cities.add(city);
    }

    public void setCity(String city, String coordinate,String verticesName, String verticesCoordinates) {
        this.city = new City(city, coordinate, verticesName, verticesCoordinates);
    }
}
