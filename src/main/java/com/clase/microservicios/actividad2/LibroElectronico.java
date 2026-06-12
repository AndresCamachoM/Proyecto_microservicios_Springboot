package com.clase.microservicios.actividad2;

public class LibroElectronico extends RecursoDigital{
    private int numeroPaginas;
    private double tieneDRM;

    public LibroElectronico(String titulo, String autor, int anioPublicacion,
                          String formato,double tamanioMB, int numeroPaginas, double tieneDRM ) {

        super(titulo, autor, anioPublicacion,formato,tamanioMB);
        this.numeroPaginas = numeroPaginas;
        this.tieneDRM = tieneDRM;
    }

    @Override
    public void obtenerResumen() {
        System.out.println("=== Libro electronico ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("El libro tiene: " + numeroPaginas  +" Paginas");
        System.out.println("Tiene DRM: " + tieneDRM );
    }

    @Override
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
