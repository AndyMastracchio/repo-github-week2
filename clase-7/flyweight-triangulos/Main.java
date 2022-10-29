package com.digitalhouse.integradora.nueve.ejercicio1;

public class Main {
    public static void main(String[] args) {

        // Con el método siendo static
        /*Triangulo t1 = FlyweightFactory.obtenerTriangulo("rojo");
        Triangulo t2 = FlyweightFactory.obtenerTriangulo("azul");
        Triangulo t3 = FlyweightFactory.obtenerTriangulo("rojo");
        Triangulo t4 = FlyweightFactory.obtenerTriangulo("verde");
        Triangulo t5 = FlyweightFactory.obtenerTriangulo("azul");*/

        // Sin el método siendo static

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Triangulo t1 = flyweightFactory.obtenerTriangulo("rojo");
        Triangulo t2 = flyweightFactory.obtenerTriangulo("azul");
        Triangulo t3 = flyweightFactory.obtenerTriangulo("rojo");
        Triangulo t4 = flyweightFactory.obtenerTriangulo("verde");
        Triangulo t5 = flyweightFactory.obtenerTriangulo("azul");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}
