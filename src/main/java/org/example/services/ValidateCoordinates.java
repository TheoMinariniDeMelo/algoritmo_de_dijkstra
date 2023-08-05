package org.example.services;

import java.util.regex.*;

public class ValidateCoordinates {
<<<<<<< HEAD
    public boolean validate(String coordinates){
        String pattern = "\\s*-?\\d+\\s*,\\s*-?\\d+\\s*";
=======
    public boolean validation(String coordinates){
        String pattern = "^\\s*-?\\d+\\s*,\\s*-?\\d+\\s*$";
>>>>>>> origin/Théo
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(coordinates);
        return !matcher.matches();
    }
}
