package com.digitalhouse.integradora.nueve.ejercicio1;

import java.util.HashMap;
import java.util.Random;


public class FlyweightFactory {

    public static final HashMap<String, Triangulo> trianguloMap = new HashMap<>();

    public Triangulo obtenerTriangulo(String color) {

        Triangulo triangulo= trianguloMap.get(color);

        if(triangulo == null) {

            int min = 1;
            int max = 20;
            Random random = new Random();
            int tamanioAux = random.nextInt(min + max);

            triangulo = new Triangulo(color, tamanioAux);
            trianguloMap.put(color, triangulo);
            System.out.println("Nuevo triangulo");
        }
        return triangulo;
    }
}
