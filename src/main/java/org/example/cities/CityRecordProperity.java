package org.example.cities;

import java.util.HashMap;
import java.util.Map;

public record CityRecordProperity(
        String city,
        String codernadas,
        Map<String, String> vertices) {
}
