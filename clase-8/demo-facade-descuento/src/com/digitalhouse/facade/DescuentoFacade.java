package com.digitalhouse.facade;

import com.digitalhouse.model.Producto;
import com.digitalhouse.model.Tarjeta;

public interface DescuentoFacade {
    int descuento(Tarjeta tarjeta, Producto producto, int cantidad);
}
