package com.grupo.integrador.persistence;

import com.grupo.integrador.logic.Libro;
import com.grupo.integrador.logic.Usuario;
import java.util.List;

public class ControladorPersistencia {

    private UsuarioJpaController usuarioJpaController;
    private LibroJpaController libroJpaController;

    public ControladorPersistencia() {
        this.usuarioJpaController = new UsuarioJpaController();
        this.libroJpaController = new LibroJpaController();
    }

    public List<Libro> getLibrosFromDB() {
        return libroJpaController.findLibroEntities();
    }

    public List<Usuario> getUsuariosFromDB() {
        return usuarioJpaController.findUsuarioEntities();
    }
}
