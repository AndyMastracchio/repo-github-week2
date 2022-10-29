package com.digitalhouse;

import com.digitalhouse.flyweight.ComputadoraFlyweightFactory;
import com.digitalhouse.model.Computadora;

public class Main {
    public static void main(String[] args) {
        ComputadoraFlyweightFactory flyweightFactory = new ComputadoraFlyweightFactory();
        Computadora mac1 = flyweightFactory.getComputadora(16, 500);
        Computadora windows1 = flyweightFactory.getComputadora(2, 256);
        Computadora mac2 = flyweightFactory.getComputadora(16, 500);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(windows1.toString());
    }
}
