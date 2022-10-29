package com.dh.cajero.service.impl;
import com.dh.cajero.model.Cuenta;

import java.util.HashMap;
import java.util.Map;

public class CuentaService {

    public Cuenta getCuenta(String identificadorUsuario){
        System.out.println("Buscando cuenta..");
        return new Cuenta(identificadorUsuario,10000);
    }
}
