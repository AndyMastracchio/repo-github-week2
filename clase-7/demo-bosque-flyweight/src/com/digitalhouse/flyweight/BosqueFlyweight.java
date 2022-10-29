package com.digitalhouse.flyweight;

import com.digitalhouse.flyweight.ArbolFlyweight;
import com.digitalhouse.model.Arbol;

import java.util.ArrayList;
import java.util.List;

public class BosqueFlyweight {
    private static final List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(String tipoArbol, int alto, int ancho, String color) {
        Arbol arbol = ArbolFlyweight.getTreeType(tipoArbol, alto, ancho, color);
        arboles.add(arbol);
    }

    public List<Arbol> getArboles(){
        return arboles;
    }
}
