package com.dh.cajero.model;

public class Cuenta {

    private String identificadorUsuario;
    private Integer saldo;

    public Cuenta(String identificadorUsuario, Integer saldo) {
        this.identificadorUsuario = identificadorUsuario;
        this.saldo = saldo;
    }

    public String getIdentificadorUsuario() {
        return identificadorUsuario;
    }

    public void setIdentificadorUsuario(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}
