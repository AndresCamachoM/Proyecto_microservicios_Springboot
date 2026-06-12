package com.clase.microservicios.actividad2;

import com.clase.microservicios.actividad.Auto;
import com.clase.microservicios.actividad.Moto;
import com.clase.microservicios.actividad.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {

        List<RecursosBibliograficos> objetos = new ArrayList<>();

        objetos.add(
                new RecursoDigital(
                        "Revista Criolla",
                        "Farid dieck",
                        2026,
                        "PDF",
                        10)
        );

        objetos.add(
                new LibroElectronico(
                        "El kijote de la mancha",
                        "Galileo Galiley",
                        2000,
                        "PDF",
                        4.3,
                        365,
                        4.5)
        );

        objetos.add(
                new LibroElectronico(
                        "Colombia mi abuelo y yo",
                        "Tony stark",
                        1500,
                        "PNG",
                        10,
                        100,
                        5.0)
        );

        RecursosBibliograficos masAntiguo = objetos.get(0);

        for (RecursosBibliograficos recursosBibliograficos : objetos) {

            recursosBibliograficos.obtenerResumen();

            if (recursosBibliograficos.getAnioPublicacion()
                    < masAntiguo.getAnioPublicacion()) {

                masAntiguo = recursosBibliograficos;
            }

            System.out.println("----------------------------");
        }

        System.out.println("\n=== RECURSO MÁS ANTIGUO ===");
        masAntiguo.obtenerResumen();
    }
}

