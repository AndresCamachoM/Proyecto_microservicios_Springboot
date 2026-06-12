package com.clase.microservicios.actividad2;

public class RecursoDigital extends  RecursosBibliograficos{

    private String formato;
    private double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion,
                          String formato,double tamanioMB ) {

        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    @Override
    public void obtenerResumen() {
        System.out.println("=== Recurso Digital ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("Formato del recurso: " + formato );
        System.out.println("Tamaño del recurso: " + tamanioMB + " en MB");
    }

    @Override
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
