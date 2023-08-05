package org.example.services;


import org.jetbrains.annotations.NotNull;

public abstract class MathGeometric {
    public static double euclidean(Double @NotNull [] coordinate, Double @NotNull [] cityCord) {
        double x1 = coordinate[0];
        double x2 = cityCord[0];
        double y1 = coordinate[1];
        double y2 = cityCord[1];

        double dx = x2 - x1;
        double dy = y2 - y1;

        return Math.sqrt(dx * dx + dy * dy);
    }
}
