package com.dh.cajero;

import com.dh.cajero.service.IFacade;
import com.dh.cajero.service.impl.AutenticacionService;
import com.dh.cajero.service.impl.CajaService;
import com.dh.cajero.service.impl.CuentaService;
import com.dh.cajero.service.impl.FacadeImpl;

public class Main {
    public static void main(String[] args) {
        IFacade cajeroFacade = new FacadeImpl(new AutenticacionService(),new CajaService(), new CuentaService());
        boolean dineroEntregado = cajeroFacade.retirarDinero("40234567","qwerty",1000);
        if (!dineroEntregado) {
            System.out.println("No pudimos entregar dinero");
        }
    }
}
