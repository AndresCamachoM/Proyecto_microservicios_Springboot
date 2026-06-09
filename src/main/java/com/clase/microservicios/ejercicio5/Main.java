package com.clase.microservicios.ejercicio5;

public class Main {

    public Main(){

    }

    public static void main(String[] args) {
        Factura factura = new Factura("F-001");
        factura.agregarItem(new Producto(
                "Laptop", 99.99, 1));
        factura.agregarItem(new Producto(
                "Mouse", 20.99, 2));

        factura.agregarItem(new Servicio(
                "Soporte tecnico", 100,3));

        factura.imprimir();
    }
}