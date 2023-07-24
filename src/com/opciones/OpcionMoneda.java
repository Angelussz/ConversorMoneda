package com.opciones;


import java.util.ArrayList;
import java.util.List;

public class OpcionMoneda {
    List<String> listaMonedas = new ArrayList<>();

    public OpcionMoneda() {
        listaMonedas.add("Soles a dolar");
        listaMonedas.add("Soles a Euro");
        listaMonedas.add("Soles a Libras");
        listaMonedas.add("Soles a Yen");
        listaMonedas.add("Soles a Won Coreano");
    }
}
