package com.clase.microservicios.actividad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main(){

    }

    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(
                new Auto(
                        "Toyota",
                        "Corolla",
                        2024,
                        4)
        );

        vehiculos.add(
                new Moto(
                        "Yamaha",
                        "MT-07",
                        2024,
                        689)
        );

        vehiculos.add(
                new AutoElectrico(
                        "Tesla",
                        "Model 3",
                        2025,
                        75,
                        80,
                        4)
        );

        for (Vehiculo vehiculo : vehiculos) {

            vehiculo.mostrarInformacion();

            System.out.println(
                    "Costo para 100 km: $"
                            + vehiculo.calcularCostoViaje(100)
            );

            System.out.println("----------------------------");
        }
    }
}