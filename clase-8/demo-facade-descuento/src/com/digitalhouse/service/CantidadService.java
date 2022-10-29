package com.digitalhouse.service;

public class CantidadService {
    public int descuento(int cuantos){
        if (cuantos>11){
            return 15;
        }
        else {
            return 0;
        }
    }
}
