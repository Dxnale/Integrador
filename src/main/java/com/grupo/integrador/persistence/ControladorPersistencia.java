package com.grupo.integrador.persistence;

public class ControladorPersistencia {
    public UsuarioJpaController ujc;
    public LibroJpaController ljc;

    public ControladorPersistencia() {
        this.ujc = new UsuarioJpaController();
        this.ljc = new LibroJpaController();
    }

}
