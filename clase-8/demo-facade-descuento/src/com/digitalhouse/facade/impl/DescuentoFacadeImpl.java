package com.digitalhouse.facade.impl;

import com.digitalhouse.facade.DescuentoFacade;
import com.digitalhouse.model.Producto;
import com.digitalhouse.model.Tarjeta;
import com.digitalhouse.service.CantidadService;
import com.digitalhouse.service.ProductoService;
import com.digitalhouse.service.TarjetaService;

public class DescuentoFacadeImpl implements DescuentoFacade {

    private TarjetaService tarjetaService;
    private ProductoService productoService;
    private CantidadService cantidadService;

    public DescuentoFacadeImpl() {
        tarjetaService = new TarjetaService();
        productoService = new ProductoService();
        cantidadService = new CantidadService();
    }

    @Override
    public int descuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        int desc = 0;
        desc = desc + cantidadService.descuento(cantidad);
        desc = desc + productoService.descuento(producto);
        desc = desc + tarjetaService.descuento(tarjeta);
        return desc;
    }
}
