package com.grupo.integrador.logic;

public class Usuario {

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    private String nombre;
    private String id;
    private boolean admin;

    public Usuario(String nombre, String id, boolean admin) {
        this.nombre = nombre;
        this.id = id;
        this.admin = admin;
    }

}
