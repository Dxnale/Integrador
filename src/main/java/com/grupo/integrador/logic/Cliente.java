package com.grupo.integrador.logic;

public class Cliente {

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public boolean esSocio() {
        return esSocio;
    }

    public Cliente(String nombre, String rut, boolean esSocio) {
        this.nombre = nombre;
        this.rut = rut;
        this.esSocio = esSocio;
    }

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
        this.esSocio = false;
    }

    private String nombre;
    private String rut;
    private boolean esSocio;

}
