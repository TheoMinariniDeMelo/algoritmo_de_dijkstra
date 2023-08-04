package org.example;

import org.example.enums.Status;
import org.example.services.ValidateCoordinates;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Cli {
    private final Scanner scanner = new Scanner(System.in);
    private final Dijkstra dijkstra = new Dijkstra();
    private final ValidateCoordinates validateCoordinates = new ValidateCoordinates();
    private final Map<String, Integer> cities = new HashMap<>();

    public Cli() {
        System.out.print("Number of city's: ");
        int citiesQuantity = scanner.nextInt();
        setScanner(citiesQuantity);
    }

    private void setScanner(int citiesQuantity) {
        for (int cityIndex = 0; cityIndex < citiesQuantity; cityIndex++) {
            int state = cityIndex + 1;

            try {
                System.out.printf("%n add city %d: ", (state));
                String city = scanner.next();

                System.out.printf("%n Add number of vertices ");
                Integer vertexQuantity = scanner.nextInt();

                scanner.nextLine();

                System.out.printf("%n Add coordinates (x, y) ");
                String coordinate = scanner.nextLine();

                if(validateCoordinates.validate(coordinate)){
                    System.out.printf("%s", validateCoordinates.validate(coordinate));
                    return;
                }

                cities.put(city, vertexQuantity);

                cities.forEach((name, i) -> {
                    List<String[]> vertices = new ArrayList<String[]>();

                    String[] info = {
                            name,
                            coordinate
                    };

                    vertices.add(info);

                    dijkstra.setCity(name, coordinate, vertices);
                });

                System.out.printf("%n%s%n", Status.PROCESSING);
            } catch (InputMismatchException error) {
                System.out.printf("%nThe type it's incorrect");
                return;
            }
        }
        System.out.println(Status.ADDED);
    }
}
