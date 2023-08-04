package org.example;

import java.util.HashMap;
import java.util.Map;

public class Dijkstra {
    protected Map<String, String> cities = new HashMap<>();
    public Integer verticesQuantity;
    
    Dijkstra(Map<String, String> name, Integer verticesQuantity){
        this.verticesQuantity = verticesQuantity;
    }
}
