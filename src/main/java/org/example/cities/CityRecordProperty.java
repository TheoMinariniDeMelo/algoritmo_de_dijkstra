package org.example.cities;

import java.util.Map;

public record CityRecordProperty (
        String city,
        String coordinates,
        Map<String, String> vertices) {
}
