package com.test;

import javax.swing.*;

public class TestSeleccion {
    public static void main(String[] args) {
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione opcion",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,    // null para icono por defecto.
                new Object[] { "opcion 1", "opcion 2", "opcion 3" },   // null para YES, NO y CANCEL
                "opcion 1");
        System.out.println(seleccion);
//        if (seleccion != -1)
//            System.out.println("seleccionada opcion " + (seleccion + 1));
    }
}
