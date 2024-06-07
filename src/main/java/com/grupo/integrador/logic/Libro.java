package com.grupo.integrador.logic;

public class Libro {

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getCodigoEntrega() {
        return codigoEntrega;
    }

    public boolean isReservado() {
        return reservado;
    }

    public boolean isSolicitado() {
        return solicitado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void setSolicitado(boolean solicitado) {
        this.solicitado = solicitado;
    }

    private String titulo;
    private String autor;
    private String fechaPublicacion;
    private String codigoReserva;
    private String codigoEntrega;
    private boolean reservado;
    private boolean solicitado;

}
