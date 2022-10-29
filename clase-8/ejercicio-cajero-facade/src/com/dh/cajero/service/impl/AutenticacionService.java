package com.dh.cajero.service.impl;

import java.util.Random;

public class AutenticacionService {


    public Boolean validarUsuarioYContrasena(String usuario, String contrasena) {
        System.out.println("Validando usuario: " + usuario);
        boolean datosValidos = false;
        if (usuario != null & contrasena != null){
            datosValidos = validar(usuario, contrasena);
        }
        return datosValidos;
    }

    private boolean validar(String usuario, String contrasena) {
        return new Random().nextBoolean();
    }
}
