package org.example;

import org.example.enums.Status;
import org.example.services.ValidateCoordinates;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cli {
    private final Scanner scanner = new Scanner(System.in);
    private final Dijkstra dijkstra = new Dijkstra();
    private final ValidateCoordinates validateCoordinates = new ValidateCoordinates();
    private final List<String> cities = new ArrayList<>();

    public Cli() {
        setQuestions(numberOfCity());
        cartesianPlane();
    }

    private int numberOfCity() {
        int number = 0;
        boolean validInput = false;
        do {
            try {
                System.out.print("Number of cities: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");

                scanner.nextLine();
            }
        } while (!validInput);

        return number;
    }

    private String checkValidCoordinate(String field){
        boolean validCoordinate;
        System.out.print(field);
        String coordinate = scanner.next();

        do {
            validCoordinate = true;

            if(!validateCoordinates.validation(coordinate)){
                System.out.print("Invalid input. " + field);
                coordinate = scanner.next();
                validCoordinate = false;
            }
        }while(!validCoordinate);

        return coordinate;
    }

    private void setQuestions(int citiesQuantity) {
        for (int cityIndex = 0; cityIndex < citiesQuantity; cityIndex++) {
            int state = cityIndex + 1;

            try {
                System.out.printf("add city %d: ", (state));
                String city = scanner.next();

                String coordinate = checkValidCoordinate("Add city coordinate (X,Y): ");

                System.out.print("Add number of vertices: ");
                int vertexQuantity = scanner.nextInt();

                List<String[]> vertexList = new ArrayList<>();

                for (int vertexIndex = 0; vertexIndex < vertexQuantity; vertexIndex++) {
                    System.out.print("Add vertex name: ");
                    String name = scanner.next();

                    String vertexCoordinate = checkValidCoordinate("Add vertex coordinate (X,Y): ");

                    String[] vertexInfos = {
                            name,
                            vertexCoordinate
                    };

                    vertexList.add(vertexInfos);
                }

                cities.add(city);

                final String finalCoordinate = coordinate;

                cities.forEach((name) -> dijkstra.setCity(name, finalCoordinate, vertexList));

                System.out.printf("%n%s%n", Status.PROCESSING);
            } catch (InputMismatchException error) {
                System.out.print("The type it's incorrect");
            }
        }
        System.out.println(Status.ADDED);
    }

    private void cartesianPlane() {
        this.dijkstra.getVertexCoordinates().forEach(System.out::println);
    }
}