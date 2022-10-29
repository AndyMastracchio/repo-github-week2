package com.dh.cajero.service.impl;

import java.util.Random;

public class CajaService {

    public int entregarDinero(Integer monto) {
        int dineroAEntregar = 0;
        if (hayEfectivo(monto)) {
            dineroAEntregar = monto;
        }
        System.out.println("Entregando: "+ monto);
        return dineroAEntregar;
    }

    private boolean hayEfectivo(int monto) {
        return new Random().nextBoolean();
    }
}
