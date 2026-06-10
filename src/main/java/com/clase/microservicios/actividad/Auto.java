package com.clase.microservicios.actividad;

public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String marca,
                String modelo,
                int anio,
                int numeroPuertas) {

        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoViaje(double distancia) {

        double costoPorKm = 150;

        return distancia * costoPorKm;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("----- AUTO -----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}