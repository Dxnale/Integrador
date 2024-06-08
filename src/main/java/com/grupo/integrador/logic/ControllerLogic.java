package com.grupo.integrador.logic;

import com.grupo.integrador.persistence.ControladorPersistencia;
import java.util.List;

public class ControllerLogic {

    private ControladorPersistencia ctrlPers = new ControladorPersistencia();

    public List<Libro> getLibrosFromDB() {
        return ctrlPers.getLibrosFromDB();
    }

    public List<Usuario> getUsuariosFromDB() {
        return ctrlPers.getUsuariosFromDB();
    }

}
