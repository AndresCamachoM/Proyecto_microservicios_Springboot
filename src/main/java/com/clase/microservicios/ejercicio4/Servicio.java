package com.clase.microservicios.ejercicio4;

public class Servicio implements Pagable, Serializable {

    private String descripcion;
    private double precioHora;
    private double horasTrabajadas;

    public Servicio(String descripcion, double precioHora, double horasTrabajadas) {
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularTotal() {
        return this.precioHora = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return 0;
    }

    public double aplicarDescuento(double porcentaje) {
        double total = this.calcularTotal();
        return total - (total * porcentaje / 100);
    }

    @Override
    public String descripcion() {
        return String.format(
                "Servicio: %s | Precio/hora: $%.2f | Horas: %.1f | Total con descuento: $%.2f",
                this.descripcion,
                this.precioHora,
                this.horasTrabajadas,
                this.aplicarDescuento(10)
        );
    }

    public String serializar() {
        return String.format("{tipo:'Servicio', descripcion:'%s', precioHora:%.2f, horas:%.1f, total:%.2f}", descripcion, precioHora, horasTrabajadas, calcularTotal());
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecioHora(){
        return this.precioHora;
    }

    public double getHorasTrabajadas(){
        return this.horasTrabajadas;
    }

    public String toString(){
        return this.descripcion();
    }
}