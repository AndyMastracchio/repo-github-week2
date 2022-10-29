package com.dh.cajero.service;

public interface IFacade {
    boolean retirarDinero(String identificacionCliente, String contrasena, Integer montoARetirar);
}
