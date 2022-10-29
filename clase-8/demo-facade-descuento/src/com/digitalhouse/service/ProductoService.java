package com.digitalhouse.service;

import com.digitalhouse.model.Producto;

public class ProductoService {
    public int descuento(Producto unProducto){
        if (unProducto.getTipo().compareTo("Lata")==0) {
            return 10;
        }
        else
        {
            return 0;
        }
    }
}
