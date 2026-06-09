package com.clase.microservicios.ejercicio5;

public interface Pagable {
    double calcularTotal();
    double aplicarDescuento(double pct);
    default String resumen(){
        return " Total: $" + calcularTotal();
    }
}