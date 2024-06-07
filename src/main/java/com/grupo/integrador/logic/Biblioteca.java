package com.grupo.integrador.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Biblioteca {

    public List<Libro> getLibros() {
        return libros;
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public Queue<Libro> getColaEspera() {
        return colaEspera;
    }
    public Stack<Libro> getEliminados() {
        return eliminados;
    }
    public List<Libro> getLibrosReservados() {
        List<Libro> reservados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.isReservado()) {
                reservados.add(libro);
            }
        }

        return reservados;
    }
    public List<Libro> getLibrosSolicitados() {
        List<Libro> solicitados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.isSolicitado()) {
                solicitados.add(libro);
            }
        }

        return solicitados;
    }


    public boolean agregarLibro(Libro libro){
        if (!libros.contains(libro)){
            libros.add(libro);
            return true;
        }
        return false;
    }

    public boolean eliminarLibro(Libro libro){
        if (libros.contains(libro)){
            libros.remove(libro);
            eliminados.push(libro);
            return true;
        }
        return false;
    }
    public boolean deshacerEliminacion() {
        if (!eliminados.isEmpty()) {
            libros.add(eliminados.pop());
            return true;
        }
        return false;
    }

    public boolean reservarLibro(Libro libro) {
        if (libros.contains(libro)) {
            libro.setReservado(true);
            return true;
        }
        return false;
    }
    public boolean cancelarReserva(Libro libro) {
        if (libros.contains(libro)) {
            libro.setReservado(false);
            return true;
        }
        return false;
    }

    public boolean solicitarLibro(Libro libro) {
        if (libros.contains(libro)) {
            libro.setSolicitado(true);
            return true;
        }
        return false;
    }
    public boolean cancelarSolicitud(Libro libro){
        if (libros.contains(libro)){
            libro.setSolicitado(false);
            return true;
        }
        return false;
    }

    public boolean agregarUsuario(Usuario usuario){
        if (!usuarios.contains(usuario)){
            usuarios.add(usuario);
            return true;
        }
        return false;
    }
    public boolean usuarioExiste(String nombre, String id){
        for (Usuario usuario : usuarios){
            if (usuario.getNombre().equals(nombre) && usuario.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuario(String nombre, String id){
        for (Usuario usuario : usuarios){
            if (usuario.getNombre().equals(nombre) && usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }
    
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private Queue<Libro> colaEspera;
    private Stack<Libro> eliminados;
}
