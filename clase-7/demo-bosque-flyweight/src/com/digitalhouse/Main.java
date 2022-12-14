package com.digitalhouse;

import com.digitalhouse.flyweight.BosqueFlyweight;

public class Main {
    public static void main(String[] args) {
        final BosqueFlyweight bosque = new BosqueFlyweight();

        for (int i = 0; i < 1000000; i++) {
            bosque.plantarArbol("ORNAMENTALES", 200, 400, "verde");
            bosque.plantarArbol("FRUTALES", 500, 300, "rojo");
            bosque.plantarArbol("FRUTALES", 100, 200, "celestes");
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }

}
