package org.example.services;

import java.util.List;

public class Sort {
    public static Double sortedList(List<Double> cordieParam) {
        List<Double> list = (cordieParam.stream()
                .sorted()
                .toList());
        return list.stream().sorted().toList().get(0);
    }

}
