package com.grupo.integrador.logic;

public class Venta {

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTotal() {
        return total;
    }

    private Cliente cliente;
    private Libro libro;
    private int cantidad;
    private int total;
}
