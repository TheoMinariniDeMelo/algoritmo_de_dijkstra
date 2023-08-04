package org.example.services;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GeometricPitagoric {

    protected List<Double> hipotenuse;

    public void setHipotenuse(List<Double[]> coordinates) {
        hipotenuse = coordinates.stream().map(x -> Math.sqrt(
                Math.pow(x[0], 2) + Math.pow(x[1], 2)
        )).collect(Collectors.toList());
    }

}
