package com.grupo.integrador.logic;

public class Libro {

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getStock() {
        return stock;
    }

    public int getPrecio() {
        return precio;
    }

    private String titulo;
    private String autor;
    private String genero;
    private String editorial;
    private String fechaPublicacion;
    private int stock;
    private int precio;
}
