package com.clase.microservicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String numero;
    private List<Pagable> items = new ArrayList<>();

    public void agregarItem(Pagable item){
        items.add(item);
    }

    public double calcularGrandTotal(){
        return items.stream()
                .mapToDouble(Pagable::calcularTotal)
                .sum();
    }

    public void imprimir(){
        items.forEach(i ->
                System.out.println(i.resumen()));
        System.out.println("TOTAL: $"
                + calcularGrandTotal());
    }

    public Factura(String numero) {
        this.numero = numero;
    }
}