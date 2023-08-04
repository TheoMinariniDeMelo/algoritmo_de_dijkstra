package org.example;

import org.example.enums.Status;
import java.util.*;

public class Cli {
    protected Scanner scanner = new Scanner(System.in);
    protected Map<String, Integer> cidades = new HashMap<>();

    public Cli() {
        System.out.printf("Number of city's:");
        int citiesQuantity = scanner.nextInt();
        setScanner(citiesQuantity);
    }

    public void setScanner(int citiesQuantity) {
        for (int inx = 0; inx < citiesQuantity; inx++) {
            int state = inx + 1;
            System.out.printf("%n add city %d: ", (state));
            try {
                String citie = scanner.next();
                System.out.printf("%n Add number of vertices ");
                Integer vertice =scanner.nextInt();
                cidades.put(citie, vertice );
                System.out.printf("%n%s%n", Status.PROCESSING);
            } catch (Error error) {
                System.out.printf("%n%s%n", Status.ERROR);
                break;
            }
        }
        System.out.println(Status.ADDED);
    }
}
