package org.example.services;

import java.util.regex.*;

public class ValidateCoordinates {
    public boolean validate(String coordinates){
        String pattern = "^\\s*-?\\d+\\s*,\\s*-?\\d+\\s*$\n";

        Pattern compilatedPattern = Pattern.compile(pattern);
        Matcher matcher = compilatedPattern.matcher(coordinates);

        return matcher.matches();
    }
}
