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
        setScanner(citiesQuantity);
    }

    private void setScanner(int citiesQuantity) {
        for (int cityIndex = 0; cityIndex < citiesQuantity; cityIndex++) {
            int state = cityIndex + 1;

            try {
                System.out.printf("%n add city %d: ", (state));
                String city = scanner.next();

                System.out.printf("%n Add coordinates (x,y) ");
                String coordinate = scanner.next();
                if (!validateCoordinates.validate(coordinate)) {
                    System.out.printf("%s%nEscreva as cordenadas no formato: (X,Y)", Status.ERROR);
                    cityIndex--;
                    continue;
                }

                System.out.printf("%n Add number of vertices ");
                int vertexQuantity = scanner.nextInt();

                List<String[]> vertexList = new ArrayList<>();

                for(int vertexIndex = 0; vertexIndex < vertexQuantity; vertexIndex++){
                    System.out.printf("%n add vertex name ");
                    String name = scanner.next();

                    System.out.printf("%n add coordinate (X,Y)");

                    String vertexCoordinate = scanner.next();
                    if (!validateCoordinates.validate(coordinate)) {
                        System.out.printf("%s%nEscreva as cordenadas no formato: (X,Y)", Status.ERROR);
                        cityIndex--;
                        continue;
                    }

                    String[] vertexInfos = {
                            name,
                            vertexCoordinate
                    };

                    vertexList.add(vertexInfos);
                }

                scanner.nextLine();

                cities.add(city);

                cities.forEach((name) -> dijkstra.setCity(name, coordinate, vertexList));

                System.out.printf("%n%s%n", Status.PROCESSING);
            } catch (InputMismatchException error) {
                System.out.printf("%nThe type it's incorrect");
                return;
            }
        }
        System.out.println(Status.ADDED);
    }

    public void cartesianPlane() {
        List<Double> coordinateVertexResult = dijkstra.getVertexCoordinates();
        coordinateVertexResult.forEach(System.out::println);
    }
}

