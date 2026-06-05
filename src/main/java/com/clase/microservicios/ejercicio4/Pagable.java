package com.clase.microservicios.ejercicio4;

public interface Pagable {

    double calcularPago();
    double aplicarDescuento(double porcentaje);
    String descripcion();
}
