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
        cartesianPlane();
    }

    private void setScanner(int citiesQuantity) {
        for (int cityIndex = 0; cityIndex < citiesQuantity; cityIndex++) {
            int state = cityIndex + 1;

            try {
                System.out.printf("Add city %d: ", (state));
                String city = scanner.next();

                System.out.println("Add coordinates (x,y): ");
                String coordinate = scanner.next();
                if (validateCoordinates.validation(coordinate)) {
                    System.out.printf("%sEscreva as cordenadas no formato: (X,Y)", Status.ERROR);
                    cityIndex--;
                    continue;
                }

                System.out.print("Add number of vertices:  ");
                int vertexQuantity = scanner.nextInt();

                List<String[]> vertexList = new ArrayList<>();

                for (int vertexIndex = 0; vertexIndex < vertexQuantity; vertexIndex++) {
                    System.out.print("Add vertex name: ");
                    String name = scanner.next();

                    System.out.print("Add coordinate (X,Y): ");

                    String vertexCoordinate = scanner.next();
                    if (validateCoordinates.validation(coordinate)) {
                        System.out.printf("%sEscreva as cordenadas no formato: (X,Y): ", Status.ERROR);
                        cityIndex--;
                        continue;
                    }

                    String[] vertexInfo= {name, vertexCoordinate};

                    vertexList.add(vertexInfo);
                }

                scanner.nextLine();

                cities.add(city);
                System.out.println();
                cities.forEach((name) -> {
                    dijkstra.setCity(name, coordinate, vertexList);
                });

                System.out.printf("%s", Status.PROCESSING);
            } catch (InputMismatchException error) {
                System.out.println("The type it's incorrect");
                return;
            }
        }
        System.out.println(Status.ADDED);
        scanner.close();
    }

    public void cartesianPlane() {
        List<Double> coordinateVertexResult = dijkstra.getVertexCoordinates();
        System.out.println();
        coordinateVertexResult.forEach(element-> System.out.printf("Coordinates Finaly: %.2f", element));
    }
}