package org.example;

import org.example.enums.Status;
import java.util.*;

public class Cli {
    protected Scanner scanner = new Scanner(System.in);
    protected Map<String, Integer> cidades = new HashMap<>();

    public Cli() {
        System.out.println("Numero de cidades:");
        int citiesQuantity = scanner.nextInt();
        setScanner(citiesQuantity);
    }

    public void setScanner(int citiesQuantity) {
        for (int inx = 0; inx < citiesQuantity; inx++) {
            System.out.printf("adicionar cidade e cidades para grafo %d%n", ++inx);
            try {
                cidades.put(scanner.next(), scanner.nextInt());
                System.out.printf("%n%s%n", Status.PROCESSING);
            } catch (Error error) {
                System.out.printf("%n%s%n", Status.ERROR);
            }
        }
    }
}
