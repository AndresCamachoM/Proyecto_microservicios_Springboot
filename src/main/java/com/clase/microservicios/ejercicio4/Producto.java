package com.clase.microservicios.ejercicio4;

public class Producto implements Pagable, Serializable {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        return this.precio * (double)this.cantidad;
    }

    @Override
    public double calcularPago() {
        return 0;
    }

    public double aplicarDescuento(double porcentaje){
        double total = this.calcularTotal();
        return total - (total * porcentaje/100);
    }

    public String descripcion(){
        return String.format("Producto: %s | Precio $%.2f | Cantidad: %d", this.nombre, this.precio, this.cantidad);
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public String toString(){
        return this.descripcion();
    }

    @Override
    public String serializar() {
        return "";
    }
}