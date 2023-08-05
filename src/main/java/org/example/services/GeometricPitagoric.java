package org.example.services;


import java.util.List;
import java.util.stream.Collectors;

public abstract class GeometricPitagoric {
    public static double binomy(Double[] coordinate, Double[] cityCord) {
        System.out.println(coordinate[0] + "--------" + cityCord[0]);
        return Math.sqrt(GeometricPitagoric.calculateBinomy(coordinate[1], coordinate[1]) + GeometricPitagoric.calculateBinomy(coordinate[1], coordinate[1]));
    }

    public static double calculateBinomy(Double coordinate, Double cityCord) {
        coordinate = Math.abs(coordinate);
        cityCord = Math.abs(cityCord);
        return Math.pow(coordinate, 2) - 2 * coordinate * cityCord + Math.pow(cityCord, 2);
    }


}
