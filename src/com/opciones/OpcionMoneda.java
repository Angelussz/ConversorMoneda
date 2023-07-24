package com.opciones;


import com.moneda.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class OpcionMoneda {
    private List<String> conversorMoneda = new ArrayList<>();
    private Moneda[] arrayMonedas = {new Dolar(), new Euro(), new Libras(), new Yen(), new WonCoreano()};

    public OpcionMoneda() {
        conversorMoneda.add("De Soles a Dolar");
        conversorMoneda.add("De Soles a Euro");
        conversorMoneda.add("De Soles a Libras");
        conversorMoneda.add("De Soles a Yen");
        conversorMoneda.add("De Soles a Won Coreano");
        conversorMoneda.add("De Dolar a Soles");
        conversorMoneda.add("De Euro a Soles");
        conversorMoneda.add("De Libras a Soles");
        conversorMoneda.add("De Yen a Soles");
        conversorMoneda.add("De Won Coreano a Soles");
    }

    public List<String> getConversorMoneda() {
        return conversorMoneda;
    }

    public int MenuMoneda() {
        Object[] opcionesMoneda = this.conversorMoneda.toArray();
        Object seleccionMoneda =  JOptionPane.showInputDialog(
                null, // Componente padre
                "Elige que la moneda que desea convertir", // Mensaje
                "Lista de Monedas a Convertir", // Título
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje
                null, // Icono
                opcionesMoneda, // Arreglo de opciones
                opcionesMoneda[0] // Opción por defecto
        );
        return conversorMoneda.indexOf(seleccionMoneda);

    }
    public String ResultadoConversion(double valor, int indiceMoneda){
        if(indiceMoneda<5){
            return arrayMonedas[indiceMoneda].Convertir(valor);
        }
        else {
            return arrayMonedas[indiceMoneda-5].Convertir(valor);
        }
    }
}
