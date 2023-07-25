package com.opciones;

import javax.swing.*;
import java.util.List;

public class Ventanas {
    public Double InputDataDouble(String mensaje){
        while (true){
            try {
                return Double.valueOf(JOptionPane.showInputDialog(mensaje));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Por favor ingrese valores numericos ");
            }
            catch (NullPointerException e){
                return null;
            }
        }
    }
    public int VentanaMenu(List<String> opciones,String mensaje, String titulo ){
        Object[] opcionesObjeto = opciones.toArray();
        Object seleccion =  JOptionPane.showInputDialog(
                null, // Componente padre
                mensaje, // Mensaje
                titulo, // Título
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje
                null, // Icono
                opcionesObjeto, // Arreglo de opciones
                opcionesObjeto[0] // Opción por defecto
        );
        return opciones.indexOf(seleccion);
    }
}
