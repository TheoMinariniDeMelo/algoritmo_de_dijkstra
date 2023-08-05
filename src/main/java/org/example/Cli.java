package org.example;

import org.example.enums.Status;
import org.example.services.ValidateCoordinates;

import java.util.*;

public class Cli {
    private final Scanner scanner = new Scanner(System.in);
    private final Dijkstra dijkstra = new Dijkstra();
    private final ValidateCoordinates validateCoordinates = new ValidateCoordinates();
    private final List<String> cities = new ArrayList<>();

    public Cli() {
        System.out.print("Number of city's: ");
        int citiesQuantity = scanner.nextInt();
        setQuestions(citiesQuantity);
    }

    private void setQuestions(int citiesQuantity) {
        for (int cityIndex = 0; cityIndex < citiesQuantity; cityIndex++) {
            int state = cityIndex + 1;

            try {
                System.out.printf("add city %d: ", (state));
                String city = scanner.next();

                System.out.print("Add city coordinates (x,y): ");
                String coordinate = scanner.next();

                if(validateCoordinates.validate(coordinate)){
                    cityIndex--;
                    continue;
                }

                System.out.print("Add number of vertices: ");
                int vertexQuantity = scanner.nextInt();

                List<String[]> vertexList = new ArrayList<>();

                for(int vertexIndex = 0; vertexIndex < vertexQuantity; vertexIndex++){
                    System.out.print("Add vertex name: ");
                    String name = scanner.next();

                    System.out.print("add vertex coordinate (X,Y): ");
                    String vertexCoordinate = scanner.next();

                    if(validateCoordinates.validate(coordinate)){
                        cityIndex--;
                        continue;
                    }

                    String[] vertexInfos = {
                            name,
                            vertexCoordinate
                    };

                    vertexList.add(vertexInfos);
                }

                cities.add(city);

                cities.forEach((name) -> dijkstra.setCity(name, coordinate, vertexList));

                System.out.printf("%n%s%n", Status.PROCESSING);
            } catch (InputMismatchException error) {
                System.out.println("The type it's incorrect");
            }
        }
        System.out.println(Status.ADDED);
    }
}

