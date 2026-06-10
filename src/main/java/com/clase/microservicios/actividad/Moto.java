package com.clase.microservicios.actividad;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca,
                String modelo,
                int anio,
                int cilindrada) {

        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCostoViaje(double distancia) {

        double costoPorKm = 100;

        return distancia * costoPorKm;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== MOTO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}