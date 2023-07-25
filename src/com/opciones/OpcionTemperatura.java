package com.opciones;


import com.moneda.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class OpcionTemperatura {
    private List<String> conversorTemperatura = new ArrayList<>();

    public OpcionTemperatura() {
        conversorTemperatura.add("Celcius a Farenheid");
        conversorTemperatura.add("Celcius a Kelvin");
        conversorTemperatura.add("Farenheid a Celcius");
        conversorTemperatura.add("Farenheid a Kelvin");
        conversorTemperatura.add("Kelvin a Celcius");
        conversorTemperatura.add("Kelvin a Farenheid");
    }
    public int MenuTemperatura() {
        return new Ventanas().VentanaMenu(conversorTemperatura,"Elige de que a que temperatura deseas convertir","Coversor Temperatura");

    }
    public String conversorMensaje(int indice){
        return conversorTemperatura.get(indice);
    }
}
