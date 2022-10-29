package com.digitalhouse.flyweight;

import com.digitalhouse.model.Computadora;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFlyweightFactory {

    private static Map<String, Computadora> computadoraMap = new HashMap<>();

    public Computadora getComputadora(int ram, int disco) {

        String clave = "key: " + ram + ":" + disco;

        if (!computadoraMap.containsKey(clave)) {
            computadoraMap.put(clave, new Computadora(ram, disco));
            System.out.println("Computadora creada");
            return computadoraMap.get(clave);
        }
        System.out.println("Computadora obtenida");
        return computadoraMap.get(clave);

    }


}
