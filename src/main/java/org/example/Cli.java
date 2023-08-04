package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cli {
    protected Scanner sc = new Scanner(System.in);
    protected List<String> cidades = new ArrayList<>();
    public Cli(){
        System.out.println("Numero de cidades:");
        int NumeroDeCidades = sc.nextInt();
        setSc(NumeroDeCidades);
    }

    public void setSc(int numeroDeCidades) {
        for (int inx = 0 ; inx < numeroDeCidades; inx++) {
            System.out.printf("adicionar cidade %d%n", ++inx);
            cidades.add(sc.next());
        }
    }
}
