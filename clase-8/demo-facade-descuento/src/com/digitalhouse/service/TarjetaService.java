package com.digitalhouse.service;

import com.digitalhouse.model.Tarjeta;

public class TarjetaService {

    public int descuento(Tarjeta unaTarjeta){
        if (unaTarjeta.getBanco().compareTo("Star Bank") == 0) {
            return 20;
        }
        else {
            return 0;
        }
    }
}
