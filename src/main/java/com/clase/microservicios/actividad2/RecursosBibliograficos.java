package com.clase.microservicios.actividad2;

import java.util.List;

public abstract class RecursosBibliograficos {

    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public RecursosBibliograficos(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public abstract void obtenerResumen();

    public abstract int getAnioPublicacion();
}
