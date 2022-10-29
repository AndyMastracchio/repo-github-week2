package com.digitalhouse;

import com.digitalhouse.facade.DescuentoFacade;
import com.digitalhouse.facade.impl.DescuentoFacadeImpl;
import com.digitalhouse.model.Producto;
import com.digitalhouse.model.Tarjeta;
import com.digitalhouse.service.CantidadService;
import com.digitalhouse.service.ProductoService;
import com.digitalhouse.service.TarjetaService;

public class Supermercado {
    public static void main(String[] args) {
        DescuentoFacade descuentoFacade = new DescuentoFacadeImpl();
        Tarjeta tarjeta = new Tarjeta("12412412412", "NuBank");
        Producto producto = new Producto("arvejas", "Lata");

        System.out.println("Descuento: " + descuentoFacade.descuento(tarjeta, producto, 15) + "%");


    }


}
