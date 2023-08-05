package org.example.services;

import java.util.regex.*;

public class ValidateCoordinates {
    public boolean validation(String coordinates){
        String pattern = "^\\s*-?\\d+\\s*,\\s*-?\\d+\\s*$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(coordinates);
        return !matcher.matches();
    }
}
