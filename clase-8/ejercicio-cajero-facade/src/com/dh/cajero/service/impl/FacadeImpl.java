package com.dh.cajero.service.impl;

import com.dh.cajero.model.Cuenta;
import com.dh.cajero.service.IFacade;

import java.util.Map;

public class FacadeImpl implements IFacade {

    private AutenticacionService autenticacionService;
    private CajaService cajaService;
    private CuentaService cuentaService;

    public FacadeImpl(AutenticacionService autenticacionService, CajaService cajaService,
                      CuentaService cuentaService) {
        this.autenticacionService = autenticacionService;
        this.cajaService = cajaService;
        this.cuentaService = cuentaService;
    }

    @Override
    public boolean retirarDinero(String identificacionCliente, String contrasena, Integer montoARetirar) {
        boolean dineroEntregado = false;
        if (autenticacionService.validarUsuarioYContrasena(identificacionCliente, contrasena)) {
            Cuenta cuenta = cuentaService.getCuenta(identificacionCliente);
            if (montoARetirar <= cuenta.getSaldo())
                dineroEntregado = (cajaService.entregarDinero(montoARetirar) == 0);
        }
        return dineroEntregado;
    }
}
