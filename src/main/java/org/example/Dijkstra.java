package org.example;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;

public class Dijkstra {

    protected Integer verticesQuantity;
    protected City cidade = new City();

    protected Name nome;

    Dijkstra(Map<String, String> name, Integer verticesQuantity) {
        this.verticesQuantity = verticesQuantity;
    }
}
