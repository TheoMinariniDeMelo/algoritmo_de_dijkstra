package org.example.cities;

import java.util.Map;

public record CityRecordProperty (
        String city,
        String Coordinates,
        Map<String, String> vertices) {
}
