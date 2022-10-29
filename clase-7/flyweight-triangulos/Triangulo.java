package com.digitalhouse.integradora.nueve.ejercicio1;

public class Triangulo {

    private String color;
    private int tamanio;

    public Triangulo(String color, int tamanio) {
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "color='" + color + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
