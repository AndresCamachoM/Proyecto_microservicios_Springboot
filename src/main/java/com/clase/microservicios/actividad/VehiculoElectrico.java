package com.clase.microservicios.actividad;

public abstract class VehiculoElectrico extends Vehiculo {

    protected double capacidadBateria;
    protected double nivelCarga;

    public VehiculoElectrico(String marca,
                             String modelo,
                             int anio,
                             double capacidadBateria,
                             double nivelCarga) {

        super(marca, modelo, anio);
        this.capacidadBateria = capacidadBateria;
        this.nivelCarga = nivelCarga;
    }

    public void cargarBateria(double porcentaje) {

        nivelCarga += porcentaje;

        if (nivelCarga > 100) {
            nivelCarga = 100;
        }
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public double getNivelCarga() {
        return nivelCarga;
    }
}