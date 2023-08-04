package org.example;

import org.example.enums.Status;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cli {
    protected Scanner scanner = new Scanner(System.in);
    protected Map<String, Integer> cities = new HashMap<>();

    public Cli() {
        System.out.printf("Number of city's:");
        int citiesQuantity = scanner.nextInt();
        setScanner(citiesQuantity);
    }

    public void setScanner(int citiesQuantity) {
        for (int cityIndex = 0; cityIndex < citiesQuantity; cityIndex++) {
            int state = cityIndex + 1;

            try {
                System.out.printf("%n add city %d: ", (state));
                String citie = scanner.next();

                System.out.printf("%n Add number of vertices ");
                Integer vertice = scanner.nextInt();

                System.out.printf("%n Add coordinates (x, y)");
                String coordinate = scanner.nextLine();

                cities.put(citie, vertice);

                Dijkstra dijkstra = new Dijkstra();

                System.out.printf("%n%s%n", Status.PROCESSING);
            } catch (Error error) {
                System.out.printf("%n%s%n", Status.ERROR);
                break;
            }
        }
        System.out.println(Status.ADDED);
    }
}
