package org.example.services;


import java.util.List;
import java.util.stream.Collectors;

public abstract class GeometricPitagoric {

    protected List<Double> hypotenuse;

    public void setHypotenuse(List<Double[]> coordinates) {
        hypotenuse = coordinates.stream().map(x -> Math.sqrt(
                Math.pow(x[0], 2) + Math.pow(x[1], 2)
        )).collect(Collectors.toList());
    }

}
