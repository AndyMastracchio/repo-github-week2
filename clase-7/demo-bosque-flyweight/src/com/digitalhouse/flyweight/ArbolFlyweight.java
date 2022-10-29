package com.digitalhouse.flyweight;

import com.digitalhouse.model.Arbol;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArbolFlyweight {
    static Map<String, Arbol> arbolMap = new HashMap<>();

    public static Arbol getTreeType(final String tipoArbol, final int alto, final int ancho, final String color) {
        Arbol arbol = arbolMap.get(tipoArbol);

        if (Objects.isNull(arbol)) {
            arbol = new Arbol(alto, ancho, color, tipoArbol);
            arbolMap.put(tipoArbol, arbol);
            return arbol;
        }
        return arbol;
    }
}
