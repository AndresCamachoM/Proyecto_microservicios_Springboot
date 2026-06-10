package com.clase.microservicios.actividad;

public class AutoElectrico extends VehiculoElectrico {

    private int numeroPuertas;

    public AutoElectrico(String marca,
                         String modelo,
                         int anio,
                         double capacidadBateria,
                         double nivelCarga,
                         int numeroPuertas) {

        super(marca, modelo, anio,
                capacidadBateria, nivelCarga);

        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoViaje(double distancia) {

        double consumoPorKm = 0.15;
        double precioKwh = 700;

        return distancia * consumoPorKm * precioKwh;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== AUTO ELECTRICO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Capacidad batería: " + capacidadBateria + " kWh");
        System.out.println("Nivel de carga: " + nivelCarga + "%");
    }
}