package com.clase.microservicios.ejercicio4;

public class Main {

    public Main(){

    }

    public static void main(String[] args){
        System.out.println("Ejercicio 4: Factura con polimorfismo y Serializacion");
        Producto laptop = new Producto("Laptop",200.00F, 2);
        Producto teclado = new Producto("Teclado Gamer", 500.00F, 2);
        Producto monitor = new Producto("Monitor curvo", 61200.00F, 2);
        Servicio soporte = new Servicio("Windos", 700.00F, 2);
        Servicio desarrollo = new Servicio("Industries 345", 111200.00F, 2);

        Factura factura = new Factura("F001", "Juan Perez");
        factura.agregarItem(laptop);
        factura.agregarItem(teclado);
        factura.agregarItem(monitor);
        factura.agregarItem(soporte);
        factura.agregarItem(desarrollo);
        factura.imprimirFactura();
        factura.serializarItems();

        Pagable [] elementos = new Pagable[]{laptop,teclado,monitor,soporte,desarrollo};

        for (Pagable elemento : elementos){
            System.out.print("\n Descripcion: " + elemento.descripcion());
            System.out.print("Pago a realizar: $" + elemento.calcularPago());
        }
    }
}
