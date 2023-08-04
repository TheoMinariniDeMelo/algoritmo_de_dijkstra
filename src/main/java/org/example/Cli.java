package org.example;

import org.example.enums.Status;

import java.util.*;

public class Cli {
    protected Scanner sc = new Scanner(System.in);
    protected Map<String, Integer> cidades = new HashMap<>();

    public Cli() {
        System.out.println("Numero de cidades:");
        int NumeroDeCidades = sc.nextInt();
        setSc(NumeroDeCidades);
    }

    public void setSc(int numeroDeCidades) {
        for (int inx = 0; inx < numeroDeCidades; inx++) {
            System.out.printf("adicionar cidade e cidades para grafo %d%n", ++inx);
            try {
                cidades.put(sc.next(), sc.nextInt());
                System.out.printf("%n%s%n", Status.PROCESSANDO);
            } catch (Error error) {
                System.out.printf("%n%s%n", Status.ERROR);
            }
        }
    }
}
